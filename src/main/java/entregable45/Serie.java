package entregable45;

import java.util.Arrays;

public class Serie extends Multimedia implements Reproducible{
  private String creadorSerie;
  private Integer numeroTemporadas;
  private String[] capitulos;
  private Integer indiceCapitulos;

  public Integer getIndiceCapitulos() {
    return indiceCapitulos;
  }

  public void setIndiceCapitulos(Integer indiceCapitulos) {
    this.indiceCapitulos = indiceCapitulos;
  }

  public String getCreadorSerie() {
    return creadorSerie;
  }

  public void setCreadorSerie(String creadorSerie) {
    this.creadorSerie = creadorSerie;
  }

  public Integer getNumeroTemporadas() {
    return numeroTemporadas;
  }

  public void setNumeroTemporadas(Integer numeroTemporadas) {
    this.numeroTemporadas = numeroTemporadas;
  }

  public Serie(String titulo, Integer premiereYear, String creadorSerie, Integer numeroTemporadas, String[] capitulos) {
    super(titulo, premiereYear);
    this.creadorSerie = creadorSerie;
    this.numeroTemporadas = numeroTemporadas;
    this.capitulos = capitulos;
    this.indiceCapitulos = capitulos.length;
  }

  public void addCapitulo(String capitulo) {
    this.capitulos = Arrays.copyOf(this.capitulos, this.capitulos.length + 1);
    this.capitulos[indiceCapitulos] = capitulo;
    indiceCapitulos++;
  }

  public boolean eliminarCapitulo(String capitulo) {
    for (int i = 0; i < this.capitulos.length; i++) {
      if(capitulo.equals(this.capitulos[i])){
        String[] Aux = Arrays.copyOfRange(this.capitulos, i+1, this.capitulos.length);
        int numearoAux = i;
        for (int j = 0; j < Aux.length; j++){
          this.capitulos[numearoAux] = Aux[j];
          numearoAux++;
        }
        this.capitulos = Arrays.copyOf(this.capitulos, this.capitulos.length - 1);
        indiceCapitulos--;
        return true;
      }
    }
    System.out.println("El capítulo no se encuentra.");
    return false;
  }

  @Override
  public void play() {
    System.out.println("Reproduciendo serie " + this.titulo + " en el capítulo " + capitulos[(int) (Math.random() * capitulos.length)]);
  }

  @Override
  public void pause() {
    System.out.println("Pausando serie " + this.titulo + " en el capítulo " + capitulos[(int) (Math.random() * capitulos.length)]);
  }

  @Override
  public void stop() {
    System.out.println("Parando serie " + this.titulo + " en el capítulo " + capitulos[(int) (Math.random() * capitulos.length)]);
  }

  @Override
  public void darPorFinalizado() {
    setTerminado(true);
    System.out.println("Usted ha terminado la serie " + this.titulo + ".");
  }

  @Override
  public String toString() {
    return "Serie{" +
            super.toString() +
            ", creadorSerie='" + creadorSerie + '\'' +
            ", numeroTemporadas=" + numeroTemporadas +
            ", capitulos=" + Arrays.toString(capitulos) +
            '}';
  }
}
