package U1.T6;

import java.util.Scanner;

public class ej6_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca un numero: ");
    int num1 = teclado.nextInt();
    if (num1 % 2 == 0) {
      int var1 = 1;
    } else {
      int var1 = 0;
    }
    // OPERADOR CONDICIONAL
    int var1 = (num1 % 2 == 0) ? 1 : 0;
  }
}
