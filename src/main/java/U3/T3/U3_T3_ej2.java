package U3.T3;

import java.util.Scanner;

// Escribir una aplicación que solicite al usuario cuántos números desea introducir.
// A continuación, se introducirá por
// teclado esa cantidad de números enteros, y por último, los mostrará en el orden inverso al
// introducido.
public class U3_T3_ej2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la cantidad de números que desea introducir: ");
    int cuantos = teclado.nextInt();

    double[] decimales;
    decimales = new double[cuantos];
    for (int i = 0; i < cuantos; i++) {
      System.out.println("Introduce un número: ");
      decimales[i] = teclado.nextDouble();
    }
    for (int i = cuantos - 1; i >= 0; i--) {
      System.out.println(decimales[i]);
    }
  }
}
