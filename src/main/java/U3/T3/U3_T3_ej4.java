package U3.T3;

import java.util.Arrays;
import java.util.Scanner;

// Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta.
// La aplicación genera de forma aleatoria, una combinación secreta de n dígitos
// del 1 al 5 (siendo n la longitud indicada anteriormente por el usuario).
// El jugador introduce ahora una combinación de prueba. En cada intento se mostrará como pista,
// para cada dígito, si es mayor menor o igual que el correspondiente de la combinación secreta.
public class U3_T3_ej4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la cantidad de números que desea introducir: ");
    int cuantos = teclado.nextInt();
    int[] clave;
    clave = new int[cuantos];
    int[] intento;
    intento = new int[cuantos];
    for (int i = 0; i < cuantos; i++) {
      clave[i] = (int) (1 + (Math.random() * 5));
    }

    while (!Arrays.equals(intento, clave)) {
      System.out.println("Introduce una combinación: ");

      for (int i = 0; i < cuantos; i++) {
        intento[i] = teclado.nextInt();
      }
      for (int i = 0; i < cuantos; i++) {
        if (intento[i] > clave[i]) {
          System.out.println("Menor");
        } else if (intento[i] < clave[i]) {
          System.out.println("Mayor");
        } else if (intento[i] == clave[i]) {
          System.out.println("Correcto");
        }
      }
      if (Arrays.equals(clave, intento)) {
        System.out.println("Acertaste!");
      } else {
        System.out.println("Inténtalo de nuevo.");
      }
    }
  }
}
