package U1.T8_2;
// Escribe un programa que lea una lista
// de diez números y determine cuántos son positivos, y cuántos son negativos.
import java.util.Scanner;

public class ej8_2_4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int positivos = 0;
    int negativos = 0;
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce un numero: ");
      int num = teclado.nextInt();
      if (num >= 0) {
        positivos++;
      } else {
        negativos++;
      }
    }
    System.out.println("Hay " + positivos + " números positivos y " + negativos + " negativos.");
  }
}
