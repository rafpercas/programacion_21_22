package U1.T5_2;

import java.util.Scanner;

public class ej5_2_17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce un numero de hasta 5 cifras: ");
            int num1 = teclado.nextInt();
            int num2 = 0;
            if(num1>0 && num1<100){
                num2 = num1/10;
            }if(num1>=100 && num1 <1000){
                num2=num1/100;
            }if(num1>=1000 && num1<10000){
                num2=num1/1000;
            }if(num1>=10000 && num1<100000){
                num2=num1/10000;
        }
        System.out.println("El primero numero de "+num1+" es: "+num2);
    }
}
