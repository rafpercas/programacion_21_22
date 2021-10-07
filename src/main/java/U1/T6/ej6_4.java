package U1.T6;

import java.util.Scanner;

public class ej6_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero tipo byte: de (-128 a 127)");
    byte num1 = teclado.nextByte();
    System.out.println("Introduce otro numero tipo byte: (de -128 a 127) ");
    byte num2 = teclado.nextByte();
    if (num1 < num2) {
      byte menor = num1;
    } else {
      byte menor = num2;
    }
    // operador condicional
    byte menor = (num1 < num2) ? num1 : num2;
    System.out.println(menor);
  }
}
