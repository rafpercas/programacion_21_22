package U1.T2;

import java.util.Scanner;

public class ej2_3 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.println("La division de los dos numeros es: " + num1 / num2);
    }
}
