package U3.T3;

import java.util.Scanner;

// Definir una función que tome como parámetros dos tablas, la primera con 6
// números de una apuesta de la primitiva,
// y la segunda con los 6 números de la combinación ganadora. La función devolverá el número de
// aciertos.
public class U3_T3_ej9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] numero = new int[6];
    int[] ganador = new int[6];
    System.out.println("Usted tiene " + comprobarPrimi(numero, ganador) + " aciertos.");
  }

  static int comprobarPrimi(int[] a, int[] b) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce su número de la primitiva: ");
    for (int i = 0; i < a.length; i++) {
      a[i] = teclado.nextInt();
    }
    System.out.println("Introduce el número ganador de la primitiva: ");
    for (int i = 0; i < b.length; i++) {
      b[i] = teclado.nextInt();
    }
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      boolean acierto = false;
      for (int j = 0; j < b.length; j++) {
        if (a[i] == b[j]) {
          acierto = true;
          count++;
        }
      }
    }
    return count;
  }
}
