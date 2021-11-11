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
  }
}
