package U1.Entregable;

import java.util.Scanner;

public class flecha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura;
        do{
            System.out.println("Introduce la altura de la flecha, siendo este número par, o mayor o igual que 3): ");
            altura= teclado.nextInt();

        }while(altura%2==0 || altura<3);
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= altura+5; j++) {
                if(j>altura/2-i && j>i-(altura/2) && j<=(altura/2)+1 || i==(altura/2) &&j>1&& j<altura+3){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
