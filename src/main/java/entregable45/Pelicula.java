package entregable45;

public class Pelicula extends Multimedia implements Reproducible{
  private String director;
  private Double duracionEnMinutos;
  private String productora;
  private String pais;

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public Double getDuracionEnMinutos() {
    return duracionEnMinutos;
  }

  public void setDuracionEnMinutos(Double duracionEnMinutos) {
    this.duracionEnMinutos = duracionEnMinutos;
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

  public Pelicula(String titulo, Integer premiereYear, String director, Double duracionEnMinutos, String productora, String pais) {
    super(titulo, premiereYear);
    this.director = director;
    this.duracionEnMinutos = duracionEnMinutos;
    this.productora = productora;
    this.pais = pais;
  }

  @Override
  public void play() {
    System.out.println("Reproduciendo película " + this.titulo + ".");
  }

  @Override
  public void pause() {
    System.out.println("Pausando película " + this.titulo + ".");
  }

  @Override
  public void stop() {
    System.out.println("Parando película " + this.titulo + ".");
  }

  @Override
  public void darPorFinalizado() {
    setTerminado(true);
    System.out.println("Usted ha terminado la película " + this.titulo + ".");
  }

  @Override
  public String toString() {
    return "Pelicula{" +
            super.toString() +
            " director='" + director + '\'' +
            ", duracionEnMinutos=" + duracionEnMinutos +
            ", productora='" + productora + '\'' +
            ", pais='" + pais + '\'' +
            '}';
  }
}
