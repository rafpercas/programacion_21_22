package U7.T1.a7;

import java.util.*;

//Actividad 7: Introducir por teclado, hasta que se introduzca "fin", una serie de nombres que se insertarán por
// orden alfabético en una colección que no permita repeticiones. Mostrar luego la lista de nombres por pantalla.
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Collection<String> lista = new ArrayList<>();
    String palabra ="";
    while(!Objects.equals(palabra,"fin")){
      System.out.println("Introduce una palabra, introduce 'fin' para salir: ");
      palabra = teclado.next();
      lista.add(palabra);
    }
    System.out.println(lista);
    Set<String> s = new TreeSet<>(lista);
    System.out.println(s);
  }
}
