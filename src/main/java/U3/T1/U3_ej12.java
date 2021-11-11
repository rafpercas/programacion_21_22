package U3.T1;

import java.util.Scanner;

// Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.
public class U3_ej12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para calcular su factorial: ");
    int num = teclado.nextInt();
    System.out.println(factorial(num));
  }

  static int factorial(int a) {
    int resultado = 0;
    if (a == 0) {
      resultado = 1;
    } else {
      resultado = a * factorial(a - 1);
    }
    return resultado;
  }
}
