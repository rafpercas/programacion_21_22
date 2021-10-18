package U1.T8_2;

import java.util.Scanner;

public class ej8_piramidehueca {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca la altura: ");
    int altura = teclado.nextInt();
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < (altura * 2) - 1; j++) {
        if (j == (altura - 1) - i || j == (altura - 1) + i || i == (altura - 1)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println(" ");
    }
  }
}
