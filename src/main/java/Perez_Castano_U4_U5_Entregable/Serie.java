package Perez_Castano_U4_U5_Entregable;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible {
  private Integer temporadas;
  private String[] capitulos = new String[0];
  private Integer indiceCap = 0;

  public Serie(String titulo, String autor, Integer estreno, Integer temporadas) {
    super(titulo, autor, estreno);
    this.temporadas = temporadas;
    Multimedia.id += 1;
  }

  public Integer getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(Integer temporadas) {
    this.temporadas = temporadas;
  }

  public String[] getCapitulos() {
    return capitulos;
  }

  public void setCapitulos(String[] capitulos) {
    this.capitulos = capitulos;
  }

  public void add_capitulo(String capitulo) {
    this.capitulos = Arrays.copyOf(this.capitulos, this.capitulos.length + 1);
    this.capitulos[indiceCap] = capitulo;
    indiceCap++;
  }

  public boolean eliminar_capitulo(String capitulo) {
    boolean eliminaCap = true;
    String[] nuevoArrayCap = new String[this.capitulos.length - 1];
    String[] nuevoArrayCap2 = new String[this.capitulos.length - 1];
    for (int i = 0; i < capitulos.length; i++) {
      if (eliminaCap) {
        System.out.println("Se ha eliminado el cap: " + capitulo);
        return true;
      }
      if (capitulo.equals(capitulos[i])) {
        nuevoArrayCap = Arrays.copyOfRange(capitulos, 0, i);
        nuevoArrayCap2 = Arrays.copyOfRange(capitulos, i + 1, capitulos.length);

      } else {
        System.out.println("No se ha eliminado, porque no existe ese capítulo.");
        return false;
      }
    }
    return eliminaCap;
  }

  public String toString() {
    return this.titulo;
  }

  public void dar_por_finalizado() {
    System.out.println(this.titulo + " se ha marcado como finalizado.");
  }

  @Override
  public void play() {
    System.out.println(
        "Reproduciendo serie: "
            + this.titulo
            + ", capítulo: "
            + this.capitulos[(int) (Math.random() * (capitulos.length) + 0)]);
  }

  @Override
  public void pause() {
    System.out.println(
        "Pausando serie: "
            + this.titulo
            + ", capítulo: "
            + this.capitulos[(int) (Math.random() * (capitulos.length) + 0)]);
  }

  @Override
  public void stop() {
    System.out.println(
        "Parando serie: "
            + this.titulo
            + ", capítulo: "
            + this.capitulos[(int) (Math.random() * (capitulos.length) + 0)]);
  }
}
