package U1.Entregable;

import java.util.Scanner;

// La hamburguesería Pitanza Feliz quiere se informatice su empresa. Realiza un programa que calcule
// el precio de unos pedidos en función del número de hamburguesas y del día en el que se haga.
// El precio de la hamburguesa básica con los ingredientes mínimos (pan, carne, queso) es de 3
// euros. La hamburguesa gourmet cuesta 5 euros, porque tiene carne de Waygu, pan artesano y queso
// de oveja.
// Los martes locos de Pitanza Feliz, un pedido de dos gourmet cuesta 9 euros, y los miércoles de
// desmadre, la hamburguesa básica cuesta 2 euros.
// Perteneciendo al club Fanegas de Pitanza Feliz, se obtiene un 12% de descuento sobre el precio
// final del pedido.
public class ej3 {
  public static void main(String[] args) {
    int basica = 3;
    int gourmet = 5;
    int martesLocos = 9;
    int miercolesDesmadre = 2;
    double socios = 0.88;
    Scanner teclado = new Scanner(System.in);
    int pedidoBasicas = 0;
    int pedidoGourmets = 0;
    int socio;
    int dia;
    double total = 0;
    System.out.println("Introduce la cantidad de hamburguesas basicas: ");
    pedidoBasicas = teclado.nextInt();
    System.out.println("Introduce la cantidad de hamburguesas gourmet: ");
    pedidoGourmets = teclado.nextInt();
    System.out.println("Introduce un dia de la semana(del 1 al 7): ");
    dia = teclado.nextInt();
    System.out.println("¿Es usted socio del club?(1=si, 2=no): ");
    socio = teclado.nextInt();
    total = (pedidoBasicas * basica) + (pedidoGourmets * gourmet);
    double descuento = total - (total * socios);
    if (dia == 2) {
      if (pedidoGourmets % 2 == 0) {
        pedidoGourmets = pedidoGourmets * 9;
      } else {
        pedidoGourmets = pedidoGourmets - 1;
        pedidoGourmets = (pedidoGourmets * 9) + gourmet;
      }
    }
    if (dia == 3) {
      basica = 2;
      pedidoBasicas = pedidoBasicas * basica;
    }
    if (socio == 1) {
      total = total * socios;
      System.out.println("descuento: " + descuento);
    }

    System.out.println("El total es" + total);
  }
}
