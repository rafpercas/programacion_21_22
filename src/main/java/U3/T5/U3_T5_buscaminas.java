package U3.T5;

import java.util.Arrays;
import java.util.Scanner;

// Juego del buscaminas
//
// Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N
// columnas.
//
// A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:
//
//    O bien un carácter X que significa que hay una bomba.
//    O bien un carácter - que significa que esa casilla no nada.
//
// A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
//
// En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar por
// pantalla la cantidad de bombas que hay en las casillas de alrededor.
//
// Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que el
// usuario encuentre una bomba).
//
// NOTA: Podemos hacer la lectura de la posición como consideremos más oportuno.
public class U3_T5_buscaminas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el numero de filas y columnas de la matriz: ");
    int n = teclado.nextInt();

    String [] bomba = {"-","x"};

    String [][] tablero = new String [n][n];
    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[i].length; j++) {
        tablero[i][j]=bomba[(int) (Math.random()*2)];
      }
    }
    for (String[] fila : tablero) {
      System.out.println(Arrays.toString(fila));
    }
    int x, y;
    do {

      System.out.println("Introduzca la fila de la posición:");
      x = teclado.nextInt();

      System.out.println("Introduzca la columna de la posición:");
      y = teclado.nextInt();

      int numBombas = 0;

      for (int i = (x - 1); i < (x + 2); i++) {
        for (int j = (y - 1); j < (y + 2); j++)
          if (i >= 0 && i < tablero.length && j >= 0 && j < tablero.length) {
            if (tablero[i][j].equalsIgnoreCase(bomba[1])) {
              numBombas++;
            }
          }
      }

        for (String[] fila : tablero) {
          System.out.println(Arrays.toString(fila));
        }

      System.out.println(
              "La posición " + x + "," + y + " tiene " + numBombas + " bombas en los alrededores");

    } while (!tablero[x][y].equalsIgnoreCase(bomba[1]));

    System.out.println("La posición " + x + "," + y + " tiene una bomba, está muerto");
  }
  }

