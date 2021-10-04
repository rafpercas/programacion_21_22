package U1.T5_2;

import java.util.Scanner;

public class ej5_2_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero de horas trabajadas: ");
        int horas = teclado.nextInt();
        final int costeHora = 12;
        final int costeHoraExtra = 16;
        int horasExtra = horas-40;
        int salarioNormal = horas * costeHora;
        int salarioExtra = (40*12)+horasExtra*costeHoraExtra;

        if (horas > 40){
            System.out.println("Su salario es de: " + salarioExtra);
        } else{
            System.out.println("Su salario es de: " + salarioNormal);
        }
    }
}
