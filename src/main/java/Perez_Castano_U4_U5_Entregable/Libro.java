package Perez_Castano_U4_U5_Entregable;

public class Libro extends Multimedia {
  private String editorial;
  private String ISBN;
  private Integer paginas;

  public Libro(
      String titulo,
      String autor,
      Integer estreno,
      String editorial,
      String ISBN,
      Integer paginas) {
    super(titulo, autor, estreno);
    this.editorial = editorial;
    this.ISBN = ISBN;
    this.paginas = paginas;
    Multimedia.id += 1;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public Integer getPaginas() {
    return paginas;
  }

  public void setPaginas(Integer paginas) {
    this.paginas = paginas;
  }

  public void dar_por_finalizado() {
    System.out.println(this.titulo + " se ha marcado como finalizado.");
  }

  public String toString() {
    return this.titulo;
  }
}
