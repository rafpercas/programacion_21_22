package U1.T5_2;

import java.util.Scanner;

public class ej5_2_13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    int num1 = teclado.nextInt();
    if (num1 % 2 == 0 && num1 % 5 == 0) {
      System.out.println(num1 + " es par y divisible entre 5.");
    }
    if (num1 % 2 == 0 && num1 % 5 != 0) {
      System.out.println(num1 + " es par, pero no divisible entre 5.");
    }
    if (num1 % 2 != 0 && num1 % 5 == 0) {
      System.out.println(num1 + " no es par, pero si divisible entre 5.");
    }
    if (num1 % 2 != 0 && num1 % 5 != 0) {
      System.out.println(num1 + " no es par ni divisible entre 5.");
    }
  }
}
