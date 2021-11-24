package U3.T4;

import java.util.Arrays;
import java.util.Scanner;

// Escribe un programa que rellene un array de 100 elementos con números
// en-teros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
// A continuaciónel programa mostrará el array y preguntará si el usuario quiere destacar elmáximo
// o el mínimo.
// Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles
// asteriscos.
public class U3_T4_ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int[] array = new int[100];
    int maxRandom = 501;
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * maxRandom);
    }
    System.out.println(Arrays.toString(array));
    System.out.println("¿Quiere destacar el máximo(max) número, o el mínimo(min)?: ");
    String maxmin = teclado.next();
    Arrays.sort(array);
    if (maxmin.equals("max")) {
      System.out.println("El número máximo es: " + array[99]);
    } else if (maxmin.equals("min")) {
      System.out.println("El número mínimo es: " + array[0]);
    }
  }
}
