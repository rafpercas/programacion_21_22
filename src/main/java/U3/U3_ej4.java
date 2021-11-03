package U3;
// Actividad 4:
// Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los
// dos.
import java.util.Scanner;

public class U3_ej4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    int num1 = teclado.nextInt();
    // si fuera String, debemos poner siempre detrás teclado.nextline();
    System.out.println("Introduce otro numero: ");
    int num2 = teclado.nextInt();
    System.out.println(mayorque(num1, num2));
  }

  static int mayorque(int num1, int num2) {
    int mayor = 0;
    if (num1 > num2) {
      mayor = num1;
    } else {
      mayor = num2;
    }
    return mayor;
    // el return podriamso hacerlo mas corto con: 'return num1 > num2 ? num1 : num2';
  }
}
