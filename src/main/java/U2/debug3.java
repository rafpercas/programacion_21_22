package U2;

import java.util.Scanner;

public class debug3 {
  public static void main(String[] args) {
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    num = sc.nextInt();
    if (esPrimo(num)) {
      System.out.println("El numero " + num + " es primo.");
    } else {
      System.out.println("El numero " + num + " no es primo.");
    }
  }

  public static boolean esPrimo(int num) {
    boolean esPrimo = true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        esPrimo = false;
        break; // tenemos que meter este break para que en cuanto se pueda dividir por otro numero y
               // su resto de 0, pare y nos diga que no es primo.
      } else {
        esPrimo = true;
      }
    }
    return esPrimo;
  }
}
