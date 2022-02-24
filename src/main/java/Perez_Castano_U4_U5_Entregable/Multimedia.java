package Perez_Castano_U4_U5_Entregable;

public abstract class Multimedia {
  public String titulo;
  public String autor;
  public Integer estreno;
  public static Integer id = 0;

  public Multimedia(String titulo, String autor, Integer estreno) {
    this.titulo = titulo;
    this.autor = autor;
    this.estreno = estreno;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public Integer getEstreno() {
    return estreno;
  }

  public void setEstreno(Integer estreno) {
    this.estreno = estreno;
  }

  public static Integer getId() {
    return id;
  }

  public static void setId(Integer id) {
    Multimedia.id = id;
  }
}
