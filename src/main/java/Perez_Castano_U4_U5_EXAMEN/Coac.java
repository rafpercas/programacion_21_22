package Perez_Castano_U4_U5_EXAMEN;

import java.util.Arrays;

public class Coac {

  private AgrupacionOficial[] arrayAgrupaciones;
  private Integer indiceArray;

  public Coac(AgrupacionOficial[] arrayAgrupaciones, Integer indiceArray) {
    this.arrayAgrupaciones = arrayAgrupaciones;
    this.indiceArray = indiceArray;
  }

  public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
    this.arrayAgrupaciones =
        Arrays.copyOf(this.arrayAgrupaciones, this.arrayAgrupaciones.length + 1);
    this.arrayAgrupaciones[indiceArray] = agrupacion;
    indiceArray++;
  }

  public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {

    return true;
  }

  public void ordenar_por_puntos() {
    Arrays.sort(this.arrayAgrupaciones, new CompararPorPuntos());
  }

  public void ordenar_por_nombre() {}

  public void ordenar_por_autor() {
    Arrays.sort(this.arrayAgrupaciones, new CompararPorAutor());
  }

  public void numeroAgrupaciones() {
    System.out.println();
  }

  @Override
  public String toString() {
    return "Coac{" + "arrayAgrupaciones=" + Arrays.toString(arrayAgrupaciones);
  }
}
