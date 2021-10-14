package U1.T8;

import java.util.Scanner;

// Actividad8-13:  Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y
// suspensos.
public class ej8_13 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int aprobados = 0;
    int condicionados = 0;
    int suspensos = 0;
    int notas = 0;
    while (notas < 6) {
      System.out.println("Introduce la nota del alumno; ");
      int nota = teclado.nextInt();
      if (nota >= 5) {
        aprobados++;
      }
      if (nota == 4) {
        condicionados++;
      }
      if (nota < 4) {
        suspensos++;
      }
      notas++;
    }
    System.out.println(
        "Hay "
            + aprobados
            + " aprobados, "
            + condicionados
            + " condicionados(4) y "
            + suspensos
            + " suspensos.");
  }
}
