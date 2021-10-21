package U1.T8_2;

import java.util.Scanner;

// Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la
// altura.
// El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la altura
// más uno.
public class ej8_2_9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la altura de la 'L'");
    int altura = teclado.nextInt();
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < (altura / 2) + 1; j++) {
        if (j == 0) {
          System.out.println("*");
        }
        if (i == altura - 1) {
          System.out.print("* ");
        }
      }
    }
  }
}
