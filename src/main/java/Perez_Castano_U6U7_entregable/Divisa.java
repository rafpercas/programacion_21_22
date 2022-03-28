package Perez_Castano_U6U7_entregable;

import java.util.Objects;

public abstract class Divisa //implements Comparable
{
  private String nombre;
  private String simbolo;
  private static Integer id = 0;
  private Integer aumentoId;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Divisa divisa = (Divisa) o;
    return Objects.equals(simbolo, divisa.simbolo) && Objects.equals(aumentoId, divisa.aumentoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simbolo, aumentoId);
  }

  public Divisa(String nombre, String simbolo) {
    this.nombre = nombre;
    this.simbolo = simbolo;
    id++;
    setAumentoId(id);
    //this.aumentoId = id++;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getSimbolo() {
    return simbolo;
  }

  public void setSimbolo(String simbolo) {
    this.simbolo = simbolo;
  }

  public static Integer getId() {
    return id;
  }

  public static void setId(Integer id) {
    Divisa.id = id;
  }

  public Integer getAumentoId() {
    return aumentoId;
  }

  public void setAumentoId(Integer aumentoId) {
    this.aumentoId = aumentoId;
  }

  @Override
  public String toString() {
    return "Divisa{" + "nombre='" + nombre + '\'' + ", simbolo='" + simbolo + '\'' + '}';
  }

}
