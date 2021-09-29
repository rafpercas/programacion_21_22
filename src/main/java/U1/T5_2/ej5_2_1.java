package U1.T5_2;

import java.util.Scanner;

public class ej5_2_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un día de la semana: ");
        int dia = teclado.nextInt();
        switch (dia) {
            case 1:
                System.out.println("A primera hora tenemos sistemas informáticos.");
                break;
            case 2:
                System.out.println("A primera hora tenemos entornos de desarrollo.");
                break;
            case 3:
                System.out.println("A primera hora tenemos programación.");
                break;
            case 4:
                System.out.println("A primera hora tenemos FOL.");
                break;
            case 5:
                System.out.println("A primera hora tenemos lenguaje de marcas.");
                break;
            default:
                    break;
        }
    }
}
