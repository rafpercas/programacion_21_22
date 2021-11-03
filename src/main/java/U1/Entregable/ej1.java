package U1.Entregable;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura de los calcetines: ");
        int altura = teclado.nextInt();
        for (int i = 0; i < (altura); i++) {
            for (int j = 0; j < 8 ; j++) {
                if(j>0 && j<4 && i>0 && i<(altura) || j>1&&i>(altura-3)){
                         System.out.print("*");
            }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
