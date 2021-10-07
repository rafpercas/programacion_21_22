package U1.T8;

import java.util.Scanner;

public class ej8_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    int num1 = teclado.nextInt();
    while (num1 > 0 || num1 < 0) {
      if (num1 % 2 == 0) {
        System.out.println(num1 + " es par.");
      } else {
        System.out.println(num1 + " es impar.");
      }
      if (num1 > 0) {
        System.out.println(num1 + " es positivo.");
      } else {
        System.out.println(num1 + " es negativo.");
      }
      System.out.println(num1 * num1);
      System.out.println("Introduce un numero: ");
      num1 = teclado.nextInt();
    }
  }
}
