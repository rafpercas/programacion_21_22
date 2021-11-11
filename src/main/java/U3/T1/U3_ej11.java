package U3.T1;

import java.util.Scanner;

// Realizar una función que calcule a elevado a n, donde a es real,
// y n entero no negativo. Realizar una versión iterativa y otra recursiva.
public class U3_ej11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n;
    System.out.println("Introduce un numero: ");
    double a = teclado.nextDouble();
    do {
      System.out.println("Introduce la cantidad a la que quiere elevarlo: ");
      n = teclado.nextInt();
    } while (n <= 0);
    System.out.println("El número " + a + " elevado a " + n + " es: " + elevadoIterado(a, n));
    System.out.println("El número " + a + " elevado a " + n + " es: " + elevadoRecursivo(a, n));
  }

  static double elevadoIterado(double a, int n) {
    double resultado = 1;
    for (int i = 1; i <= n; i++) {
      resultado = resultado * a;
    }
    return resultado;
  }

  static double elevadoRecursivo(double a, int n) {
    double resultado = 2;
    if (n == 1) {
      resultado = a;
    } else {
      resultado = elevadoRecursivo(a, n - 1) * a;
    }
    return resultado;
  }
}
