package U3.T1;

import java.util.Scanner;

// Escribir una función que decida si dos números enteros positivos son amigos.
// Dos números son amigos si la suma de los
// divisores propios (distinto de él mismo) del primer número es igual al segundo número, y
// viceversa.
public class U3_ej10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2;
    do {
      System.out.println("Introduce un numero: ");
      num1 = teclado.nextInt();
      System.out.println("Introduce el segundo numero para ver si son amigos: ");
      num2 = teclado.nextInt();
    } while (num1 < 0 && num2 < 0);
    sonAmigos(num1, num2);
  }

  static boolean sonAmigos(int num1, int num2) {
    boolean sonAmigos = (sumaDivisoresPropios(num1) == num2 && sumaDivisoresPropios(num2) == num1);
    if (sonAmigos) {
      System.out.println("Los números " + num1 + " y " + num2 + " son amigos.");
    } else {
      System.out.println("Los números " + num1 + " y " + num2 + " no son amigos.");
    }
    return sonAmigos;
  }

  static int sumaDivisoresPropios(int num) {
    int suma = 0;
    for (int i = 1; i < num; i++) {

      if (num % i == 0) {
        suma = suma + i;
      }
    }
    return suma;
  }
}
