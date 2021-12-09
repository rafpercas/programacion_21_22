package U3.Entregable_U3;

import java.util.Arrays;
import java.util.Scanner;

// Realiza un programa que muestre por pantalla un array bidimensional con tantas filas y columnas
// como indique el usuario. Deberá rellenarse la matriz con números aleatorios entre 14 y 78 (ambos
// incluidos).
//
// A continuación, el programa debe insertar en un array pares los números que se encuentran en la
// intersección de las filas pares con las columnas pares. Se hace lo mismo para el array impares
// con los números que se encuentran en la intersección de las filas impares con las columnas
// impares.
//
// Finalmente se debe mostrar la matriz de números, el array de números pares, el de números
// impares, y la suma, media y máximo y mínimo de cada uno de los arrays pares e impares.
public class ej3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca el número de filas: ");
    int filas = teclado.nextInt();
    System.out.println("Introduzca el número de columnas: ");
    int columnas = teclado.nextInt();
    int[][] array = new int[filas][columnas];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = (int) (14 + (Math.random() * (78 - 15)));
      }
      System.out.println(Arrays.toString(array[i]));
    }
    int[] arrayPares = new int[array[0].length];
    int indarrayPares = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (i % 2 == 0 && j % 2 == 0) {
          arrayPares[indarrayPares] = array[i][j];
          indarrayPares++;
        }
      }
    }
    int[] arrayImpares = new int[array[0].length];
    int indarrayImpares = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        if (i % 2 != 0 && j % 2 != 0) {
          arrayImpares[indarrayImpares] = array[i][j];
          indarrayImpares++;
        }
      }
    }
    System.out.println(Arrays.toString(arrayPares));
    System.out.println(Arrays.toString(arrayImpares));

    System.out.println("La suma de los pares es: " + sumaArray(arrayPares));
    System.out.println("La suma de los impares es: " + sumaArray(arrayImpares));
    System.out.println("La media de los pares es: " + mediaArray(arrayPares));
    System.out.println("La media de los impares es: " + mediaArray(arrayImpares));
    System.out.println("El minimo de los pares es: " + minArray(arrayPares));
    System.out.println("El minimo de los impares es: " + minArray(arrayImpares));
    System.out.println("El maximo de los pares es: " + maxArray(arrayPares));
    System.out.println("El maximo de los impares es: " + maxArray(arrayImpares));
    System.out.println("La media de los pares es: " + mediaArray(arrayPares));
    System.out.println("La media de los impares es: " + mediaArray(arrayImpares));
  }

  static int sumaArray(int[] a) {
    int resultado = 0;
    for (int i = 0; i < a.length; i++) {
      resultado += a[i];
    }
    return resultado;
  }

  static int mediaArray(int[] a) {
    int resultado = 0;
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      resultado += a[i];
      count++;
    }
    resultado = resultado / count;
    return resultado;
  }

  static int minArray(int[] a) {
    int resultado = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] < resultado) {
        resultado = a[i];
      }
    }
    return resultado;
  }

  static int maxArray(int[] a) {
    int resultado = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] > resultado) {
        resultado = a[i];
      }
    }
    return resultado;
  }
}
