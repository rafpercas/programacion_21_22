package U3.T3;

import java.util.Arrays;

// Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma:
// la posición [n,m] debe contener n+m. Después, se debe mostrar su contenido.
public class U3_T3_ej8 {
  public static void main(String[] args) {
    int[][] a = new int[5][5];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        a[i][j] = i + j;
      }
    }
    System.out.println(Arrays.deepToString(a));
  }
}
