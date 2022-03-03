package Perez_Castano_U4_U5_EXAMEN;

import java.util.Arrays;

public class Comparsa extends AgrupacionOficial {
  private String empresaAtrezzo;

  public Comparsa(
      String nombre,
      String autor,
      String autorMusica,
      String autorLetras,
      String tipo,
      String atrezzo) {
    super(nombre, autor, autorMusica, autorLetras, tipo);
    this.empresaAtrezzo = atrezzo;
  }

  public String getEmpresaAtrezzo() {
    return empresaAtrezzo;
  }

  public void setEmpresaAtrezzo(String empresaAtrezzo) {
    this.empresaAtrezzo = empresaAtrezzo;
  }

  @Override
  public void caminito_del_falla() {
    System.out.println("La comparsa " + this.nombre + " va caminito del falla.");
  }

  @Override
  public String toString() {
    return "Comparsa{"
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
        + ", empresaAtrezzo='"
        + empresaAtrezzo
        + '\''
        + '}'
        + "totalAgrupaciones="
        + totalAgrupaciones
        + '}';
  }

  @Override
  public void cantar_la_presentacion() {
    System.out.println("Cantando la presentacion de la comparsa con nombre " + this.nombre);
  }

  @Override
  public void hacer_tipo() {
    System.out.println("La comparsa " + this.nombre + " va de " + this.tipo);
  }
}
