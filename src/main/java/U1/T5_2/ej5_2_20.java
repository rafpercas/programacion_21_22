package U1.T5_2;

import java.util.Scanner;

public class ej5_2_20 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la base imponible: ");
    double baseImp = teclado.nextDouble();
    double baseImpIVA = 0;
    System.out.println(
        "Introduce el tipo de iva:(siendo '1'general, '2' reducido o '3' superreducido): ");
    int iva = teclado.nextInt();
    double ivaGen = 0.21;
    double reducido = 0.1;
    double sreducido = 0.04;
    switch (iva) {
      case 1:
        baseImpIVA = baseImp + (baseImp * ivaGen);
        System.out.println(baseImpIVA);
        break;
      case 2:
        baseImpIVA = baseImp + (baseImp * reducido);
        System.out.println(baseImpIVA);
        break;
      case 3:
        baseImpIVA = baseImp + (baseImp * sreducido);
        System.out.println(baseImpIVA);
        break;
      default:
        break;
    }
    System.out.println(
        "Introduce el codigo promocional: (siendo '1' nopro,'2' mitad,'3' meno5 o '4' porc5)");
    int codigo = teclado.nextInt();
    double descuento = 0;
    double nopro = 1;
    double mitad = 0.5;
    double meno5 = 5;
    double porc5 = 0.005;
    switch (codigo) {
      case 1:
        descuento = baseImpIVA * nopro;
        System.out.println(descuento);
        break;
      case 2:
        descuento = baseImpIVA * mitad;
        System.out.println(descuento);
        break;
      case 3:
        descuento = baseImpIVA - meno5;
        System.out.println(descuento);
        break;
      case 4:
        descuento = baseImpIVA * porc5;
        System.out.println(descuento);
        break;
      default:
        break;
    }
  }
}
