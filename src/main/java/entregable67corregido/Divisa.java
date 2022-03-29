package entregable67corregido;

import java.io.Serializable;
import java.util.Objects;

public abstract class Divisa implements Comparable, Serializable {
    protected String nombre;
    protected String simbolo;
    protected Integer idDivisa;
    private static Integer asignaId = 1;

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

    public Integer getIdDivisa() {
        return idDivisa;
    }

    public void setIdDivisa(Integer idDivisa) {
        this.idDivisa = idDivisa;
    }

    public static Integer getAsignaId() {
        return asignaId;
    }

    public static void setAsignaId(Integer asignaId) {
        Divisa.asignaId = asignaId;
    }

    public Divisa(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.idDivisa = asignaId;
        setAsignaId(asignaId++);
    }

    @Override
    public String toString() {
        return "Divisa: " + "nombre='" + nombre + ", simbolo='" + simbolo + ", idDivisa=" + idDivisa;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Divisa)) return 0;
        Divisa that = (Divisa) o;
        return this.getSimbolo().compareTo(that.getSimbolo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Divisa divisa = (Divisa) o;
        return Objects.equals(this.simbolo, divisa.simbolo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simbolo);
    }
}
