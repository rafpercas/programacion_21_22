package U1.T2;

import java.util.Scanner;

public class ej2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de millas: ");
        int millas = teclado.nextInt();
        int metros = millas * 1609;
        System.out.println( millas + " millas son " + metros + " metros.");
    }
}
