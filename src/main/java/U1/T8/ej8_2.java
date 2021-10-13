package U1.T8;

import java.util.Scanner;

public class ej8_2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int sumaEdades = 0;
    int numeroAlumnos = 0;
    int alumnosMayores = 0;

    int edad;
    do{
      System.out.println("Introduzca la edad del alumno: ");
      edad = teclado.nextInt();
      if(edad<0){
        break;
      }
      numeroAlumnos++;
      sumaEdades = sumaEdades + edad;
      if (edad >= 18) {
        alumnosMayores++;
      }else{

      }
    }

    while (edad >= 0);
    int media = sumaEdades / numeroAlumnos;
    System.out.println("El numero de alumnos es de: " + numeroAlumnos + ". La suma de las edades es de: " + sumaEdades + ", la media de edad es de: " + media + " y hay " + alumnosMayores + " mayores de edad.");
  }
}
