package U3.T5;

import java.util.Arrays;

// Define la función convierteArrayEnString con la siguiente cabecera:
// public static String convierteArrayEnString(int[] a)
// Esta función toma como parámetro un array que contiene números y devuelve
// una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
// vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
// devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
// “62501”.
public class U3_T5_ej4 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(convierteArrayEnString(array));
  }

  public static String convierteArrayEnString(int[] a) {
    String resultado = "";
    for (int i = 0; i < a.length; i++) {
      resultado = resultado.concat(String.valueOf(a[i]));
    }
    return resultado;
  }
}
