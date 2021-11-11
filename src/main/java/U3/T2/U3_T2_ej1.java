package U3.T2;

import java.util.Scanner;

// Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
public class U3_T2_ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una palabra: ");
    String palabra1 = teclado.next();
    System.out.println("Introduce otra palabra: ");
    String palabra2 = teclado.next();
    if (palabra1.length() > palabra2.length()) {
      System.out.println(palabra1 + " es más larga que " + palabra2);
    } else {
      System.out.println(palabra2 + " es más larga que " + palabra1);
    }
  }
}
