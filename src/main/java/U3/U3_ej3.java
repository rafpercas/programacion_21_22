package U3;

import java.util.Scanner;

// Actividad 3: Realizar una función que calcule y muestre el área o el volumen de un cilindro,
// según se especifique. Para distinguir un caso de otro se le pasará un número 1 (para área)
// o 2 (para volumen).
// Además, hemos de pasarle a la función el radio de la base y la altura.
public class U3_ej3 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Quiere calcular el área(1) o el volumen(2)?: ");
    int pregunta = teclado.nextInt();
    System.out.println("Introduce el radio de la base: ");
    double radio = teclado.nextDouble();
    System.out.println("Introduce la altura: ");
    double altura = teclado.nextDouble();
    if (pregunta == 1) {
      System.out.println(area(radio, altura));
    } else {
      System.out.println(volumen(radio, altura));
    }
  }

  static double area(double radio, double altura) {
    double solucion = 0;
    solucion = 2 * Math.PI * radio * (altura + radio);
    return solucion;
  }

  static double volumen(double radio, double altura) {
    double solucion = 0;
    solucion = Math.PI * (radio * radio) * altura;
    return solucion;
  }
}
