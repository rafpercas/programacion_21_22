package U3.T4;

import java.util.Arrays;

// Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos
// comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición
// tanto del máximo como del mínimo.
//
// NOTA IMPORTANTE: Los números no pueden repetirse.
public class U3_T4_ej6 {
  public static void main(String[] args) {
    int[][] array = new int[6][10];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
      }
      System.out.println(Arrays.toString(array[i]));
    }
posicionMax(array);
    posicionMin(array);
  }

  static void posicionMax(int[][] a) {
    String resultado="";
    int numero = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] > numero) {
          numero = a[i][j];
          String pos1 = String.valueOf(i);
          String pos2 = String.valueOf(j);
          resultado=pos1+","+pos2;
        }
      }
    }
    System.out.println(numero);
    System.out.println(resultado);
  }
    static void posicionMin(int[][] a) {
        String resultado="";
        int maxRandom = 1001;
        int numero = maxRandom;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] < numero) {
                    numero = a[i][j];
                    String pos1 = String.valueOf(i);
                    String pos2 = String.valueOf(j);
                    resultado=pos1+","+pos2;
                }
            }
        }
        System.out.println(numero);
        System.out.println(resultado);
    }
    static void arraySinRepe(int [][]a){
        for (int i = 0; i < a.length; i++) {
            int maxRandom = 1001;
            int minRandom = 0;
            boolean estaRepe = false;
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==a[0][0]){
                    a[i][j] = (int) (Math.random() * (maxRandom - minRandom) + minRandom);
                }else{

                }
            }
        }
    }
}
