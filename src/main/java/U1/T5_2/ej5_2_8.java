package U1.T5_2;

import java.util.Scanner;

public class ej5_2_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor de 'a': ");
        int a = teclado.nextInt();
        System.out.println("Introduce el valor de 'b': ");
        int b = teclado.nextInt();
        System.out.println("Introduce el valor de 'c': ");
        int c = teclado.nextInt();
        double raiz = Math.pow (b,2);
        double sol = raiz;
    }
}
