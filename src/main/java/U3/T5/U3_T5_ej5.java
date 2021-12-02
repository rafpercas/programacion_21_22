package U3.T5;

import java.util.Arrays;

// Implementa la función aleatorioDeArray con la cabecera que se muestra a
// continuación:
// public static int aleatorioDeArray(int[] a)
// Esta función debe devolver un número del array escogido al azar entre todos
// los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
// podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorio-
// DeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
// prueba.
public class U3_T5_ej5 {
  public static void main(String[] args) {
    int [] array = {10,15,20,25,30};
    System.out.println(aleatorioDeArray(array));
  }
  public static int aleatorioDeArray(int[] a){
      int resultado = 0;
        int random = (int)(0+Math.random()*a.length);
        resultado=a[random];
      return resultado;
  }
}
