package Perez_Castano_U4_U5_EXAMEN;

public abstract class Agrupacion {
  public Integer totalAgrupaciones = 0;
  protected String nombre;
  protected String autor;
  protected String autorMusica;
  protected String autorLetras;
  protected String tipo;

  public Agrupacion(
      String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
    this.nombre = nombre;
    this.autor = autor;
    this.autorMusica = autorMusica;
    this.autorLetras = autorLetras;
    this.tipo = tipo;
    totalAgrupaciones+=getTotalAgrupaciones();

  }

  public Integer getTotalAgrupaciones() {
    return totalAgrupaciones;
  }

  public void setTotalAgrupaciones(Integer totalAgrupaciones) {
    this.totalAgrupaciones = totalAgrupaciones;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutorMusica() {
    return autorMusica;
  }

  public void setAutorMusica(String autorMusica) {
    this.autorMusica = autorMusica;
  }

  public String getAutorLetras() {
    return autorLetras;
  }

  public void setAutorLetras(String autorLetras) {
    this.autorLetras = autorLetras;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public abstract void cantar_la_presentacion();

  public abstract void hacer_tipo();

  @Override
  public String toString() {
    return "Agrupacion{"
        + "totalAgrupaciones="
        + totalAgrupaciones
        + ", nombre='"
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
        + '}';
  }
}
