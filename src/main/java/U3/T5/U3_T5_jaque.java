package U3.T5;

import java.util.Arrays;
import java.util.Scanner;

// Utilizando vectores bidimensionales enla función,realizar la siguiente función para un juego de
// ajedrez:
//
// public static boolean jaque(String posRey,String posReina)
//
// Y nos devuelva si reina está en posición de jaque al rey.
//
// La posiciones que recibe la función son posiciones de ajedrez: a5, h4,c8
//
// Para recordar una imagen de un tablero con las posiciones:
public class U3_T5_jaque {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.println("Introduce la posicion del rey");
    String rey = teclado.next();
    System.out.println("Introduce la posicion de la reina");
    String reina = teclado.next();
    if (jaque(rey, reina)) {
      System.out.println("El rey está en jaque.");
    } else {
      System.out.println("El rey no está en jaque.");
    }

  }

  public static boolean jaque(String posRey, String posReina) {
    String[][] tablero = new String[8][8];
    String letras = "abcdefgh";

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j] = letras.charAt(j) + String.valueOf(tablero.length - i);
      }
    }
    if (posReina.charAt(0) == posRey.charAt(0) || posReina.charAt(1) == posRey.charAt(1)) {
      return true;
    }

      int x = -1;
      int y = -1;

      for (int i = 0; i < tablero.length; i++) {
          for (int j = 0; j < tablero[i].length; j++) {
              if (posReina.equalsIgnoreCase(tablero[i][j])) {
                  x = i;
                  y = j;
              }
          }
    }

      if (comprobar_diagonal(tablero, x, y, -1, 1).contains(posRey)
          || (comprobar_diagonal(tablero, x, y, -1, -1).contains(posRey))
          || (comprobar_diagonal(tablero, x, y, 1, 1).contains(posRey))
          || (comprobar_diagonal(tablero, x, y, 1, -1).contains(posRey))) {
        return true;
      }


    return false;
  }

  public static String comprobar_diagonal(String[][] m, int x, int y, int inc_x, int inc_y) {
    String movimientos = "";

    int temp_x = x + inc_x;
    int temp_y = y + inc_y;

    while (temp_x >= 0 && temp_x < m.length && temp_y >= 0 && temp_y < m.length) {
        movimientos += m[temp_x][temp_y] + " ";
        temp_x = temp_x + inc_x;
        temp_y = temp_y + inc_y;
    }
    return movimientos;
  }
}
