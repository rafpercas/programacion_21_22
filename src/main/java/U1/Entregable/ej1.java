package U1.Entregable;

import java.util.Scanner;
// altura-1-i(para hacer el otro medio de la M)
// Dibuja por pantalla la palabra MY (en mayúsculas) hechas de asteriscos separadas por 4 espacios.
// La anchura y altura de cada una de las letras deberá ser la misma.
// Se solicitará al usuario una altura que deberá siempre impar y mayor que 3.
// En caso de que el usuario no introduzca un valor correcto, se pedirá de nuevo la altura.
public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura = 0;
        do {
            System.out.println("Introduce la altura (éste número debe ser impar y mayor que 3): ");
            altura = teclado.nextInt();
        } while (altura % 2 == 0 || altura <= 3);
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < (altura * 2) - 1; j++) {
                if (j == 0 || (j == i && i < (altura / 2) + 1 || j == altura)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}