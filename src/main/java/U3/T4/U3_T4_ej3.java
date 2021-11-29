package U3.T4;

import java.util.Arrays;
import java.util.Scanner;

// Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una
// mesa se pueden sentar de 0 (mesa vacía) a 4 comensales(mesa llena).
//
// Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para
// colocar a grupos mayores a 4, por tanto, si un cliente dice por ejemplo que son un grupo de 6, el
// programa dará el mensaje“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como
// máximo e intente de nuevo”. Para el grupo que llega, se buscasiempre la primera mesa libre (con 0
// personas).
//
// Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el
// grupo es dedos personas, se podrá colocar donde haya una o dos personas. Inicialmente,las mesas
// se cargan con valores aleatorios entre 0 y 4.
//
// Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
// pueden romper aunque haya huecos sueltos suficientes.
public class U3_T4_ej3 {
  public static void main(String[] args) {
    boolean haySitio = false;
    Scanner teclado = new Scanner(System.in);
    int clientes;
    int[] mesas = new int[10];
    for (int i = 0; i < mesas.length; i++) {
      mesas[i] = i + 1;
    }
    int[] ocupacion = new int[10];
    for (int i = 0; i < ocupacion.length; i++) {
      ocupacion[i] = (int) (Math.random() * 5);
    }
    do {

      do {
        System.out.println("Cuantos son?");
        clientes = teclado.nextInt();
        if (clientes > 4) {
          System.out.println(
              "Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
        }
      } while (clientes > 4);

      for (int i = 0; i < ocupacion.length; i++) {

        if (ocupacion[i] < 4) {
          if (ocupacion[i] + clientes < 5) {
            System.out.println(ocupacion[i]);
            ocupacion[i] = ocupacion[i] + clientes;
            System.out.println("Mesa " + (i + 1) + " por favor.");
            haySitio = true;
            break;
          } else {
            haySitio = false;
            System.out.println("No tenemos sitio.");
          }
        }
      }
      System.out.println(Arrays.toString(mesas));
      System.out.println(Arrays.toString(ocupacion));
    } while (haySitio = true);
  }
}
