package U1.T3;

import java.util.Scanner;

public class ej3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu año de nacimiento: ");
        short fecha1 = teclado.nextShort();
        System.out.println("Introduce el año actual: ");
        short fecha2 = teclado.nextShort();
        int edad = fecha2 - fecha1;
        System.out.println("Su edad es de " + edad + " años.");
    }
}
