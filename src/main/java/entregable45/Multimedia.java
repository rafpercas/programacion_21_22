package entregable45;

public abstract class Multimedia implements Comparable{
  protected String titulo;
  protected Integer premiereYear;
  private static Integer asignaID = 0;
  protected Integer id;
  protected boolean terminado;

  public static Integer getAsignaID() {
    return asignaID;
  }

  public static void setAsignaID(Integer asignaID) {
    Multimedia.asignaID = asignaID;
  }

  public boolean isTerminado() {
    return terminado;
  }

  public void setTerminado(boolean terminado) {
    this.terminado = terminado;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Integer getPremiereYear() {
    return premiereYear;
  }

  public void setPremiereYear(Integer premiereYear) {
    this.premiereYear = premiereYear;
  }

  public Multimedia(String titulo, Integer premiereYear) {
    this.titulo = titulo;
    this.premiereYear = premiereYear;
    asignaID++;
    setId(asignaID);
  }

  public abstract void darPorFinalizado();

  @Override
  public String toString() {
    return "" +
            "titulo='" + titulo + '\'' +
            ", premiereYear='" + premiereYear + '\'' +
            ", id=" + id +
            ", terminado=" + terminado ;
  }

  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Multimedia)) return 0;
    Multimedia that = (Multimedia) o;
    return (getId().compareTo(that.getId()));
  }
}
