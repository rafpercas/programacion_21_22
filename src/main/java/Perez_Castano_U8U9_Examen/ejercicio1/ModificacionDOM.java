package Perez_Castano_U8U9_Examen.ejercicio1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
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
import java.util.Scanner;

public class ModificacionDOM {
    private static Document doc;

    public static void parseDOM() {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(new File("src/main/java/Perez_Castano_U8U9_Examen/ejercicio1/pilotos.xml"));

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void addPiloto() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca el nombre: ");
        String newNombre = teclado.nextLine();

        System.out.print("Introduzca la edad: ");
        int newEdad = teclado.nextInt();
        teclado.nextLine();

        System.out.print("Introduzca la escuderia: ");
        String newEscuderia = teclado.nextLine();

        System.out.print("Introduzca el número de campeonatos: ");
        int newCampeonatos = teclado.nextInt();
        teclado.nextLine();

        Element root = doc.getDocumentElement();

        Element nuevoPiloto = doc.createElement("piloto");

        root.appendChild(nuevoPiloto);

        Element nombre = doc.createElement("nombre");
        nuevoPiloto.appendChild(nombre);
        nombre.setTextContent(newNombre);

        Element edad = doc.createElement("edad");
        nuevoPiloto.appendChild(edad);
        edad.setTextContent(Integer.toString(newEdad));

        Element escuderia = doc.createElement("escuderia");
        nuevoPiloto.appendChild(escuderia);
        escuderia.setTextContent(newEscuderia);

        Element campeonatos = doc.createElement("campeonatos");
        nuevoPiloto.appendChild(campeonatos);
        campeonatos.setTextContent(Integer.toString(newCampeonatos));
    }
    public static void insertarNodoOrigenPiloto() {
        Element root = doc.getDocumentElement();

        NodeList nl = root.getChildNodes();

        for (int i = 0; i < nl.getLength(); i++) {

            if (nl.item(i).getNodeType() == Node.ELEMENT_NODE) {

                Element e = (Element) nl.item(i);

                if (e.getTagName().equalsIgnoreCase("piloto")) {

                    Element paisOrigen = doc.createElement("pais");
                    paisOrigen.setTextContent("USA");
                    e.appendChild(paisOrigen);
                }


            }
        }
    }
    public static void crearNuevoFichero() {

        try {

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(doc);

            File ejercicio1 = new File("src/main/java/Perez_Castano_U8U9_Examen/ejercicio1/ejercicio1.xml");
            StreamResult destino = new StreamResult(ejercicio1);

            transformer.transform(origenDOM, destino);

        } catch (TransformerException e) {
            System.out.println(e.getMessage());
        }
    }
}
