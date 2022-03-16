package U7.T1.a4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

// Actividad 4: Introducir por consola una frase que conste exclusivamente de palabras separadas por
// espacios.
// Almacenar en una lista las palabras de la frase, una en
// cada nodo y mostrar por pantalla las palabras que estén repetidas. A continuación, mostrar las
// que no lo estén.
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<>();
    System.out.println(
        "Introduce una frase que conste exclusivamente de palabras separadas por espacios: ");
    String frase = teclado.nextLine();
    String[] array = frase.split(" ");
    for (int i = 0; i < array.length; i++) {
      lista.add(array[i]);
    }
    System.out.println(lista);
    ArrayList<String> repetidas = new ArrayList<>();
    for (int i = 0; i < lista.size(); i++) {
      for (int j = 0; j < lista.size(); j++) {
        if (lista.get(i).equals(lista.get(j))) {
          repetidas.add(lista.get(j));
        }
      }
    }
    ArrayList<String> noRepetidas = new ArrayList<>();
    for (int i = 0; i < lista.size(); i++) {
      for (int j = 0; j < lista.size(); j++) {
        if (!Objects.equals(lista.get(i), lista.get(j))) {
          noRepetidas.add(lista.get(j));
        }
      }
    }
    System.out.println(repetidas);
    System.out.println(noRepetidas);
  }
}
