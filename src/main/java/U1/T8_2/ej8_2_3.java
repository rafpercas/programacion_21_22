package U1.T8_2;

import java.util.Scanner;

// Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
// El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando
// los dos
// anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
// 144...
// El número n se debe introducir por teclado.
public class ej8_2_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero para la serie Fibonacci: ");
    int num = teclado.nextInt();
    int fibonacci = 0;
    int anterior = 1;
    int penultimo = 0;
    for (int i = 0; i < num; i++) {
      System.out.print(fibonacci + ", ");
      penultimo = fibonacci;
      fibonacci = anterior + fibonacci;
      anterior = penultimo;
    }
  }
}
