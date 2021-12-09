package U3.Entregable_U3;

import java.util.Arrays;
import java.util.Scanner;

// Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
//
// public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
//
// Recibirá como parámetros dos vectores de enteros y una posición. Devolverá un vector de enteros
// que contenga el primer array con el segundo array insertado de manera completa a partir de la
// posición dada. Si la posición es menor que 0, el vector devuelto deberá contener el primer array.
// Si la posición es mayor que la longitud del primer array, el vector devuelto deberá contener el
// segundo array. Si la posición es igual a la longitud del primer array, el vector devuelto deberá
// contener el primer array con el segundo array insertado al final. Probar dicha función en el
// método Main.
public class ej2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int [] array1 = {1,2,3,4,5};
    int [] array2 = {6,7,8,9,10};
    int posicion = 3;
    System.out.println(Arrays.toString(insertarEnVector(array1,array2,posicion)));
  }

  public static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
    int [] resultado = new int[v1.length+v2.length];
    if(pos==0){
        resultado=v1;
    }else if(pos > v1.length){
        resultado = v2;
    }else if(pos==v1.length){
      for (int i = 0; i < resultado.length; i++) {

      }
    } else if(pos>0 && pos <resultado.length){

    }
    return resultado;
  }
}
