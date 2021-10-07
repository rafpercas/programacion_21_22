package U1.T5_2;

import java.util.Scanner;

public class ej5_2_25 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    float precioComida = 0;
    float precioPalmera = 1.40F;
    float precioDonut = 1;
    float pitufoAceite = 1.20F;
    float pitufoTortilla = 1.60F;
    float precioBebida = 0;
    float precioZumo = 1.50F;
    float precioCafe = 1.20F;

    System.out.println("Que ha tomado de comer? palmera, donut o pitufo: ");
    String comida = teclado.nextLine();
    switch (comida) {
      case "palmera":
        precioComida = precioComida + precioPalmera;
        break;
      case "donut":
        precioComida = precioComida + precioDonut;
        break;
      case "pitufo":
        System.out.println("El pitufo era con aceite o tortilla?");
        String pitufo = teclado.nextLine();
        if (pitufo.equals("aceite")) {
          precioComida = precioComida + pitufoAceite;
        } else if (pitufo.equals("tortilla")) {
          precioComida = precioComida + pitufoTortilla;
        } else {
          System.out.println("Dato incorrecto, no tenemos pitufo con eso.");
        }
        break;
      default:
        System.out.println("No ofrecemos esa comida.");
        break;
    }
    System.out.println("Que ha tomado de beber?zumo o cafe: ");
    String bebida = teclado.nextLine();
    if (bebida.equals("zumo")) {
      precioBebida = precioBebida + precioZumo;
    } else if (bebida.equals("cafe")) {
      precioBebida = precioBebida + precioCafe;
    } else {
      System.out.println("No ofrecemos esa bebida.");
    }
    float precioTotal = precioComida + precioBebida;
    System.out.println(
        "El precio de la comida es :"
            + precioComida
            + " €. El precio de la bebida es: "
            + precioBebida
            + "€. El precio total es de: "
            + precioTotal);
  }
}
