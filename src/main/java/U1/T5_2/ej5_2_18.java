package U1.T5_2;

import java.util.Scanner;

public class ej5_2_18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen: ");
        double nota1 = teclado.nextDouble();
        System.out.println("Introduce la nota del segundo examen: ");
        double nota2 = teclado.nextDouble();
        double media = (nota1 + nota2) / 2;
        if (media >= 5) {
            System.out.println("Tu nota de programación es " + media);
        }
        if (media < 5) {
            System.out.println("¿Cuál ha sido el resultado de la recuperación?");
           String recuperacion = teclado.next();
            if (recuperacion=="apto"){
                System.out.println("Tu nota de programaciñon es 5.");
            }
        }else{
            System.out.println("Tu notra de programación es 4,5.");
        }

    }
}
