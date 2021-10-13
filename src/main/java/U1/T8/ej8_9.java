package U1.T8;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ej8_9 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int count = 0;
    int numMasAlto = 0;
    int altura = 0;
    int alturaMax = 0;
    do {
      System.out.println("Introduce la altura del árbol en cm:");
      altura = teclado.nextInt();
      count++;
      if (alturaMax < altura) {
        alturaMax = altura;
        numMasAlto = count;
      }
    } while (altura >= 0);
    System.out.println(
        numMasAlto + " es el árbol más alto, con una altura de " + alturaMax + " cm.");
  }
}
