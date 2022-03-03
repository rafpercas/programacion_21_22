package entregable45;

import java.util.Arrays;

public class Catalogo {
  private Multimedia[] coleccion;
  private Integer indiceColeccion;

  public Integer getIndiceColeccion() {
    return indiceColeccion;
  }

  public void setIndiceColeccion(Integer indiceColeccion) {
    this.indiceColeccion = indiceColeccion;
  }

  public Multimedia[] getColeccion() {
    return coleccion;
  }

  public void setColeccion(Multimedia[] coleccion) {
    this.coleccion = coleccion;
  }

  public Catalogo(Multimedia[] coleccion) {
    this.coleccion = coleccion;
    indiceColeccion = coleccion.length;
  }

  public void addMultimedia(Multimedia elemento){
    this.coleccion = Arrays.copyOf(this.coleccion, this.coleccion.length + 1);
    this.coleccion[indiceColeccion] = elemento;
    indiceColeccion++;

  }

  public boolean eleminarMultimedia (Multimedia elemento){
    for (int i = 0; i < this.coleccion.length; i++) {
      if(elemento.equals(this.coleccion[i])){
        Multimedia[] Aux = Arrays.copyOfRange(this.coleccion, i+1, this.coleccion.length);
        int numearoAux = i;
        for (int j = 0; j < Aux.length; j++){
          this.coleccion[numearoAux] = Aux[j];
          numearoAux++;
        }
        this.coleccion = Arrays.copyOf(this.coleccion, this.coleccion.length - 1);
        indiceColeccion--;
        return true;
      }
    }
    System.out.println("El elemento multimedia no se encuentra.");
    return false;
  }

  public void ordenarPorId() {
    Arrays.sort(this.coleccion);
  }

  public void ordenarPorTitulo() {
    Arrays.sort(this.coleccion, new ComparadorPorTitulo());
  }

  public void ordenarPorAnyo(){
    Arrays.sort(this.coleccion, new ComparadorPorAnyo());
  }

  public Integer numeroElementos() {
    return indiceColeccion;
  }

  @Override
  public String toString() {
    return "Catalogo{" +
            "coleccion=" + Arrays.toString(coleccion) +
            '}';
  }

}
