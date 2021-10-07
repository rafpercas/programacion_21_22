package U1.T6;

import java.util.Scanner;

public class ej6_5 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce el radio de una circunferencia: ");
    int radio = teclado.nextInt();
    System.out.println(
        "1.Calcular diámetro\n" + "\n" + "2.Calcular perímetro\n" + "\n" + "3.Calcular área");
    int opcion = teclado.nextInt();
    switch (opcion) {
      case 1:
        double diametro = 2 * radio;
        System.out.println(diametro);
        break;
      case 2:
        double perimetro = 2 * Math.PI * radio;
        System.out.println(perimetro);
        break;
      case 3:
        double area = Math.PI * radio * radio;
        System.out.println("area");
        break;
      default:
        break;
    }
  }
}
