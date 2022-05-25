package U9.MySQL.examenpruebau8u9;


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModificacionDOM {
    Document doc;
    public void parseDOM(String filename){
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            this.doc = db.parse(new File(filename));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void addLibro(Libro libro) {
        try {

            // Obtenemos la referencia al objeto Document
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();

            // Parseamos el documento XML para tenerlo en memoria cargado
            Document doc = db.parse(new File("programacion_21_22/src/main/java/U9/MySQL/examenpruebau8u9/ejercicio.xml"));
            // Obtenemos el nodo raíz
            Node root = doc.getDocumentElement();

            // Nodo texto de salto de línea que voy a utilizar posteriormente
            Text saltoLinea = doc.createTextNode("\n");

            // 1 - Uso de insertBefore()

            // 2 - Uso de appendChild()

            // Creo la etiqueta padre libro, le doy nombre
            Element elementoLibro = doc.createElement("libro");

            // Creo la etiqueta hija title y le doy valor
            Element titulo = doc.createElement("titulo");
            titulo.setTextContent(libro.getTitulo());

            // Creo la etiqueta hija link y le doy valor, junto con las demás
            Element autor = doc.createElement("autor");
            autor.setTextContent(libro.getAutor());

            Element editorial = doc.createElement("editorial");
            editorial.setTextContent(libro.getEditorial());

            Element paginas = doc.createElement("paginas");
            paginas.setTextContent(libro.getPaginas());

            Element paisOrigen = doc.createElement("paisOrigen");
            paisOrigen.setTextContent(libro.getPaisOrigen());


            // Construyo toda la estructura general de la etiqueta

            elementoLibro.appendChild(titulo);
            elementoLibro.appendChild(autor);
            elementoLibro.appendChild(editorial);
            editorial.appendChild(paisOrigen);
            elementoLibro.appendChild(paginas);


            // Añadimos ese nuevo nodo al root
            root.appendChild(elementoLibro);

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
            File nuevoLibros = new File("programacion_21_22/src/main/java/U9/MySQL/examenpruebau8u9/ejercicio2.xml");
            StreamResult destino = new StreamResult(nuevoLibros);

            // Hacemos la transformación que en nuestro caso es la escritura
            transformer.transform(origenDOM, destino);

        } catch (ParserConfigurationException
                | IOException
                | SAXException
                | TransformerException
                | DOMException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public List<Libro> getLibros() {
        List<Libro> libroList = new ArrayList<>();

        NodeList nl = doc.getElementsByTagName("libro");
        for (int i = 0; i < nl.getLength(); i++) {

            String titulo = "";
            String autor = "";
            String editorial = "";
            String paginas = "";


            NodeList nl2 = nl.item(i).getChildNodes();
            for (int j = 0; j < nl2.getLength(); j++) {
                if (nl2.item(j).getNodeType() == Node.ELEMENT_NODE) {
                    Element tag = (Element) nl2.item(j);
                    if (tag.getTagName().equalsIgnoreCase("titulo")) {
                        titulo = tag.getTextContent();
                    } else if (tag.getTagName().equalsIgnoreCase("autor")) {
                        autor = tag.getTextContent();
                    } else if (tag.getTagName().equalsIgnoreCase("editorial")) {
                        editorial = tag.getTextContent();
                    } else if (tag.getTagName().equalsIgnoreCase("paginas")) {
                        paginas = tag.getTextContent();
                    }
                }
            }

          //  libroList.add(new Libro(titulo, autor, editorial, ,));
        }
        return libroList;
    }

}
