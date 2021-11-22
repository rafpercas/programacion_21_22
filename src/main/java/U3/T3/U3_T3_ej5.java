package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

// Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar. Hacer
// lo mismo con otra serie de 6 enteros. A continuación, fusionar las dos tablas en una tercera, de
// forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden correcto para que
// los datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.
public class U3_T3_ej5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] tabla1 = new int[6];
    for (int i = 0; i < 6; i++) {
      System.out.println("Introduce un número para la primera tabla: ");
      tabla1[i] = teclado.nextInt();
    }
    Arrays.sort(tabla1);
    int[] tabla2 = new int[6];
    for (int i = 0; i < 6; i++) {
      System.out.println("Introduce un número para la segunda tabla: ");
      tabla2[i] = teclado.nextInt();
    }
    Arrays.sort(tabla2);
    int[] juntas = new int[tabla1.length + tabla2.length];
    System.arraycopy(tabla1, 0, juntas, 0, tabla1.length);
    System.arraycopy(tabla2, 0, juntas, tabla1.length, tabla2.length);
    Arrays.sort(juntas);
    System.out.println(Arrays.toString(juntas));
  }
}
