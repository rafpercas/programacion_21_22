package U1.T2;

import java.util.Scanner;

public class ej2_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una temperatura en grados centigrados: ");
        int centigrados = teclado.nextInt();
        int fahrenheit = 9 * centigrados / 5 + 32;
        System.out.println("La temperatura de " + centigrados + " grados centigrados serian " + fahrenheit + " grados fahrenheit.");
    }
}
