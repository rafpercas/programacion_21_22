package U3.T5;

import java.util.Arrays;
import java.util.Scanner;

public class rotararray {
    public static void main(String[] args) {
        // Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N
        // filas y N columnas con número aleatorios entre 100 y 200.
        //
        // Mostrar dicho array y a continuación rotarlo 90 grados:
        Scanner teclado = new Scanner(System.in);

        //    System.out.println("Introuzca un número, el programa creará un Array con ese tamaño al
        // cuadrado y"
        //            + " lo rellenará de números aleatorios entre 100 y 200.");
        //    System.out.println();
        //    int N = teclado.nextInt();

        int N = 5;
        int[][] tabla = new int[N][N];
        int numAleatorio;
        int limiteAleatorio = 201;
        int inicioAleatorio = 100;

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                numAleatorio = (int) (inicioAleatorio + Math.random() * limiteAleatorio);
                tabla[i][j] = numAleatorio;
            }
        }

        for (int i = 0; i < tabla.length; i++) {
            System.out.println(Arrays.toString(tabla[i]));
        }

        System.out.println();
        for (int i = 0; i < rotateMatrix(tabla).length; i++) {
            System.out.println(Arrays.toString(rotateMatrix(tabla)[i]));
        }
    }

    public static int[][] rotateMatrix(int[][] matriz) {
        int tamaño = matriz.length;
        int[][] nuevaMatriz = new int[tamaño][tamaño];

        for (int i = 0, j = tamaño - 1; i < tamaño && j >= 0; i++, j--) {
            for (int k = 0; k < tamaño; k++) {
                nuevaMatriz[k][j] = matriz[i][k];
            }
        }
        return nuevaMatriz;
    }
}