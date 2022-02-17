package U6.T1.a3;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Actividad3: Crear un programa que duplique el conenido de un fichero. Realizar dos versiones:
//
//    Duplicaremos el fichero original.txt en uno que se llame copia.txt
//    Pedir el nombre del fichero fuente y duplicarlo en un fichero con el mismo nombre con el
// prefijo "copia_de".
public class main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la ruta del fichero: ");
    String ruta = teclado.next();
    String texto="";
    try {
      FileReader in = new FileReader(ruta);
      int c = in.read();
      while (c != -1) {
        texto += (char) c;
        c = in.read();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println("Error al leer el archivo.");
    }
    System.out.println(texto);
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("copia.txt"));
      for (int i = 0; i < texto.length(); i++) {
        out.write(texto.charAt(i));
      }
      out.newLine();
      out.close();
    } catch (IOException ex) {
      System.out.println("Error");
    }
  }
}
