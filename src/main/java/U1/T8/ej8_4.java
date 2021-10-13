package U1.T8;

import java.util.Scanner;

public class ej8_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = teclado.nextInt();
        for (int i=1; i<=num; i++){
            System.out.println(i);
             }
    }
}
