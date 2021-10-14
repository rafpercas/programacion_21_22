package U1.T8_2;

import java.util.Scanner;

// Escribe un programa que muestre en tres columnas,
// el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por
// teclado.
public class ej8_2_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero; ");
    int num = teclado.nextInt();
    int count = 0;
    while (count < 5) {
      int cuadrado = num * num;
      int cubo = cuadrado * num;
      System.out.print(num);
      System.out.print(" ");
      System.out.print(cuadrado);
      System.out.print(" ");
      System.out.print(cubo);
      System.out.println();
      num++;
      count++;
    }
  }
}
