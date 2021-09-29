package U1.T4;

import java.util.Scanner;

public class ej4_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero con decimales: ");
        double num1 = teclado.nextDouble();
        int notaInt = (int) Math.round(num1*1)/1 ;
        System.out.println("El numero entero mas cercano a " + num1 + " es " + notaInt);
    }
}
