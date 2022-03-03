package Perez_Castano_U4_U5_EXAMEN;

import java.util.Arrays;

public class Chirigota extends AgrupacionOficial implements Callejera {
  private Integer numCuples;

  public Chirigota(
      String nombre,
      String autor,
      String autorMusica,
      String autorLetras,
      String tipo,
      Integer cuples) {
    super(nombre, autor, autorMusica, autorLetras, tipo);
    this.numCuples = cuples;
  }

  public Integer getNumCuples() {
    return numCuples;
  }

  public void setNumCuples(Integer numCuples) {
    this.numCuples = numCuples;
  }


  @Override
  public void amo_a_escucha() {
    System.out.println("Amo a escucha la Chirigota " + this.nombre);
  }

  @Override
  public void caminito_del_falla() {
    System.out.println("La chirigota " + this.nombre + " va caminito del falla.");
  }

  @Override
  public String toString() {
    return "Chirigota{"
        + "nombre='"
        + nombre
        + '\''
        + ", autor='"
        + autor
        + '\''
        + ", autorMusica='"
        + autorMusica
        + '\''
        + ", autorLetras='"
        + autorLetras
        + '\''
        + ", tipo='"
        + tipo
        + '\''
        + ", numCuples="
        + numCuples
        + '}'
        + "totalAgrupaciones="
        + totalAgrupaciones
        + '}';
  }

  @Override
  public void cantar_la_presentacion() {
    System.out.println("Cantando la presentacion de la chirigota con nombre " + this.nombre);
  }

  @Override
  public void hacer_tipo() {
    System.out.println("La chirigota " + this.nombre + " va de " + this.tipo);
  }
}
