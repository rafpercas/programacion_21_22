package U1.T8;

import java.util.Scanner;

public class ej8_8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para calcular el factorial: ");
    int num1 = teclado.nextInt();
    int count = 1;
    int factorial = 1;
    while (count <= num1) {
      factorial = factorial * count;
      count++; // lo pongo detras de multiplicacion porque sino lo hace con un numero mas//
    }
    System.out.println(factorial);
  }
}
