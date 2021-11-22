package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

// Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo.
// Cada clase está compuesta por 5 alumnos. Se pide leer las notas (números enteros) de cada uno de
// los alumnos en el primer trimestre, luego, las del segundo, y luego, las del tercero. Debemos
// mostrar,
// al final, la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en la
// posición pos (que se lee por teclado). (Podéis hacerlo usando 3 vectores -uno por trimestre-,
// o usando una matriz bidimensional en la que las filas sean los trimestres y las columnas los
// alumnos).
public class U3_T3_ej7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int notas[][] = new int[3][5];
    pedirNotas(notas);
    System.out.println(Arrays.deepToString(notas));
  }

  static int[][] pedirNotas(int[][] a) {
    Scanner teclado = new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.println(
            "Introduce la nota del trimestre " + (i + 1) + " y alumno " + (j + 1) + ": ");
        a[i][j] = teclado.nextInt();
      }
    }
    return a;
  }
}
