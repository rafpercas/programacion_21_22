package U1.T5_2;

import java.util.Scanner;

public class ej5_2_21 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println(
        "Introduzca su cargo:(1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto) ");
    int cargo = teclado.nextInt();
    System.out.println("Introduzca cuantos dias ha estado de viaje: ");
    int diasViaje = teclado.nextInt();
    System.out.println("Introduzca su estado civil:(1 - Soltero, 2 - Casado)");
    int estCivil = teclado.nextInt();
    final int sueldoJunior = 950;
    final int sueldoSenior = 1200;
    final int sueldoJefe = 1600;
    final int dieta = diasViaje * 30;
    final double irpfCas = 0.2;
    final double irpfSol = 0.25;
  }
}
