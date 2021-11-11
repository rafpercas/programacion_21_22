package U3.T2;

import java.util.Scanner;

// Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las
// palabras introducidas con espacios en blanco. Terminar de leer la frase cuando la palabra
// introducida sea
// "fin" escrita con cualquier combinación de mayúsculas/minúsculas.
// La cadena "fin" no aparecerá en la frase final.
public class U3_T2_ej2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce una frase palabra a palabra: ");
    String palabra;
    String frase = "";
    do {
      palabra = teclado.next();
      if (!palabra.equalsIgnoreCase("fin")) {
        frase = frase + palabra.concat(" ");
      }
    } while (!palabra.equalsIgnoreCase("fin"));
    System.out.println(frase);
  }
}
