package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

// Implementar una función sinRepetidos() con el prototipo:
//
// int[] sinRepetidos(int t[])
//
// que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han
// eliminado los datos repetidos.
public class U3_T3_ej6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la cantidad de números que desea introducir: ");
    int cuantos = teclado.nextInt();
    int[] tabla1 = new int[cuantos];
    for (int i = 0; i < cuantos; i++) {
      System.out.println("Introduce un número: ");
      tabla1[i] = teclado.nextInt();
    }
    sinRepetidos(tabla1);
    System.out.println(Arrays.toString(tabla1));
  }

  static int[] sinRepetidos(int a[]) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (a[i] == a[j]) {
          (a[i]) = Integer.parseInt(null);
        }
      }
    }
    return a;
  }
}
