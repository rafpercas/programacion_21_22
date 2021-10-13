package U1.T8;

import java.util.Scanner;

public class ej8_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el valor mínimo: ");
        int valorMin = teclado.nextInt();
        System.out.println("Introduce el valor máximo: ");
        int valorMax = teclado.nextInt();
        int num1;
        do{
            System.out.println("Introduce un numero: ");
            num1 = teclado.nextInt();
            if(num1>=valorMax || num1<=valorMin){
                System.out.println("El numero introducido está fuera del rango, por favor introduzca otro.");
            }else{
                System.out.println("El numero "+num1+" está dentro del rango seleccionado.");
                break;
            }

        }while(num1>=0);
    }
}
