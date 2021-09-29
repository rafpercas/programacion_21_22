package U1.T5_2;

import java.util.Scanner;

public class ej5_2_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el valor de 'a': ");
        double a = teclado.nextDouble();
        System.out.println("Introduzca el valor de 'b': ");
        double b = teclado.nextDouble();
        double x = -(b/a);
        System.out.println("El valor de 'x' es de: " + x);
    }
}
