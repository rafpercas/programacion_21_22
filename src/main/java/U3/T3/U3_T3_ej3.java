package U3.T3;

import java.util.Scanner;

// Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
// Realizar
// la media de los números positivos, la media de los negativos, y contar el número de ceros
// introducidos.
public class U3_T3_ej3 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int sumaPos = 0;
    int sumaNeg = 0;
    int numCeros = 0;
    int numPos = 0;
    int numNeg = 0;
    System.out.println("Introduce la cantidad de números que desea introducir: ");
    int cuantos = teclado.nextInt();
    int[] decimales;
    decimales = new int[cuantos];
    for (int i = 0; i < cuantos; i++) {
      System.out.println("Introduce un número: ");
      decimales[i] = teclado.nextInt();
    }
    for (int i = 0; i < cuantos; i++) {
      if (decimales[i] > 0) {
        sumaPos = decimales[i] + sumaPos;
        numPos++;
      } else if (decimales[i] < 0) {
        sumaNeg = decimales[i] - sumaNeg;
        numNeg++;
      } else if (decimales[i] == 0) {
        numCeros++;
      }
    }
    System.out.println(media(sumaPos, numPos));
    System.out.println(media(sumaNeg, numNeg));
    System.out.println("Hay " + numCeros + " ceros.");
  }

  static int media(int a, int b) {
    int resultado;
    resultado = a / b;
    return resultado;
  }
}
