package U7.T1.a5;

import java.util.Collections;
import java.util.TreeSet;

//Actividad 5: Crear una colección de 20 números enteros aleatorios distintos menores que 100,
// guardarlos por orden decreciente a medida que se vayan generando, y mostrar la colección por pantalla.
public class Main {
  public static void main(String[] args) {
    TreeSet<Integer> numeros = new TreeSet<>(Collections.reverseOrder());
    for (int i = 0; i < 20; i++) {
      numeros.add((int) (0+(Math.random()*100)));
    }
    System.out.println(numeros);
  }
}
