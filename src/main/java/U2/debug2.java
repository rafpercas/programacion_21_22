package U2;

import java.util.Scanner;

public class debug2 {
  public static void main(String[] args) {
    int i, num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero: ");
    num = sc.nextInt();
    System.out.println("Mostrando los 10 numeros posteriores: ");
    i = num;
    while (i
        < num + 10) { // cambiamos de > a <, i nunca va a ser mayor que num+1, no haria la condicion
      System.out.println("Numero posterior " + i);
      i++;
    }
  }
}
