package U3.T2;

import java.util.Scanner;

// En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
// según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
public class U3_T2_ej7 {
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
    } else if (j1.compareTo(j2) < 0) {
      System.out.println("Menor");
    } else if (j1.compareTo(j2) > 0) {
      System.out.println("Mayor");
    }
  }
}
