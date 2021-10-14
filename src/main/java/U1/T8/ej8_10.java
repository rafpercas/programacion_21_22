package U1.T8;

import java.util.Scanner;
// Actividad8-10: Implementar una aplicación que pida un número al usuario entre el 1 y el 10,
// y calcule su tabla de multiplicar.
// El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así,
// volver a pedirlo hasta que lo cumpla.
public class ej8_10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero del 1 al 10: ");
    int num = teclado.nextInt();
    int multiplicador = 1;
    while (multiplicador <= 10) {
      if (num > 0 && num <= 10) {
        System.out.println(num * multiplicador);
        multiplicador++;
      } else {
        System.out.println(
            "Ese numero no está dentro del rango. Por favor introduce un numero del 1 al 10: ");
        num = teclado.nextInt();
      }
    }
  }
}
