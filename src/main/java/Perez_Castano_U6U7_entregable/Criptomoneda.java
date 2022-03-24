package Perez_Castano_U6U7_entregable;

import java.util.Date;

public class Criptomoneda extends Divisa {
  private Double precioUsd;
  private Double volumenTran;
  private String fechaCreacion;
  private Integer ranking = (int) (Math.random() * 10);

  public Criptomoneda(
      String nombre, String simbolo, Double precioUsd, Double volumenTran, String fechaCreacion) {
    super(nombre, simbolo);
    this.precioUsd = precioUsd;
    this.volumenTran = volumenTran;
    this.fechaCreacion = fechaCreacion;
  }

  public Double getPrecioUsd() {
    return precioUsd;
  }

  public void setPrecioUsd(Double precioUsd) {
    this.precioUsd = precioUsd;
  }

  public Double getVolumenTran() {
    return volumenTran;
  }

  public void setVolumenTran(Double volumenTran) {
    this.volumenTran = volumenTran;
  }

  public String getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(String fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public Integer getRanking() {
    return ranking;
  }

  public void setRanking(Integer ranking) {
    this.ranking = ranking;
  }

  @Override
  public String toString() {
    return "Criptomoneda: "
        + "nombre='"
        + getNombre()
        + '\''
        + ", simbolo='"
        + getSimbolo()
        + '\''
        + "precioUsd="
        + precioUsd
        + ", volumenTran="
        + volumenTran
        + ", fechaCreacion='"
        + fechaCreacion
        + '\''
        + ", ranking="
        + ranking
        + ", id= "
        + getId()
        + '}';
  }
}
