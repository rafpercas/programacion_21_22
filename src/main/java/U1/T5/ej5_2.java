package U1.T5;

import java.util.Scanner;

public class ej5_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero 12: ");
        int num1 = teclado.nextInt();
        if (num1 == 12) {
            System.out.println("El numero es correcto.");
        }
        else{
            System.out.println("El numero introducido no es el correcto.");
        }
    }
}
