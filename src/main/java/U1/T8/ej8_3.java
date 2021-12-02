package U1.T8;
//Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números tratando de acertarlo.
// El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
// El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).
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
    int random = (int) (Math.random()*50+1);
    }
}
