package U4.Perez_Castano_U4_T1_Entrega;

import java.util.Arrays;

public class Vivienda {
  public enum enumEstanciasVivienda {
    salon,
    cocina,
    bano,
    dormitorio,
    terraza,
    vestibulo,
    comedor,
    balcon
  }

  private String direccion;
  private float metrosCuadrados;
  public enumEstanciasVivienda[] estanciaVivienda = new enumEstanciasVivienda[0];
  private int indiceEstancias = 0;

  public static void muestraEstancias() {
    System.out.println("Estancias: ");
    for (enumEstanciasVivienda estancias : enumEstanciasVivienda.values()) {
      System.out.println(estancias);
    }
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public float getMetrosCuadrados() {
    return metrosCuadrados;
  }

  public void setMetrosCuadrados(float metrosCuadrados) {
    this.metrosCuadrados = metrosCuadrados;
  }

  public enumEstanciasVivienda[] getEstanciaVivienda() {
    return estanciaVivienda;
  }

  public void setEstanciaVivienda(enumEstanciasVivienda[] estanciaVivienda) {
    this.estanciaVivienda = estanciaVivienda;
  }

  public Vivienda(String direccion, float metrosCuadrados) {
    this.direccion = direccion;
    this.metrosCuadrados = metrosCuadrados;
  }

  public void addEstancia(enumEstanciasVivienda estancia) {
    this.estanciaVivienda = Arrays.copyOf(this.estanciaVivienda, this.estanciaVivienda.length + 1);
    this.estanciaVivienda[indiceEstancias] = estancia;
    indiceEstancias++;
  }

  public void removeEstancia(Integer posicion) {
    enumEstanciasVivienda[] nuevoArrayEstancias =
        new enumEstanciasVivienda[this.estanciaVivienda.length-1];
    if (posicion <= this.estanciaVivienda.length) {
      for (int i = 0; i < posicion; i++) {
        nuevoArrayEstancias[i] = this.estanciaVivienda[i];
      }
      for (int i = posicion; i < nuevoArrayEstancias.length; i++) {
        nuevoArrayEstancias[i] = this.estanciaVivienda[i + 1];
      }
        this.estanciaVivienda = nuevoArrayEstancias;
    }else{
      System.out.println("La posición introducida está fuera de rango.");
    }

  }

  public void mostrar_informacion() {
    System.out.println("Direccion de la vivienda: " + getDireccion());
    System.out.println("Metros cuadrados: " + getMetrosCuadrados());
    System.out.println("Estancias: ");
    for (int i = 0; i < this.estanciaVivienda.length; i++) {
      System.out.println("   - " + this.estanciaVivienda[i]);
    }
  }
}
