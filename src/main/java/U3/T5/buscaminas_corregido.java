package U3.T5;

import java.util.Arrays;
import java.util.Scanner;

public class buscaminas_corregido {
    public static void main(String[] args) {
        // Juego del buscaminas
        //
        // Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N
        // columnas.
        //
        // A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:
        //
        // O bien un carácter X que significa que hay una bomba.
        // O bien un carácter - que significa que esa casilla no nada.
        // A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
        //
        // En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar
        // por pantalla la cantidad de bombas que hay en las casillas de alrededor.
        //
        // Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que
        // el usuario encuentre una bomba).
        //
        // NOTA: Podemos hacer la lectura de la posición como consideremos más oportuno.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int n = teclado.nextInt();

        char[][] tablero = new char[n][n];

        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                int aletorio = (int) (Math.random() * 10);
                if (aletorio < 5) {
                    tablero[i][j] = 'X';
                } else {
                    tablero[i][j] = '-';
                }
            }
        }

        for (char[] fila : tablero) {
            System.out.println(Arrays.toString(fila));
        }

        int x, y;
        do {

            System.out.println("Introduzca la fila de la posición:");
            x = teclado.nextInt();

            System.out.println("Introduzca la columna de la posición:");
            y = teclado.nextInt();

            int numbombas = 0;

            for (int i = (x - 1); i < (x + 2); i++) {
                for (int j = (y - 1); j < (y + 2); j++)
                    if (i >= 0 && i < tablero.length && j >= 0 && j < tablero.length) {
                        if (tablero[i][j] == 'X') numbombas++;
                    }
            }

            for (char[] fila : tablero) {
                System.out.println(Arrays.toString(fila));
            }

            System.out.println(
                    "La posición " + x + "," + y + " tiene " + numbombas + " bombas en los alrededores");

        } while (tablero[x][y] != 'X');

        System.out.println("La posición " + x + "," + y + " tiene una bomba, está muerto");
    }
}