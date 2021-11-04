package U1.EXAMEN;

import java.util.Scanner;

// Escribe un programa que pinte por pantalla las letras AB. El usuario debe
// introducir la altura que deberá ser mayor que 3 e impar. Las letras estarán separadas por dos
// espacios
public class ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int altura;
    final int espacio = 2;
    do {
      System.out.println(
          "Introduce la altura para las letras A y B(debe ser mayor que 3 e impar): ");
      altura = teclado.nextInt();
    } while (altura < 3 || altura % 2 == 0);
    for (int i = 0; i < altura; i++) {
      for (int j = 0; j < altura * 3 + espacio; j++) {
        if (j < altura * 2 - (altura / 2 - 1) && j > altura - i && i == (altura / 2) + 1
            || j == altura - i
            || j == altura + i && i == j - altura
            || j == altura * 2 + espacio
            || i == 0 && j > altura * 2 + espacio && j < altura * 3 + espacio - 1
            || i == altura / 2 && j > altura * 2 + espacio && j < altura * 3 + espacio - 1
            || i == altura - 1 && j > altura * 2 + espacio && j < altura * 3 + espacio - 1
            || j == altura * 3 + espacio - 1 && i > 0 && i < altura / 2
            || j == altura * 3 + espacio - 1 && i > altura / 2 && i < altura - 1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
