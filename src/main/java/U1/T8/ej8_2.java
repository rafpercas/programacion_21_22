package U1.T8;

import java.util.Scanner;

public class ej8_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduzca la edad del alumno: ");
    int edad = teclado.nextInt();
    int sumaEdades = 0;
    int numeroAlumnos = 0;
    int alumnosMayores = 0;
    int media = sumaEdades / numeroAlumnos;
    while (edad >= 0) {
      numeroAlumnos++;
      sumaEdades = sumaEdades + edad;
      if (edad >= 18) {
        alumnosMayores++;
      }
      System.out.println("Introduce la edad de otro alumno: ");
      edad = teclado.nextInt();
    }
    System.out.println(
        "El numero de alumnos es de: "
            + numeroAlumnos
            + ". La suma de las edades es de: "
            + sumaEdades
            + ", la media de edad es de: "
            + media
            + " y hay "
            + alumnosMayores
            + " mayores de edad.");
  }
}
