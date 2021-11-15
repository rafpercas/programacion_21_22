package U3.T2;

import java.util.Scanner;

// Diseñar el juego "Acierta la contraseña".
// El primer jugador introduce una contraseña, el segundo,
// debe insertar otra intentando acertarla con las pistas que le dará el programa:
// número de caracteres, primera y última letra. El programa debe escribir "Acertaste" o "Fallaste".
public class U3_T2_ej6 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Primer jugador.Introduce una contraseña: ");
    String j1 = teclado.next();
    System.out.println(" Las pistas son: ");
    System.out.println("El número de carácteres de la contraseña es de " + j1.length());
    System.out.println(
        "Empieza por " + j1.charAt(0) + " y termina por " + j1.charAt(j1.length() - 1));
    System.out.println("Segundo jugador.Intenta adivinar la contraseña: ");
    String j2 = teclado.next();
    if (j1.equals(j2)) {
      System.out.println("Acertaste!");
    } else {
      System.out.println("Fallaste!");
    }
  }
}
