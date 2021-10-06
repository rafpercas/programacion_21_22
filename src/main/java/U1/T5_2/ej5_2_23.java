package U1.T5_2;

import java.util.Scanner;

public class ej5_2_23 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    final int saborManzana = 18;
    final int saborFresa = 16;
    int saborChoco = 0;
    final int saborChocoNegro = 14;
    final int saborChocoBlanco = 15;
    final double precioNata = 2.5;
    final double precioNombre = 2.75;
    double precioTotal = 0;
    System.out.println(
        "¿De que sabor quiere la tarta?: '1' para manzana, '2' para fresa y '3' para chocolate:");
    int sabor = teclado.nextInt();
    switch (sabor) {
      case 1:
        sabor = saborManzana;
        System.out.println("Sabor de la tarta " + sabor + " €");
        break;
      case 2:
        sabor = saborFresa;
        System.out.println("Sabor de la tarta " + sabor + " €");
        break;
      case 3:
        sabor = saborChoco;
        System.out.println("Use '1' para chocolate negro y '2' para chocolate blanco.");
        int tipoChoco = teclado.nextInt();
        if (tipoChoco == 1) {
          sabor = saborChoco + saborChocoNegro;
          System.out.println("Sabor de la tarta: " + sabor + " €");
        } else {
          sabor = saborChoco + saborChocoBlanco;
          System.out.println("Sabor de la tarta: " + sabor + " €");
        }
        break;
      default:
        break;
    }
    System.out.println("Quiere nata? '1' para si y '2' para no.");
    int nata = teclado.nextInt();
    if (nata == 1) {
      precioTotal = precioTotal + sabor + precioNata;
      System.out.println("Con nata: " + precioNata + " €");
    } else {
      precioTotal = precioTotal + sabor;
    }
    System.out.println("Quiere ponerle nombre? '1' para si y '2' para no.");
    int nombre = teclado.nextInt();
    if (nombre == 1) {
      precioTotal = precioTotal + precioNombre;
      System.out.println("Con nombre: " + precioNombre + " €");
    } else {
      precioTotal = precioTotal;
    }
    System.out.println("El precio total es de: " + precioTotal);
  }
}
