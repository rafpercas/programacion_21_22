package U3.T4;

import java.util.Arrays;

// Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga a qué casillas
// podría saltar un alfil que se encuentra en esa posición. Como se indica en la figura, el alfil se
// mueve siempre en diagonal. El tablero cuenta con64 casillas.
// Las columnas se indican con las letras de la “a” a la “h” y las filas se indican del 1 al 8.
public class U3_T4_ej4 {
  public static void main(String[] args) {
    String letras = "abcdefgh";
    String[][] tablero = new String[8][8];
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = letras.charAt(j) + String.valueOf(tablero.length - i);
      }
      for (String[] fila : tablero) {
        System.out.println(Arrays.toString(fila));
      }
    }
    String posicion = "d5";

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        if (posicion.equalsIgnoreCase(tablero[i][j])) {
          /*          x = i;
          y=j;  */
        }
      }
    }
  }
}
