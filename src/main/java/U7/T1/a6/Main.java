package U7.T1.a6;

import java.util.*;

//Actividad 6: Introducir por teclado, hasta que se introduzca "fin",
// una serie de nombres que se insertarán en una colección,
// de forma que se conserve el orden de inserción y que no puedan repetirse. Mostrar la estructura por pantalla.
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    LinkedHashSet<String> lista = new LinkedHashSet<>();
    String palabra;
    do {
      System.out.println("Introduce una palabra, introduzca 'fin' para salir: ");
      palabra = teclado.next();
      if (!palabra.equalsIgnoreCase("fin")) {
        lista.add(palabra);}
    } while (!palabra.equalsIgnoreCase("fin"));
    System.out.println(lista);
    }
}

