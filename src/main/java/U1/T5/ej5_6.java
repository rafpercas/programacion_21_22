package U1.T5;

import java.util.Scanner;

public class ej5_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de 'tiempo': ");
        int tiempo = teclado.nextInt();
        final double gravedad = 9.8;
        double velocidad = gravedad * tiempo;
        if (tiempo <= 0) {
            System.out.println("Tiempo incorrecto");
        }
        else {
            System.out.println("La velocidad es de: " + velocidad);
        }

    }
}
