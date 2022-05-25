package U8.Perez_Castano_U8_Entregable;

//import com.google.gson.Gson;
import org.w3c.dom.*;
import org.w3c.dom.Comment;
import org.xml.sax.SAXException;

import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessPosts {
  Document doc;

  public void parseDOM(String filename) {

    try {
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      this.doc = db.parse(new File(filename));

    } catch (ParserConfigurationException | SAXException | IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public void addPost(Post post) {
    try {

      // Obtenemos la referencia al objeto Document
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();

      // Parseamos el documento XML para tenerlo en memoria cargado
      Document doc = db.parse(new File("src/main/java/U8/Perez_Castano_U8_Entregable/posts.xml"));
      // Obtenemos el nodo raíz
      Node root = doc.getDocumentElement();

      // Nodo texto de salto de línea que voy a utilizar posteriormente
      Text saltoLinea = doc.createTextNode("\n");

      // 1 - Uso de insertBefore()
      // Voy a insertar un nodo comentario antes del primer post
      Comment comentario = doc.createComment("Empieza la lista de posts");

      // Obtengo una referencia a la primera ocurrencia de persona
      Element primerPost = (Element) doc.getElementsByTagName("post").item(0);

      root.insertBefore(comentario, primerPost);
      // 2 - Uso de appendChild()

      // Creo la etiqueta padre post, le doy nombre
      Element elementoPost = doc.createElement("post");

      // Creo la etiqueta hija title y le doy valor
      Element title = doc.createElement("title");
      title.setTextContent(post.getTitle());

      // Creo la etiqueta hija link y le doy valor, junto con las demás
      Element link = doc.createElement("link");
      link.setTextContent(post.getLink());

      Element description = doc.createElement("description");
      description.setTextContent(post.getDescription());

      Element pubdapte = doc.createElement("pubDate");
      pubdapte.setTextContent(post.getPubdate());

      Element guid = doc.createElement("guid");
      guid.setAttribute("isPermaLink", "true");

      guid.setTextContent(post.getGuid());

      // Construyo toda la estructura general de la etiqueta

      elementoPost.appendChild(title);
      elementoPost.appendChild(link);
      elementoPost.appendChild(description);
      elementoPost.appendChild(pubdapte);
      elementoPost.appendChild(guid);

      // Añadimos ese nuevo nodo al root
      root.appendChild(elementoPost);

      // PROCEDEMOS A VOLCAR TODAS LAS MODIFICACIONES, TODO ÉL ARBOL AL FICHERO

      // Obtenemos el objeto transformer
      TransformerFactory tf = TransformerFactory.newInstance();
      Transformer transformer = tf.newTransformer();

      // Configuración del transformer
      // Podéis ver toda la lista de propiedes aquí
      // https://docs.oracle.com/javase/7/docs/api/javax/xml/transform/OutputKeys.html
      transformer.setOutputProperty(OutputKeys.INDENT, "yes");
      transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
      transformer.setOutputProperty(OutputKeys.METHOD, "xml");
      transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

      // Creación del origen DOMSource
      DOMSource origenDOM = new DOMSource(root);

      // Creación del fichero que va a ser mi destino
      File nuevoPosts = new File("src/main/java/U8/Perez_Castano_U8_Entregable/posts.xml");
      StreamResult destino = new StreamResult(nuevoPosts);

      // Hacemos la transformación que en nuestro caso es la escritura
      transformer.transform(origenDOM, destino);

    } catch (ParserConfigurationException
        | IOException
        | SAXException
        | TransformerException
        | DOMException e) {
      System.out.println(e.getStackTrace());
    }
  }

  public List<Post> getPosts() {
    List<Post> postList = new ArrayList<>();

    NodeList nl = doc.getElementsByTagName("post");
    for (int i = 0; i < nl.getLength(); i++) {

      String title = "";
      String link = "";
      String description = "";
      String pubdate = "";
      String guid = "";

      NodeList nl2 = nl.item(i).getChildNodes();
      for (int j = 0; j < nl2.getLength(); j++) {
        if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) {
          Element tag = (Element) nl2.item(j);
          if (tag.getTagName().equalsIgnoreCase("title")) {
            title = tag.getTextContent();
          } else if (tag.getTagName().equalsIgnoreCase("link")) {
            link = tag.getTextContent();
          } else if (tag.getTagName().equalsIgnoreCase("description")) {
            description = tag.getTextContent();
          } else if (tag.getTagName().equalsIgnoreCase("pubdate")) {
            pubdate = tag.getTextContent();
          } else if (tag.getTagName().equalsIgnoreCase("guid")) {
            guid = tag.getTextContent();
          }
        }
      }

      postList.add(new Post(title, link, description, pubdate, guid));
    }
    return postList;
  }

  public void convertToJSON() {
    //Gson gson = new Gson();
    //String json_completo = gson.toJson(getPosts());
    try {
      BufferedWriter out =
          new BufferedWriter(
              new FileWriter("src/main/java/U8/Perez_Castano_U8_Entregable/posts.json", true));
      //out.write(json_completo);
      out.close();
    } catch (IOException ex) {
      System.out.println("Error con el archivo.");
    }
  }

  public Integer numPostsStax(String filename) {

    Integer postN = 0;

    try {
      XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
      XMLEventReader xmlReader =
          xmlInputFactory.createXMLEventReader(
              new FileInputStream(filename));

      while (xmlReader.hasNext()) {

        XMLEvent xmlEvent = xmlReader.nextEvent();

        if (xmlEvent.isStartElement()) {

          StartElement startTag = xmlEvent.asStartElement();

          if (startTag.getName().toString().equals("post")) {
            postN++;
          }
        }
      }
    } catch (XMLStreamException | FileNotFoundException e) {
      System.out.println(e.getMessage());
    }
    return postN;
  }
}
