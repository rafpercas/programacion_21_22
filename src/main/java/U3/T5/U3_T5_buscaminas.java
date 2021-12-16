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

    String [][] matriz = new String [n][n];
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j]=bomba[(int) (Math.random()*2)];
      }

      System.out.println("Introduce la fila: ");
      int fila = teclado.nextInt();
      System.out.println("Introduce la columna: ");
      int columna = teclado.nextInt();

      System.out.println(Arrays.toString(matriz[i]));
    }
  }
}
