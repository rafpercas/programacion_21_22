package Perez_Castano_U4_U5_EXAMEN;

public class Romancero extends Agrupacion implements Callejera {
  private String tematicaCartelon;

  public Romancero(
      String nombre,
      String autor,
      String autorMusica,
      String autorLetras,
      String tipo,
      String tematica) {
    super(nombre, autor, autorMusica, autorLetras, tipo);
    this.tematicaCartelon = tematica;
  }

  public String getTematicaCartelon() {
    return tematicaCartelon;
  }

  public void setTematicaCartelon(String tematicaCartelon) {
    this.tematicaCartelon = tematicaCartelon;
  }

  @Override
  public void amo_a_escucha() {
    System.out.println("Amo a escucha el Romancero " + this.nombre);
  }

  @Override
  public String toString() {
    return "Romancero{"
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
        + ", tematicaCartelon='"
        + tematicaCartelon
        + '\''
        + '}';
  }

  @Override
  public void cantar_la_presentacion() {
    System.out.println("Cantando la presentacion del romancero con nombre " + this.nombre);
  }

  @Override
  public void hacer_tipo() {
    System.out.println("El romancero " + this.nombre + " va de " + this.tipo);
  }
}
