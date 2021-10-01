package U1.T5_2;

import java.util.Scanner;

public class ej5_2_14 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un caracter, pudiendo ser *, +, -, $, &,etc.");
    String c1 = teclado.next();
    System.out.println("¿Hacia donde quiere que apunte el vértice?");
    System.out.println(
        "Introduzca '1' para arriba, '2' para abajo, '3' para la izquierda y '4' para la derecha.");
    int direccion = teclado.nextInt();
    if (direccion == 1) {
      System.out.println("  " + c1 + "  ");
      System.out.println(" " + c1 + c1 + c1 + " ");
      System.out.println(c1 + c1 + c1 + c1 + c1);
    }
    if (direccion == 2) {
      System.out.println(c1 + c1 + c1 + c1 + c1);
      System.out.println(" " + c1 + c1 + c1 + " ");
      System.out.println("  " + c1 + "  ");
    }
    if (direccion == 3) {
      System.out.println("  " + c1);
      System.out.println(" " + c1 + c1);
      System.out.println(c1 + c1 + c1);
      System.out.println(" " + c1 + c1);
      System.out.println("  " + c1);
    }
    if (direccion == 4) {
      System.out.println(c1 + "  ");
      System.out.println(c1 + c1 + " ");
      System.out.println(c1 + c1 + c1);
      System.out.println(c1 + c1 + " ");
      System.out.println(c1 + "  ");
    }
  }
}
