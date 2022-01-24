package U4.T2.a1;

import java.util.Arrays;

public class lista {
  private int numero;
  private int capacidad;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getCapacidad() {
    return capacidad;
  }

  public void setCapacidad(int capacidad) {
    this.capacidad = capacidad;
  }

  Integer[] listaNumeros = new Integer[getCapacidad()];

  public lista(Integer listaNumeros[]) {
    setCapacidad(10);

    for (int i = 0; i < getCapacidad(); i++) {}
  }

  public void mostrarLista() {
    System.out.println(Arrays.toString(listaNumeros));
  }

  public void contarElementos() {
    System.out.println("La lista contiene "+listaNumeros.length+" elementos.");
  }

  public void insertarFinal(Integer num) {
      listaNumeros[getCapacidad()]=num;
  }

  public void insertarPrincipio(Integer num) {
      listaNumeros[0]=num;
  }

  public void insetarEnPosicion(Integer num, int posicion) {
      listaNumeros[posicion]=num;
  }

  public void unirListas(Integer[] lista1, Integer[] lista2) {

  }

  public void eliminarNumero(int posicion) {
      listaNumeros[posicion]=0;
  }

  public void obtenerNumero(int posicion) {
      System.out.println("El elemento de la posicion "+posicion+" es "+listaNumeros[posicion]);
  }

  public void buscarNumero(Integer num) {
    for (int i = 0; i < listaNumeros.length; i++) {
        if(num==listaNumeros[i]){
        System.out.println("El numero "+num+" está en la posición "+listaNumeros[i]);
        }else{
        System.out.println("El número no se encuentra en la lista.");
        }
    }
  }

  public void representarLista() {

  }
}
