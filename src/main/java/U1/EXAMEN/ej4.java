package U1.EXAMEN;

import java.util.Scanner;

// La tienda Carbonita Volando vende figuras personalizadas mediante impresión 3D. Lo hace mediante
// un configurador online que permite calcular el precio de cada figura dependiendo del peso total,
// del tipo de material (ABS, PLA, Madera, flexible, etc.) y de si se pide un posprocesado de la
// figura o no. Las tarifas son las siguientes:
//
//    0.2 céntimos por gramo si se hace con ABS
//    0.3 céntimos por gramo si se hace con PLA
//    0.5 céntimos por gramo si se hace con Madera
//    0.7 céntimos por gramo si se hace con material flexible
//
// Aplicar una posprocesado, implica incrementar el coste total de la figura en 3 euros adicionales,
// independientemente del material y del tamaño de la figura.
//
// Si se pertenece al programa de fidelización Enjuto3D Premium, no se cobran los gastos de envío
// que son de 2 euros.
//
// Elabora un programa que pregunte por los datos necesarios y calcule el coste total de la figura.
public class ej4 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double precioABS = 0.2;
    double precioPLA = 0.3;
    double precioMadera = 0.5;
    double precioMFlexible = 0.7;
    double precioposprocesado = 3;
    double costeEnvio = 2;
    double costefiguraM = 0;
    double total = 0;
    double peso = 0;
    int material = 0;
    int posprocesado = 0;
    System.out.println("Bienvenido a Carbonita Volando.");

    do {
      System.out.println("Introduzca el peso de la figura en gramos: ");
      peso = teclado.nextDouble();
    } while (peso < 0);

    do {
      System.out.println("Introduzca el tipo de material(1=ABS, 2=PLA, 3=Madera, 4=Flexible): ");
      material = teclado.nextInt();
    } while (material < 0 || material > 4);
    do {
      System.out.println("Quiere posprocesado?('1' para si y '2' para no): ");
      posprocesado = teclado.nextInt();
    } while (posprocesado < 1 || posprocesado > 2);
    System.out.println("¿Pertenece a Enjuto3D Premium? (1=si, 2=no):");
    double enjunto3d = teclado.nextDouble();
    switch (material) {
      case 1:
        total = peso * precioABS;
        break;
      case 2:
        total = peso * precioPLA;
        break;
      case 3:
        total = peso * precioMadera;
        break;
      case 4:
        total = peso * precioMFlexible;
        break;
      default:
        break;
    }
    if (posprocesado == 1) {
      total += precioposprocesado;
    }
    if (enjunto3d == 2) {
      total += costeEnvio;
    }

    System.out.println("El coste total de la pieza es de: " + total + " €.");
  }
}
