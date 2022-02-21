package U6.T1.a6;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Actividad6: Un libro de firmas es útil para recoger todas las personas que
// han pasado por un determinado lugar. Crear una aplicación que permita mostrar el
// libro de firmas o insertar
// un nuevo nombre (comprobando que no se encuentre repetido). Llamaremos al fichero firmas.txt.
public class main {
  public static void main(String[] args) {
    String texto = "";
    try {
      FileReader in = new FileReader("firmas.txt");
      int c = in.read();
      while (c != -1) {
        texto += (char) c;
        c = in.read();
      }
      in.close();
    } catch (IOException ex) {
      System.out.println(ex.getMessage());
    }
    System.out.println(texto);

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el nombre: ");
    String nombre = teclado.next();
    String cad = nombre;
    boolean quiereEscribir = true;
    System.out.println("Quiere firmar?");
    String firmaBool = teclado.next();

    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("firmas.txt"));

      out.write(cad);
      out.newLine();
      out.close();
    } catch (IOException ex) {
      System.out.println("Error");
    }
  }
}
