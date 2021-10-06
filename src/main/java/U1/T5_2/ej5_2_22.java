package U1.T5_2;

import java.util.Scanner;

public class ej5_2_22 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    final double precioBase = 0.01;
    final double sinEscudo = 0.00;
    final double conEscudo = 2.5;
    final double envio = 3.25;
    System.out.println("Introduzca el ancho: ");
    double ancho = teclado.nextDouble();
    System.out.println("Introduzca la longitud: ");
    double longitud = teclado.nextDouble();
    double cm2 = ancho * longitud;
    double precioBandera = cm2 * precioBase;
    double precioConEscudo = (cm2 * precioBase) + conEscudo;
    double precioTotal = precioBandera + envio;
    System.out.println("¿Quiere el escudo bordado? Use '1' para si y '2' para no.");
    double escudo = teclado.nextDouble();
    if (escudo == 1) {
      System.out.println(
          "Gracias, aquí tiene el desglose de su compra: Bandera de "
              + cm2
              + " cm2: Precio bandera: "
              + precioBandera
              + "€. Precio escudo: "
              + conEscudo
              + " €. Gastos de envío: "
              + envio
              + " €. Total: "
              + (precioTotal + conEscudo));
    } else {
      System.out.println(
          "Gracias, aquí tiene el desglose de su compra: Bandera de "
              + cm2
              + " cm2: Precio bandera: "
              + precioBandera
              + " €. Precio escudo: "
              + sinEscudo
              + "€. Gastos de envío: "
              + envio
              + " €. Total: "
              + precioTotal);
    }
  }
}
