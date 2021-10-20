package U1.T8_2;

import java.util.Scanner;

// Realiza un programa que pida un número por teclado y que luego muestre ese número al revés.
public class ej8_2_7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un número para mostarlo al revés: ");
    int numero = teclado.nextInt();
    int resto = 0;
    int alReves = 0;
    while (numero > 0) {
      resto = numero % 10;
      System.out.print(resto);
      numero /= 10;
    }
  }
}
