package U3.T1;
// Actividad 8: Escribir una función a la que se le pase un número
// entero y devuelva el número de divisores primos que tiene.
import java.util.Scanner;

public class U3_ej8 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int num = teclado.nextInt();
    esPrimo(num);
    System.out.println("Hay " + divisoresPrimos(num) + " divisores primos de 0 a " + num);
  }

  static boolean esPrimo(int num) {
    boolean primo = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        primo = false;
        break;
      } else {
      }
    }
    return primo;
  }

  static int divisoresPrimos(int num) {
    int divisorPrimo = 0;
    for (int i = 2; i < num; i++) {
      if (esPrimo(i) && num % i == 0) {
        divisorPrimo++;
      }
    }
    return divisorPrimo;
  }
}
