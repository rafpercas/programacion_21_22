package U1.T3;

import java.util.Scanner;

public class ej3_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de millas: ");
        float millas = teclado.nextFloat();
        float metros = millas * 1609;
        System.out.println( millas + " millas son " + metros + " metros.");
    }
}
