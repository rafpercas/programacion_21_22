package U6.T1.a1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Actividad1: Realizar un programa que solicite al usuario el nombre de un fichero
// de texto y muestre su contenido en pantalla.
// Si no se proporciona ningún nombre de fichero, la aplicación utilizará por defecto "prueba.txt".
public class main {
  public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
    String ruta = "";
    System.out.println("Introduce la ruta del fichero: ");
    ruta = teclado.next();
    if (ruta.equals("")) {
      ruta = "prueba.txt";
    }
    String texto = "";

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
  }
}
