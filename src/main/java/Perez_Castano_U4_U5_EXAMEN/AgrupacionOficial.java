package Perez_Castano_U4_U5_EXAMEN;

import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion {
  private Integer puntos;
  private Integrante[] arrayIntegrantes;

  public AgrupacionOficial(
      String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
    super(nombre, autor, autorMusica, autorLetras, tipo);
  }

  public Integer getPuntos() {
    return puntos;
  }

  public void setPuntos(Integer puntos) {
    this.puntos = puntos;
  }

  private int indiceArray = 0;

  public void insertar_integrante(Integrante integrante) {
    this.arrayIntegrantes =
            Arrays.copyOf(this.arrayIntegrantes, this.arrayIntegrantes.length + 1);
    this.arrayIntegrantes[indiceArray] = integrante;
    indiceArray++;
  }

  @Override
  public String toString() {
    return "AgrupacionOficial{"
        + "puntos="
        + puntos
        + ", arrayIntegrantes="
        + Arrays.toString(arrayIntegrantes)
        + ", indiceArray="
        + indiceArray
        + '}';
  }

  public boolean eliminar_integrante(Integrante integr) {
    for (int i = 0; i < this.arrayIntegrantes.length; i++) {
      if (integr.equals(this.arrayIntegrantes[i])) {
        Integrante[] arrayIntegrantes1 =
            Arrays.copyOfRange(this.arrayIntegrantes, i + 1, this.arrayIntegrantes.length);
        int indice = i;
        for (int j = 0; j < arrayIntegrantes1.length; j++) {
          this.arrayIntegrantes[indice] = arrayIntegrantes1[j];
          indice++;
        }
        this.arrayIntegrantes =
            Arrays.copyOf(this.arrayIntegrantes, this.arrayIntegrantes.length - 1);
        indiceArray--;
        return true;
      }
    }
    System.out.println("El elemento multimedia no se encuentra.");
    return false;
  }

  public abstract void caminito_del_falla();
}
