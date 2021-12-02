package U3.T5;

import java.util.Arrays;

// Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
// lo que se especifica en los comentarios:
//
// public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
//                                 // que contienen el 7 (por ej. 7, 27, 782)
//                                 // que se encuentren en otro array que se
//                                 // pasa como parámetro. El tamaño del array
//                                 // que se devuelve será menor o igual al
//                                // que se pasa como parámetro.
//
// Utiliza esta función en un programa para comprobar que funcionan bien. Para
// que el ejercicio resulte más fácil, las repeticiones de números que contienen
// 7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
// el array devuelto también estará repetido 3 veces. Si no existe ningún número
// que contiene 7 en el array x, se devuelve un array con el número -1 como único
// elemento.
public class U3_T5_ej3 {
  public static void main(String[] args) {
    int[] array = {7, 10, 17, 20, 27, 30, 37};
    System.out.println(Arrays.toString(filtraCon7(array)));
    ;
    System.out.println();
  }

  public static int[] filtraCon7(int[] x) {
    boolean tiene7 = false;
    int indiResultado = 0;
    int[] resultado = new int[0];

    for (int i = 0; i < x.length; i++) {
      int aux = x[i];
      int resto = 0;
      while (aux >= 10) {
        resto = aux % 10;
        if (resto == 7) {
          tiene7 = true;
          resultado = Arrays.copyOf(resultado, resultado.length + 1);
          resultado[indiResultado] = x[i];
          indiResultado++;
        }
        aux = aux / 10;
      }
      if (aux == 7) {
        tiene7 = true;
        resultado = Arrays.copyOf(resultado, resultado.length + 1);
        resultado[indiResultado] = x[i];
        indiResultado++;
      }
    }
    return resultado;
  }
}
