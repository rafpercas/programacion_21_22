package U9.U8_XML_JSON.EjerciciosClase;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CargarArrayList {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        List<Persona> personas = new ArrayList<>();

        try {
            db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("personas.xml"));

            NodeList nl = doc.getElementsByTagName("persona");
            for (int i = 0; i < nl.getLength(); i++) {

                int id=0;
                int edad=0;
                String nombre="";

                Element e = (Element) nl.item(i);

                if (e.hasAttributes()) {

                    //Obtengo los atributos y los muestro
                    NamedNodeMap nodeMap = e.getAttributes();
                    for (int j = 0; j < nodeMap.getLength() ; j++) {
                        Node node = nodeMap.item(j);
                        Attr atributo = e.getAttributeNode(node.getNodeName());
                        if (atributo.getNodeName().equals("id")) {
                            id = Integer.parseInt(atributo.getValue());
                        }
                    }
                }

                NodeList nl2 = nl.item(i).getChildNodes();
                for (int j = 0; j < nl2.getLength(); j++) {
                    if (nl2.item(j).getNodeType()==Node.ELEMENT_NODE) {
                        Element tag = (Element) nl2.item(j);
                        if (tag.getTagName().equals("nombre")) {
                            nombre = tag.getTextContent();
                        } else {
                            edad = Integer.parseInt(tag.getTextContent());
                        }
                    }
                }

                personas.add(new Persona(id,nombre,edad));

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(personas);
    }
}
