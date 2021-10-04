package U1.T5_2;

import java.util.Scanner;
// deberia hacerse con intercambiar valores creando una variable auxiliar
public class ej5_2_12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce 3 numeros: ");
    int num1 = teclado.nextInt();
    int num2 = teclado.nextInt();
    int num3 = teclado.nextInt();
    if (num1 > num2 && num2 > num3) {
      System.out.println(
          "El orden de mayor a menor es de: " + num1 + " " + " " + num2 + " " + num3);
    }
    if (num1 > num3 && num3 > num2) {
      System.out.println("El orden de mayor a menor es de: " + num1 + " " + num3 + " " + num2);
    }
    if (num2 > num1 && num1 > num3) {
      System.out.println("El orden de mayor a menor es de: " + num2 + " " + num1 + " " + num3);
    }
    if (num2 > num3 && num3 > num1) {
      System.out.println("El orden de mayor a menor es de: " + num2 + " " + num3 + " " + num1);
    }
    if (num3 > num1 && num1 > num2) {
      System.out.println("El orden de mayor a menor es de: " + num3 + " " + num1 + " " + num2);
    }
    if (num3 > num2 && num2 > num1) {
      System.out.println("El orden de mayor a menor es de: " + num3 + " " + num2 + " " + num1);
    }
  }
}
