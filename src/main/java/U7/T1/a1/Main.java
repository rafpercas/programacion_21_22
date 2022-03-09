package U7.T1.a1;

import java.util.ArrayList;
import java.util.Collections;

//Actividad 1: Crear una colección de 20 números enteros aleatorios menores que 100,
// y guardarlos en el orden en que se vayan generando; mostrar
// por pantalla dicha lista una vez creada. Ordenarla en sentido creciente y volverla a mostrar por pantalla.
public class Main {
  public static void main(String[] args) {

    ArrayList<Numero> lista = new ArrayList<>();
    for (int i = 0;i < 20; i++) {
      lista.add(new Numero());
    }

    System.out.println(lista.size());
    System.out.println(lista);
    Collections.sort(lista);
    System.out.println(lista);
  }
}
