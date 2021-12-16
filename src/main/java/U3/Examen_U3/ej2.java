package U3.Examen_U3;

import java.util.Arrays;

// Realiza un programa que genere 10 números aleatorios entre 12 y 89 y que los almacene en un
// array. A continuación, se mostrará el contenido de ese array junto al índice (0 – 9) utilizando
// para ello otro array adicional (o bien utilizando originalmente un array bidimensional, como se
// prefiera). Seguidamente el programa pasará los números pares a las primeras posiciones,
// conservando el orden, desplazando el resto de números (los impares) de tal forma que no se pierda
// ninguno y se conserve el orden entre ellos. Al final se debe mostrar el array resultante junto
// con el índice.
//
// Ejemplo:
//
// Array original:
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
// [54, 63, 83, 47, 13, 69, 63, 80, 56, 47]
//
// Array nuevo:
// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
// [54, 80, 56, 63, 83, 47, 13, 69, 63, 47]
public class ej2 {
  public static void main(String[] args) {
    int[] indice = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (12 + (Math.random() * (90 - 12)));
    }
    System.out.println("Array original: ");
    System.out.println(Arrays.toString(indice));
    System.out.println(Arrays.toString(array));


    int[] arrayPares = new int[10];
    int indArrayPares = 0;
    int[] arrayImpares = new int[10];
    int indArrayImpares = 0;
    for (int i = 0; i < arrayPares.length; i++) {
      if (array[i] % 2 == 0) {
        arrayPares[indArrayPares] = array[i];
        indArrayPares++;
      } else {
        arrayImpares[indArrayImpares] = array[i];
        indArrayImpares++;
      }
    }
    arrayPares = Arrays.copyOf(arrayPares, indArrayPares);
    arrayImpares = Arrays.copyOf(arrayImpares, indArrayImpares);
    int[] nuevoArray = new int[10];
    int indiceArrayImpares = 0;
    for (int i = 0; i < nuevoArray.length; i++) {

      if (i < arrayPares.length) {
        nuevoArray[i] = arrayPares[i];
      } else {
        nuevoArray[i] = arrayImpares[indiceArrayImpares];
        indiceArrayImpares++;
      }
    }
    System.out.println("Array nuevo: ");
    System.out.println(Arrays.toString(indice));
    System.out.println(Arrays.toString(nuevoArray));
  }
}
