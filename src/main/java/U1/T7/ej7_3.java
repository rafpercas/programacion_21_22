package U1.T7;

import java.util.Scanner;

public class ej7_3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valorRandom = (int) (Math.random() * (96 - 123) + 123);
    char letraMin = (char) valorRandom;
    System.out.println(letraMin);
  }
}
