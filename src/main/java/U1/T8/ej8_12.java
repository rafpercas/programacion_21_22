package U1.T8;

import java.util.Scanner;

// Actividad8-12: Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún
// suspenso
// o no lo hay. Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.
public class ej8_12 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int nota;
    int suspensos = 0;
    int count = 0;
    while (count < 5) {
      System.out.println("Introduce la nota del alumno: ");
      nota = teclado.nextInt();
      count++;
      if (nota < 5) {
        suspensos++;
      }
    }
    if (suspensos >= 2) {
      System.out.println("Hay algún suspenso.");
    }
  }
}
