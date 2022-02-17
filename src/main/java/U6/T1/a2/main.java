package U6.T1.a2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Actividad2: Diseñar una aplicación que pida al usuario su nombre y edad.
// Estos datos deben guardarse en el fichero "datos.txt".
// Si este fichero existe, debe borrarse su contenido, y en caso de no existir, debe crearse.
public class main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el nombre: ");
    String nombre = teclado.next();
    System.out.println("Introduce la edad: ");
    Integer edad = teclado.nextInt();
    String cad = nombre + " ".concat(edad.toString());
    try {
      BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt"));
      for (int i = 0; i < cad.length(); i++) {
        out.write(cad.charAt(i));
      }
      out.newLine();
      out.close();
    } catch (IOException ex) {
      System.out.println("Error");
    }
  }
}
