package U3.T2;

import java.util.Scanner;

// Diseñar una actividad que
// pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.
public class U3_T2_ej4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una frase: ");
    String frase = teclado.nextLine();
    int espacios = 0;
    for (int i = 0; i < frase.length(); i++) {
      char caracter = frase.charAt(i);
      String carac = String.valueOf(caracter);
      if (carac.equals(" ")) {
        espacios++;
      }
    }
    System.out.println("Hay un total de " + espacios + " espacios en la cadena.");
  }
}
