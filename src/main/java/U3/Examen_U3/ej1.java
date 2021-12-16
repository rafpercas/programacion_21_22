package U3.Examen_U3;

import java.util.Arrays;
import java.util.Scanner;

// Crea una función con la siguiente cabecera:
//
// public static boolean esPuntoDeSilla(int x[][], int i, int j)
//
// Que devuelve true si un número en una determinada posición de una matriz, es punto de silla. El
// punto de silla cumple la condición de ser el mínimo en su fila y máximo en su columna.
//
// Desde el programa principal se debe pedir al usuario un número de filas y de columnas, y generar
// una matriz de números enteros aleatorios entre 11 y 1003 con el tamaño introducido por el
// usuario. Llamará a la función para comprobar si cada uno de sus elementos es punto de silla.
public class ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el número de filas: ");
    int filas = teclado.nextInt();
    System.out.println("Introduce el número de columnas: ");
    int columnas = teclado.nextInt();

    int [][] matriz = new int[filas][columnas];
    for (int i = 0; i < matriz.length; i++) {
        for(int j = 0; j < matriz[i].length; j++) {
            matriz[i][j]=(int) (11+(Math.random()*(1004-11)));
        }
    }
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        if(esPuntoDeSilla(matriz,i,j)){
          System.out.println(matriz[i][j]);
        }

      }
    }
    for (int [] a : matriz ) {
      System.out.println(Arrays.toString(a));
    }

  }
    public static boolean esPuntoDeSilla(int x[][], int i, int j){
    for (int k = 0; k < x.length; k++) {
      for(int l = 0; l < x[k].length; l++) {
        //if(x[k][l]<x[k][l+1] && x[k][l]>x[k+1][l]){
        //  return true;
       // }
      }
    }
      return false;
    }
}
