package U4.T1.a9.maquinaria;

import java.util.Scanner;

public class trenes {
    Scanner teclado = new Scanner(System.in);
    //private locomotoras;
    private String maquinista;
    public void ponerVagones(int cantidad){
        
        if(cantidad>5){
            System.out.println("Hay un máximo de 5 vagones.");
        }
    for (int i = 0; i <= cantidad; i++) {
      vagones v1 = new vagones(teclado.nextFloat(), teclado.nextFloat(), teclado.next());
    }
    }
}
