package U3.Entregable_U3;

import java.util.Arrays;
import java.util.Scanner;

// Desarrollar una función que se denomine insertarFilaEnMatriz. Dicha función tendrá el siguiente
// prototipo:
//
// public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos)
//
// Recibirá como parámetro un vector bidimensional de Strings, un array unidimensional de Strings y
// una posición. Devolverá como resultado un array bidimensional en el que esté insertado como una
// nueva fila en la matriz el array en la posición que se indica.
//
// Se deberá imprimir la matriz antes y después de insertar la fila.
//
// NOTA: Las filas de la matriz deben tener el mismo número de elementos. No es necesario
// comprobarlo, como tampoco es necesario comprobar que la posición pasada es válida, se entenderá
// que el usuario pasa una posición válida.
public class ej4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String[][] array = {{"hola", "adios"}, {"si", "no"}};
    String[] array1 = {"hello", "bye"};
    int posicion = 1;
    System.out.println(Arrays.deepToString(array));
    System.out.println(Arrays.deepToString(insertarFilaEnMatriz(array, array1, posicion)));
  }

  public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {
    String[][] resultado = new String[matriz.length + 1][matriz[0].length];
    for (int i = 0; i < matriz.length; i++) {
      if (i == pos) {
        resultado[i] = fila;
       resultado[i+1]=matriz[i];
      }else{
          resultado[i]=matriz[i];
      }
    }
    return resultado;
  }
}
