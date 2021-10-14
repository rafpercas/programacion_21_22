package U1.T8_2;

import java.util.Scanner;

// Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras.
// El programa nos pedirá la combinación para abrirla.
// Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos
// se nos
// dirá “La caja fuerte se ha abierto satisfactoriamente”.
// Tendremos cuatro oportunidades para abrir la caja fuerte.
public class ej8_2_1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int combinación = 1234;
    int password = 0;
    while (password != combinación) {
      System.out.println("Introduce la combinación; ");
      password = teclado.nextInt();
      if (password != combinación) {
        System.out.println("Lo siento, esa no es la combinación");
      }
    }
    System.out.println("La caja fuerte se ha abierto satisfactoriamente");
  }
}
