package U1.T5;

import java.util.Scanner;

public class ej5_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros enteros: ");
        int num1 = teclado.nextInt();
        int num2 = teclado.nextInt();
        int count = 0;
        if (num1 % 2 == 0) {
            count = count + 1;
        }
        else{
            count = count +0;
        }
        if (num2 % 2 == 0) {
            count = count + 1;
        }
        else{
            count = count +0;
        }
        System.out.println( count + " de esos numeros son pares.");
    }
}
