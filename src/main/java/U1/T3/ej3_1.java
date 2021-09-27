package U1.T3;

import java.util.Scanner;

public class ej3_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero de 2 cifras: ");
        byte num1 = teclado.nextByte();
        System.out.println("Introduce otro numero de 2 cifras: ");
        byte num2 = teclado.nextByte();
        int resultado = num1 + num2;
        System.out.println("La suma de los numeros es de: " + resultado);
    }

}