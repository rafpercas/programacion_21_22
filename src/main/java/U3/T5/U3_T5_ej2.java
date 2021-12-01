package U3.T5;

import java.util.Arrays;
import java.util.Scanner;

// Escribe un programa que pida 20 números enteros. Estos números se deben
// introducir en un array de 4 filas por 5 columnas. El programa mostrará las
// sumas parciales de filas y columnas igual que si de una hoja de cálculo se
// tratara. La suma total debe aparecer en la esquina inferior derecha.
public class U3_T5_ej2 {
  public static void main(String[] args) {
  Scanner teclado = new Scanner(System.in);
  int [][] array = new int [5][6];
    for (int i = 0; i < array.length-1; i++) {
      for (int j = 0; j < array[i].length-1; j++) {
        System.out.println("Introduzca un número para el array: ");
        array[i][j]=teclado.nextInt();
      }
    }
  array[0][6]=

  }
}
