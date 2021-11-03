package U3;

import java.util.Scanner;

public class U3_ej2 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el primero numero: ");
    int num1 = teclado.nextInt();
    System.out.println("Introduce el segundo numero: ");
    int num2 = teclado.nextInt();
    desdeHasta(num1, num2);
  }

  static void desdeHasta(int num1, int num2) {

    for (int i = num1 + 1; i < num2; i++) {
      System.out.println(i);
    }
  }
}
