package U1.T8;

import java.util.Scanner;

public class ej8_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numRandom = (int) (Math.random()*100+1);
        int num;
        do{
            System.out.println("Introduce un numero del 1 al 100 para acertar el numero random: ");
            num = teclado.nextInt();
            if(num == -1){
                System.out.println("Te has rendido, el número era "+numRandom+". Más suerte la próxima vez.");
            }else{

            }
            if(num>numRandom){
                System.out.println("Menor");
            }
            else if(num<numRandom){
                System.out.println("Mayor");
            }else if(num==numRandom) {
                System.out.println("Acertaste!");
                break;
            }
        }while(num>=0 && num<=100);


    }
}
