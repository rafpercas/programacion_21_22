package U1.T8_2;

import java.util.Scanner;

// Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por teclado.
// El carácter con el que se pinta la pirámide también se debe pedir por teclado.
public class ej8_2_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la altura de la pirámide: ");
    int altura = teclado.nextInt();
    System.out.println("Introduce el caracter con el que quiere que se pinte la pirámide: ");
    String caracter = teclado.next();
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < (altura * 2) - 1; j++) {
        if (j > (altura - 1) - i && j < (altura - 1) + i) {
          System.out.print(caracter);
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
