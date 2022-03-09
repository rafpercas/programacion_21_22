package U7.T1.a2;

import U7.T1.a1.Numero;

import java.util.ArrayList;
import java.util.Collections;

//Actividad 2: Repetir el ejercicio anterior, pero ordenar la lista en sentido decreciente.
public class Main {
  public static void main(String[] args) {

      ArrayList<U7.T1.a1.Numero> lista = new ArrayList<>();
      for (int i = 0;i < 20; i++) {
          lista.add(new Numero());
      }

      System.out.println(lista.size());
      System.out.println(lista);
      Collections.sort(lista);
      Collections.reverse(lista);
      System.out.println(lista);

  }
}
