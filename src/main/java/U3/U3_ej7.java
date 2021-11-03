package U3;
// Actividad 7: Diseñar una función que nos diga si un número es primo.
import java.util.Scanner;

public class U3_ej7 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un número: ");
    int num = teclado.nextInt();
    esPrimo(num);
  }

  static void esPrimo(int num) {
    boolean primo = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        primo = false;
        break;
      } else {
      }
    }
    if (primo) {
      System.out.println(num + " es primo.");
    } else {
      System.out.println(num + " no es primo");
    }
  }
}
