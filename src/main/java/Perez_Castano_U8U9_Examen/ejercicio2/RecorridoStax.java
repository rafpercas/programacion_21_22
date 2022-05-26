package Perez_Castano_U8U9_Examen.ejercicio2;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class RecorridoStax {
    public static void mostrarPilotoMasCampeonatos() {
        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader =
                    xmlInputFactory.createXMLEventReader(new FileInputStream("src/main/java/Perez_Castano_U8U9_Examen/ejercicio1/pilotos.xml"));

            String pmcNombre = "";
            int pmcEdad = 0;
            String pmcEscuderia = "";
            int pmcCampeonatos = 0;

            String auxNombre = "";
            int auxEdad = 0;
            String auxEscuderia = "";
            int auxCampeonatos = 0;

            String tagActual = "";

            while (xmlReader.hasNext()) {

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {

                    StartElement startTag = xmlEvent.asStartElement();

                    tagActual = startTag.getName().getLocalPart();

                } else if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        if (!tagActual.equals("")) {

                            switch (tagActual) {
                                case "nombre":
                                    auxNombre = texto.getData();
                                    break;
                                case "edad":
                                    auxEdad = Integer.parseInt(texto.getData());
                                    break;
                                case "escuderia":
                                    auxEscuderia = texto.getData();
                                    break;
                                case "campeonatos":
                                    auxCampeonatos = Integer.parseInt(texto.getData());
                                    break;
                            }
                        }
                    }
                } else if (xmlEvent.isEndElement()) {

                    EndElement endtag = xmlEvent.asEndElement();

                    if (endtag.getName().getLocalPart().equals("piloto")) {

                        if (auxCampeonatos > pmcCampeonatos) {

                            pmcNombre = auxNombre;
                            pmcEdad = auxEdad;
                            pmcEscuderia = auxEscuderia;
                            pmcCampeonatos = auxCampeonatos;
                        }

                        auxNombre = "";
                        auxEdad = 0;
                        auxEscuderia = "";
                        auxCampeonatos = 0;
                    }
                }
            }

            System.out.println("El piloto con más campeonatos es:");
            System.out.println("Nombre: " + pmcNombre);
            System.out.println("Edad: " + pmcEdad);
            System.out.println("Escudería: " + pmcEscuderia);
            System.out.println("Campeonatos: " + pmcCampeonatos);

        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void mostrarNumPilotosEscuderia(String escuderia) {

        Integer count = 0;

        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader =
                    xmlInputFactory.createXMLEventReader(new FileInputStream("src/main/java/Perez_Castano_U8U9_Examen/ejercicio1/pilotos.xml"));

            while (xmlReader.hasNext()) {
                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (texto.getData().equalsIgnoreCase(escuderia)) {
                        count++;
                    }
                }
            }

            System.out.println(count + " pilotos pertenecen a la escudería " + escuderia + ".");

        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }
    }
}
