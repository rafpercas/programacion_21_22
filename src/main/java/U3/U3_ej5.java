package U3;

import java.util.Scanner;

// Actividad 5: Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números.
// Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.

public class U3_ej5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    int num1 = teclado.nextInt();
    System.out.println("Introduce otro numero: ");
    int num2 = teclado.nextInt();
    System.out.println("Introduce otro numero: ");
    int num3 = teclado.nextInt();
    System.out.println(mayorque(mayorque(num1, num2), num3));
  }

  static int mayorque(int num1, int num2) {
    int mayor = 0;
    if (num1 > num2) {
      mayor = num1;
    } else {
      mayor = num2;
    }
    return mayor;
  }
}
