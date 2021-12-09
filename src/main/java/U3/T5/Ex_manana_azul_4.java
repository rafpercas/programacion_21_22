package U3.T5;

import java.util.Scanner;

//Implementa una función con nombre nEsimo que busque el número que hay dentro de un array bidimensional en la posición n-ésima
// contando de izquierda a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento es el 0.
//
//Si la posición donde se busca no existe en el array, la función debe devolver -1.
//
//Se debe entregar tanto el código de la función como el código de prueba que la usa.Rellenaremos los arrays de manera aleatorio
// con números entre 10 y 100 (ambos incluidos).
//
//La cabecera de la función es la siguiente: public static int nEsimo(int[][] n, int posicion)
public class Ex_manana_azul_4 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce que posicion quiere que devuelva.");
        int pos = teclado.nextInt();
        int [][] array = {{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},{16,17,18,19,20,21,22,23,24,25,26,27,28,29,30}};
        System.out.println(nEsimo(array,pos));
    }

    public static int nEsimo(int[][] n, int posicion) {
        int count = 0;
        int resultado = 0;

        for (int i = 0; i < n.length; i++) {
            if(posicion>n.length*n[i].length){
                resultado=-1;
                break;
            }
            for (int j = 0; j < n[i].length; j++) {
                if(count == posicion){
                    resultado=n[i][j];
                    break;
                }
                count++;

            }
        }
    return resultado;
    }
}
