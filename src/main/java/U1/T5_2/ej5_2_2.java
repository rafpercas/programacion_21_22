package U1.T5_2;

import java.util.Scanner;

public class ej5_2_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una hora: ");
        int hora = teclado.nextInt();
        if (hora >= 6 && hora <= 12) {
            System.out.println("Buenos dias.");
        } else {

        }
        if (hora >= 13 && hora <= 20) {
            System.out.println("Buenas tardes.");
        } else {

        }
        if (hora >=0 && hora <= 5 ) {
            System.out.println("Buenas noches.");
        } else if (hora >= 21 && hora <= 24){
            System.out.println("Buenas noches.");
        }
        else {

        }
    }
}