package U1.EXAMEN;

import java.util.Scanner;

// Desarrolla un programa que genere una clave criptográfica mediante números aleatorios para
// cifrar otro número introducido por el usuario. Se generará una clave distinta para cada una
// de las cifras del número introducido por el usuario. Las diferentes claves criptográficas
// generadas
// se comprenderán entre 1000 y 10000 (siendo este último no incluido). Por cada cifra del número,
// se
// sumará al total de cifras sumadas de su clave criptográfica. El número final se obtendrá de
// sumar todos los resultados parciales. Abajo se detalla un ejemplo para su mejor comprensión.
public class ej3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    long num;
    do {
      System.out.println("Introduzca un número entero: ");
      num = teclado.nextLong();
    } while (num <= 0);
    System.out.println("El número resultante es: ");
  }
}
