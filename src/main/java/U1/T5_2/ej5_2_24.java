package U1.T5_2;

import java.util.Scanner;

public class ej5_2_24 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    final String piedra;
    final String papel;
    final String tijera;
    System.out.println("Jugador 1. Introduzca piedra, papel o tijera:");
    String j1 = teclado.nextLine();
    switch (j1) {
      case "piedra":
        break;
      case "papel":
        break;
      case "tijera":
        break;
      default:
        System.out.println("Por favor introduzca una de las 3 opciones.");
        break;
    }
    System.out.println("Jugador 2. Introduzca piedra, papel o tijera.");
    String j2 = teclado.nextLine();
    switch (j2) {
      case "piedra":
        if (j1.equals("piedra")) {
          System.out.println("Empate");
        }
        if (j1.equals("papel")) {
          System.out.println("Gana el jugador 1.");
        }
        if (j1.equals("tijera")) {
          System.out.println("Gana el jugador 2.");
        }
        break;
      case "papel":
        if (j1.equals("piedra")) {
          System.out.println("Gana el jugador 2.");
        }
        if (j1.equals("papel")) {
          System.out.println("Empate.");
        }
        if (j1.equals("tijera")) {
          System.out.println("Gana el jugador 1.");
        }
        break;
      case "tijera":
        if (j1.equals("piedra")) {
          System.out.println("Gana el jugador 1.");
        }
        if (j1.equals("papel")) {
          System.out.println("Gana el jugador 2.");
        }
        if (j1.equals("tijera")) {
          System.out.println("Empate.");
        }
        break;
      default:
        System.out.println("Por favor, introduzca una de las 3 opciones.");
        break;
    }
  }
}
