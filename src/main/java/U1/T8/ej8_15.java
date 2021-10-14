package U1.T8;

import java.util.Scanner;
// Actividad8-15: Realizar un programa que nos pida un número n,
// y nos diga cuantos números hay entre 1 y n que sean primos.+
// Un número primo es aquel que sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:
public class ej8_15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    int num = teclado.nextInt();
    int primos = 0;
    for (int j = 2; j < num; j++) {
      boolean esPrimo = true;
      for (int i = 2; i < j; i++) {
        if (j % i == 0) {
          esPrimo = false;
          break;
        }
      }
      if (esPrimo) {
        primos++;
      }
    }
    System.out.println("Hay " + primos + " números primos entre el 1 y el " + num);
  }
}
