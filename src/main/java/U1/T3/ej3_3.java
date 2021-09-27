package U1.T3;

import java.util.Scanner;

public class ej3_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero con decimales: ");
        double num1 = teclado.nextDouble();
        System.out.println("Introduce otro numero con decimales: ");
        double num2 = teclado.nextDouble();
        double division = num1 / num2;
        System.out.println("La division de los numeros es de: " + division);
    }
}
