package U1.T5_2;

import java.util.Scanner;

public class ej5_2_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la primera nota: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce la segunda nota: ");
        double nota2 = teclado.nextDouble();
        System.out.println("Introduce la tercera nota: ");
        double nota3 = teclado.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("La media entre " + nota1 + " , " + nota2 + " y " + nota3 + " es de: " + media);
    }
}
