package U1.T7;

import java.util.Scanner;

public class ej7_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la edad: ");
    int edad = teclado.nextInt();
    System.out.println("Introduce el nivel de estudios: ");
    int nivel_de_estudios = teclado.nextInt();
    System.out.println("Introduce los ingresos: ");
    int ingresos = teclado.nextInt();
    boolean jasp;
    jasp = (edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000);
    System.out.println(jasp);
  }
}
