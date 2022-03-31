package Perez_Castano_U6U7_Examen;

import java.io.Serializable;

public class Actor implements Serializable,Comparable<Actor> {
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private static Integer id = 0;
    private Integer aumentoId;

    public Actor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        id++;
        setAumentoId(id);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Actor.id = id;
    }

    public Integer getAumentoId() {
        return aumentoId;
    }

    public void setAumentoId(Integer aumentoId) {
        this.aumentoId = aumentoId;
    }

    @Override
    public int compareTo(Actor actor) {
        return nombre.compareTo(actor.getNombre());
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", Id=" + aumentoId +
                '}';
    }
}
