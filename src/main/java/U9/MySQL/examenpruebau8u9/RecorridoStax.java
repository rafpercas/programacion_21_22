package U9.MySQL.examenpruebau8u9;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {
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

                    if (startTag.getName().toString().equals("libro")) {
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
