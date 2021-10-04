package U1.T5_2;

import java.util.Scanner;

public class ej5_2_16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero entero: ");
        int num = teclado.nextInt();
        int numLast = num%10;
        System.out.println("La última cifra del numero "+num+" es "+numLast);
    }
}
