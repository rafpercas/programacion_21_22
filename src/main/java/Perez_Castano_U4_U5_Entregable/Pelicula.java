package Perez_Castano_U4_U5_Entregable;

public class Pelicula extends Multimedia implements Reproducible {

  private Integer duracion;
  private String productora;
  private String pais;

  public Pelicula(
      String titulo,
      String autor,
      Integer estreno,
      Integer duracion,
      String productora,
      String pais) {
    super(titulo, autor, estreno);
    this.duracion = duracion;
    this.productora = productora;
    this.pais = pais;
    Multimedia.id += 1;
  }

  public Integer getDuracion() {
    return duracion;
  }

  public void setDuracion(Integer duracion) {
    this.duracion = duracion;
  }

  public String getProductora() {
    return productora;
  }

  public void setProductora(String productora) {
    this.productora = productora;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String toString() {
    return "Título: "
        + this.titulo
        + ", Autor: "
        + this.autor
        + ", Año estreno: "
        + this.estreno
        + ", Duracion: "
        + this.duracion
        + ", Productora: "
        + this.productora
        + ", Pais: "
        + this.pais;
  }

  public void dar_por_finalizado() {
    System.out.println(this.titulo + " se ha marcado como finalizado.");
  }

  @Override
  public void play() {
    System.out.println("Reproduciendo película: " + this.titulo);
  }

  @Override
  public void pause() {
    System.out.println("Pausando película: " + this.titulo);
  }

  @Override
  public void stop() {
    System.out.println("Parando película: " + this.titulo);
  }
}
