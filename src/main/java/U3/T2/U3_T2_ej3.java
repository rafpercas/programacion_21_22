package U3.T2;

import java.util.Scanner;

// Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición
// central es o no un espacio.
public class U3_T2_ej3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una frase: ");
    String frase = teclado.nextLine();
    char caracter = frase.charAt(frase.length() / 2);
    System.out.println(caracter);
    String carac = String.valueOf(caracter);
    if (carac.equals(" ")) {
      System.out.println("El caracter de la posición central es un espacio.");
    } else {
      System.out.println("El caracter de la posición central no es un espacio.");
    }
  }
}
