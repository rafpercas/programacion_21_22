package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

// Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional
// que debe rellenar de la siguiente forma: se leerá por teclado una serie de números,
// guardando en la tabla los pares hasta que esté llena, e ignorando los impares.
// La función tiene que devolver la cantidad de impares desechados.
public class U3_T3_ej10 {
  public static void main(String[] args) {
    int[] tablaPares = new int[5];
    System.out.println(rellenaPares(tablaPares) + " números impares se han desechado.");
    System.out.println(Arrays.toString(tablaPares));
  }

  static int rellenaPares(int[] a) {
    Scanner teclado = new Scanner(System.in);
    int impares = 0;
    for (int i = 0; i < a.length; i++) {
      int num = 0;
      do {
        System.out.println("Introduce un numero para rellenar la tabla:");
        num = teclado.nextInt();
        if (num % 2 == 0) {
          a[i] = num;
        } else {
          impares++;
        }
      } while (num % 2 != 0);
    }
    return impares;
  }
}
