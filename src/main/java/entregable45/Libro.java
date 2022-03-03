package entregable45;

public class Libro extends Multimedia{
  private String autor;
  private String editorial;
  private Long numeroISBN;
  private Integer numeroPaginas;

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public Long getNumeroISBN() {
    return numeroISBN;
  }

  public void setNumeroISBN(Long numeroISBN) {
    this.numeroISBN = numeroISBN;
  }

  public Integer getNumeroPaginas() {
    return numeroPaginas;
  }

  public void setNumeroPaginas(Integer numeroPaginas) {
    this.numeroPaginas = numeroPaginas;
  }

  public Libro(String titulo, Integer premiereYear, String autor, String editorial, Long numeroISBN, Integer numeroPaginas) {
    super(titulo, premiereYear);
    this.autor = autor;
    this.editorial = editorial;
    this.numeroISBN = numeroISBN;
    this.numeroPaginas = numeroPaginas;
  }

  @Override
  public void darPorFinalizado() {
    setTerminado(true);
    System.out.println("Usted ha terminado el libro " + this.titulo + ".");
  }

  @Override
  public String toString() {
    return "Libro{" +
            super.toString() +
            ", autor='" + autor + '\'' +
            ", editorial='" + editorial + '\'' +
            ", numeroISBN=" + numeroISBN +
            ", numeroPaginas=" + numeroPaginas +
            '}';
  }
}
