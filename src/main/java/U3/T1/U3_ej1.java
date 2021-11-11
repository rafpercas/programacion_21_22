package U3.T1;

import java.util.Scanner;

public class U3_ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Escribe el numero de veces que quiere que aparezca 'eco': ");
    int num = teclado.nextInt();
    eco(num);
  }

  static void eco(int num) {
    for (int i = 0; i < num; i++) {
      System.out.println("Eco...");
    }
  }
}
