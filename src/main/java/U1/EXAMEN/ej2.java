package U1.EXAMEN;

import java.util.Scanner;

// Realiza un programa que diga los dígitos que aparecen y los que no aparecen
// en un número entero introducido por teclado. El orden es el que se muestra en los ejemplos.
// Utiliza el tipo long para que el usuario pueda introducir números largos.
public class ej2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    long num;
    do {
      System.out.println("Introduce un número entero mayor que 0: ");
      num = teclado.nextLong();
    } while (num < 0);
    int digito0 = 0;
    int digito1 = 0;
    int digito2 = 0;
    int digito3 = 0;
    int digito4 = 0;
    int digito5 = 0;
    int digito6 = 0;
    int digito7 = 0;
    int digito8 = 0;
    int digito9 = 0;
    long resto = 0;
    while (num != 0) {
      resto = num % 10;
      if (resto == 0) {
        digito0++;
      }
      if (resto == 1) {
        digito1++;
      }
      if (resto == 2) {
        digito2++;
      }
      if (resto == 3) {
        digito3++;
      }
      if (resto == 4) {
        digito4++;
      }
      if (resto == 5) {
        digito5++;
      }
      if (resto == 6) {
        digito6++;
      }
      if (resto == 7) {
        digito7++;
      }
      if (resto == 8) {
        digito8++;
      }
      if (resto == 9) {
        digito9++;
      }
      num = num / 10;
    }

    System.out.print("Digitos que aparecen en el número: ");
    if (digito0 > 0) {
      System.out.print(0);
    }
    if (digito1 > 0) {
      System.out.print(1);
    }
    if (digito2 > 0) {
      System.out.print(2);
    }
    if (digito3 > 0) {
      System.out.print(3);
    }
    if (digito4 > 0) {
      System.out.print(4);
    }
    if (digito5 > 0) {
      System.out.print(5);
    }
    if (digito6 > 0) {
      System.out.print(6);
    }
    if (digito7 > 0) {
      System.out.print(7);
    }
    if (digito8 > 0) {
      System.out.print(8);
    }
    if (digito9 > 0) {
      System.out.print(9);
    }
    System.out.println();
    System.out.print("Digitos que no aparecen en el número: ");
    if (digito0 == 0) {
      System.out.print(0);
    }
    if (digito1 == 0) {
      System.out.print(1);
    }
    if (digito2 == 0) {
      System.out.print(2);
    }
    if (digito3 == 0) {
      System.out.print(3);
    }
    if (digito4 == 0) {
      System.out.print(4);
    }
    if (digito5 == 0) {
      System.out.print(5);
    }
    if (digito6 == 0) {
      System.out.print(6);
    }
    if (digito7 == 0) {
      System.out.print(7);
    }
    if (digito8 == 0) {
      System.out.print(8);
    }
    if (digito9 == 0) {
      System.out.println(9);
    }
  }
}
