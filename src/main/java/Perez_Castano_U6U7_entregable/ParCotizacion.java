package Perez_Castano_U6U7_entregable;

import java.util.Objects;

public class ParCotizacion {
  private Divisa base;
  private Divisa destino;
  private Double precioEntreDivisas;
  private Double variacion;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ParCotizacion that = (ParCotizacion) o;
    return Objects.equals(base, that.base) && Objects.equals(destino, that.destino) && Objects.equals(precioEntreDivisas, that.precioEntreDivisas) && Objects.equals(variacion, that.variacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, destino, precioEntreDivisas, variacion);
  }

  public ParCotizacion(Divisa base, Divisa destino, Double precioEntreDivisas, Double variacion) {
    this.base = base;
    this.destino = destino;
    this.precioEntreDivisas = precioEntreDivisas;
    this.variacion = variacion;
  }

  public Divisa getBase() {
    return base;
  }

  public void setBase(Divisa base) {
    this.base = base;
  }

  public Divisa getDestino() {
    return destino;
  }

  public void setDestino(Divisa destino) {
    this.destino = destino;
  }

  public Double getPrecioEntreDivisas() {
    return precioEntreDivisas;
  }

  public void setPrecioEntreDivisas(Double precioEntreDivisas) {
    this.precioEntreDivisas = precioEntreDivisas;
  }

  public Double getVariacion() {
    return variacion;
  }

  public void setVariacion(Double variacion) {
    this.variacion = variacion;
  }

  @Override
  public String toString() {
    return "ParCotizacion{"
        + "base="
        + base.getNombre()
        + ", destino="
        + destino.getNombre()
        + ", precioEntreDivisas="
        + precioEntreDivisas
        + ", variacion="
        + variacion
        + '}';
  }
}
