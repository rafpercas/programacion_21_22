package Perez_Castano_U6U7_entregable;

public class Fiat extends Divisa {
  private String pais;

  public Fiat(String nombre, String simbolo, String pais) {
    super(nombre, simbolo);
    this.pais = pais;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  @Override
  public String toString() {
    return "Fiat: "
        + "nombre='"
        + getNombre()
        + '\''
        + ", simbolo='"
        + getSimbolo()
        + '\''
        + " id= "
        + getId()
        + " pais='"
        + pais
        + '\''
        + '}';
  }
}
