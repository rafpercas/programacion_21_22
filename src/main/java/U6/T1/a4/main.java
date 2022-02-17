package U6.T1.a4;

import java.io.FileReader;
import java.io.IOException;

// Actividad4: Realizar un programa que lea un fichero de texto llamado carta.txt, tenemos
// que contar los caracteres, las líneas y las palabras. Para facilitar
// el procesamiento supondremos que cada palabra está separada de otra por un único espacio en
// blanco.
public class main {
  public static void main(String[] args) {
    Integer numCaracteres = 0;
    Integer numLineas = 0;
    Integer numPalabras = 0;
    try {
      FileReader in = new FileReader("/home/rafpercas/carta.txt");
      int c = in.read();
      String texto = "";
      while (c != -1) {
        texto += (char) c;
        c = in.read();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println("Error al leer el archivo.");
    }
    System.out.println(numCaracteres);
  }
}
