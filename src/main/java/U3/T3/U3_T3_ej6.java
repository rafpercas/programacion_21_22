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
    System.out.println(Arrays.toString(sinRepetidos(tabla1)));
  }

  static int[] sinRepetidos(int t[]) {
    int[] r = new int[0];
    int ind_r = 0;
    for (int i = 0; i < t.length; i++) {
      boolean repetido = false;
      for (int j = 0; j < r.length; j++) {
        if (t[i] == r[j]) {
          repetido = true;
          break;
        }
      }
      if (!repetido) {
        r = Arrays.copyOf(r, r.length + 1);
        r[ind_r] = t[i];
        ind_r++;
      }
    }
    return r;
  }
}
