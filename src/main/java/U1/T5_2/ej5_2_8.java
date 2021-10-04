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
        double determinante = Math.pow (b,2)-(4*a*c);
        if (determinante>0){
            double x1 = ((b*(-1))+Math.sqrt(determinante))/(2*a);
            double x2 = ((b*(-1))-Math.sqrt(determinante))/(2*a);
            System.out.println("El valor de x1 es: "+x1+" y el valor de x2 es: "+x2+" .");
        }else{
            System.out.println("El determinante es negativo y no se puede hacer la operación.");
        }
    }
}
