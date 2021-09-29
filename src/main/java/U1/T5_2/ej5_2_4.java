package U1.T5_2;

import java.util.Scanner;

public class ej5_2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero de horas trabajadas: ");
        int num1 = teclado.nextInt();
        int salarioNormal = num1 * 12;
        int salarioExtra = ((40*12)+ (num1-40)*16);
        if (num1 > 40){
            System.out.println("Su salario es de: " + salarioExtra);
        } else{
            System.out.println("Su salario es de: " + salarioNormal);
        }
    }
}
