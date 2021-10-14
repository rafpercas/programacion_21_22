package U1.T8;

import java.util.Scanner;

// Actividad8-14: Pedir un número n y dibujar
// un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*).
// Por ejemplo, para n=4:
public class ej8_14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    int num1 = teclado.nextInt();
    for (int j = 0; j <= num1; j++) {
      for (int i = 0; i < num1 - j; i++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
