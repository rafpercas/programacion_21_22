package U3.Entregable_U3;

import java.util.Scanner;

// Crea una función llamada palabraAhorcado que reciba como parámetros dos cadenas (la cadena a
// adivinar y el resultado parcial) y un carácter a buscar en la cadena a adivinar. Debe devolver el
// resultado de encontrar ese character en la cadena a adivinar.
//
// La función tendrá el siguiente prototipo:
//
// public static String palabraAhorcado(String a, String b, char c)
//
// En el programa principal, se debe pedir al usuario que introduzca una palabra a adivinar y un
// carácter a buscar en la cadena. Se pedirá caracteres hasta que se consiga adivinar la palabra
// completa.
//
// NOTA: La palabra a adivinar no contendrá tildes ni caracteres extraños, además será en minúsculas
// para simplificar el ejercicio.
public class ej1 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    String palabra;
    String parcial;
  do{
    System.out.println("Introduce la cadena a adivinar: ");
    palabra = teclado.next();
    parcial = "";
    for (int i = 0; i < palabra.length(); i++) {
      parcial= "-".concat(parcial);
    }
    System.out.println(parcial);
    for (int i = 0; i <palabra.length(); i++) {
      if(palabra.equals(parcial)){
        System.out.println("Completaste la palabra!");
      }else{
        System.out.println("Introduce el caracter para ver si se encuentra en la cadena: ");
        String carac = teclado.next();
        char caracter = carac.charAt(0);
        palabraAhorcado(palabra,parcial,caracter);
      }
    }
  }while(!palabra.equals(parcial));
  }
  public static String palabraAhorcado(String a, String b, char c){
    String parcialnueva= "";
    for (int i = 0; i < a.length(); i++) {
      if (c == (a.charAt(i))) {
        System.out.print(a.charAt(i));
      } else {
        System.out.print("-");
      }
    }
    System.out.println();
    return parcialnueva;
  }
}
