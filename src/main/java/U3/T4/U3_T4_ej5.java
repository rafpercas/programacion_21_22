package U3.T4;

import java.util.Arrays;

// Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas
// relleno con números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los
// números de la diagonal que va desde la esquinas superior izquierda a la esquina inferior derecha,
// así como el máximo, el mínimo y la media de los números que hay en esa diagonal.
public class U3_T4_ej5 {
  public static void main(String[] args) {
    int[][] array = new int[10][10];
    int maxRandom = 301;
    int minRandom = 200;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (int) (Math.random() * (maxRandom - minRandom) + minRandom);
      }
    }
    for (int i = 0; i < array.length; i++) {
      System.out.println(Arrays.toString(array[i]));
    }

    System.out.println();
    System.out.println(Arrays.toString(diagonalArray(array)));
    System.out.println("El número máximo es: " + numMax(diagonalArray(array)));
    System.out.println("El número mínimo es: " + numMin(diagonalArray(array)));
    System.out.println("La media de la diagonal es: " + mediaArray(diagonalArray(array)));
  }

  static int numMax(int[] a) {
    int resultado = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] > resultado) {
          resultado = a[i];
        }
      }
    return resultado;
  }

  static int[] diagonalArray(int[][] a) {
    int[] diagonal = new int[10];
    int indDiagonal = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (i == j) {
          diagonal[indDiagonal] = a[i][j];
          indDiagonal++;
        }
      }
    }
    return diagonal;
  }

  static int numMin(int[] a) {
    int maxRandom = 301;
    int resultado = maxRandom;
    for (int i = 0; i < a.length; i++) {
        if (a[i] < resultado) {
          resultado = a[i];
        }
      }

    return resultado;
  }

  static int mediaArray(int[] a) {
    int count = 0;
    int suma = 0;

    for (int i = 0; i < a.length; i++) {
        count++;
        suma += a[i];
      }

    int media = suma / count;
    return media;
  }
}
