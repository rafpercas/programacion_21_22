package U1.Entregable;

import java.util.Scanner;

// Escribe un programa que solicite al usuario los siguientes números:
//
//    Un número entero positivo
//    Un número entre 0 y 2 (ambos inclusive)
//
// Una vez introducidos los dos números nos debe construir un número saltando las cifras según
// indique el segundo número.
public class ej2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero = 0;
    int saltos = 0;
    do {
      System.out.println("Introduce un número positivo: ");
      numero = teclado.nextInt();
    } while (numero < 0);
    do {
      System.out.println("Introduce el número de saltos(entre 0 y 2): ");
      saltos = teclado.nextInt();
    } while (saltos < 0 || saltos > 2);
    do {
      if (saltos == 0) {
        saltos = 1;
      } else {
        saltos--;
      }
      numero /= 10;
    } while (numero != 0);
    System.out.println(numero);
  }
}
