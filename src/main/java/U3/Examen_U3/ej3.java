package U3.Examen_U3;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

// Desarrolla dos funciones para trabajar con cadenas. La primera tendrá la siguiente cabecera:
//
// public static String[] invertir(String cadena)
//
// Recibe una cadena (String), y devuelve esa cadena invertida y en mayúsculas pero colocada en un
// array (una letra por posición)
//
// Ejemplo:
//
// invertir("hola") debe devolver [ "A","L","O","H"]
//
// La segunda función tendrá la siguiente cabecera:
//
// public static String[] desplazarVocales(String cadena)
//
// Recibe una cadena (String), y devuelve esa misma cadena con las vocales desplazadas una posición:
//
// a -> e
// e -> i
// i -> o
// o -> u
// u -> a
//
// y colocada en un vector (una letra por posición)
//
// Ejemplo:
//
// desplazarVocales("hola") debe devolver ["h","u","l","e"]
public class ej3 {
  public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una palabra: ");
      String palabra = teclado.next();
      System.out.println(Arrays.toString(invertir(palabra)));
    System.out.println(Arrays.toString(desplazarVocales(palabra)));
  }
    public static String[] invertir(String cadena){
      String [] nuevoresultado = new String [cadena.length()];
      String [] resultado = new String [cadena.length()];
    for (int i = 0; i < nuevoresultado.length; i++) {
      nuevoresultado[i]= String.valueOf(cadena.toUpperCase(Locale.ROOT).charAt(i));
    }
      int atras = nuevoresultado.length-1;
    for (int i = 0; i < nuevoresultado.length; i++) {
      resultado[i]=nuevoresultado[atras];
      atras--;
    }

      return resultado;
    }
   public static String[] desplazarVocales(String cadena){
    StringBuilder cad = new StringBuilder();
    cad = new StringBuilder(cadena);

    String [] resultado = new String [cad.length()];
     for (int i = 0; i < resultado.length; i++) {
       resultado[i]= String.valueOf(cad.charAt(i));
     }
    for (int i = 0; i < resultado.length; i++) {
      if(resultado[i].equalsIgnoreCase("a")){
        resultado[i]="e";
      }
      else if(resultado[i].equalsIgnoreCase("e")){
        resultado[i]="i";
      }
      else if(resultado[i].equalsIgnoreCase("i")){
        resultado[i]="o";
      }
      else if(resultado[i].equalsIgnoreCase("o")){
        resultado[i]="u";
      }
      else if(resultado[i].equalsIgnoreCase("u")){
        resultado[i]="a";
      }
    }
     return resultado;
   }
}
