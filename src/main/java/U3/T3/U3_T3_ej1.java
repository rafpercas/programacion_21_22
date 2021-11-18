package U3.T3;

import java.util.Scanner;

// Diseñar un programa que solicite al usuario 5 números decimales.
// A continuación, debe mostrar los números en el mismo orden en que se han introducido.
public class U3_T3_ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce 5 numeross decimales: ");
    double[] decimales;
    decimales = new double[5];
    for (int i = 0; i < 5; i++) {
      decimales[i] = teclado.nextDouble();
    }
    for (int i = 0; i < 5; i++) {
      System.out.println(decimales[i]);
    }
  }
}
