package U1.T5_2;

import java.util.Scanner;

public class ej5_2_21 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println(
        "Introduzca su cargo:(1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto) ");
    int cargo = teclado.nextInt();
    final int sueldoJunior = 950;
    final int sueldoSenior = 1200;
    final int sueldoJefe = 1600;
    switch (cargo) {
      case 1:
        cargo = sueldoJunior;
        break;
      case 2:
        cargo = sueldoSenior;
        break;
      case 3:
        cargo = sueldoJefe;
        break;
      default:
        break;
    }
    System.out.println("Introduzca cuantos dias ha estado de viaje: ");
    int diasViaje = teclado.nextInt();
    int dieta = diasViaje * 30;
    int sueldoBruto = cargo + dieta;
    System.out.println("Introduzca su estado civil:(1 - Soltero, 2 - Casado)");
    double estCivil = teclado.nextInt();
    final double irpfCas = 0.2;
    final double irpfSol = 0.25;
    if (estCivil == 1) {
      estCivil = irpfSol * sueldoBruto;
    } else {
      estCivil = irpfCas * sueldoBruto;
    }

    double sueldoNeto = sueldoBruto - estCivil;
    System.out.println(
        "El sueldo base es "
            + cargo
            + ". Dietas: "
            + dieta
            + ". El sueldo bruto es "
            + sueldoBruto
            + ". El sueldo neto es "
            + sueldoNeto);
  }
}
