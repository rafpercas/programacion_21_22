package U1.T4;

import java.util.Scanner;

public class ej4_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la primera nota: ");
        int nota1 = teclado.nextInt();
        System.out.println("Introduce la segunda nota: ");
        int nota2 = teclado.nextInt();
        double media = (double) (nota1 + nota2) / 2;
        System.out.println("La media entre " + nota1 + " y " + nota2 + " es de: " + media);

    }
}
