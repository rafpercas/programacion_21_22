package Perez_Castano_U6U7_Examen;

import java.io.Serializable;

public class Pelicula implements Serializable,Comparable<Pelicula> {
    private String titulo;
    private Integer anyoEstreno;
    private String genero;
    private String director;
    private static Integer id = 0;
    private Integer aumentoId;

    public Pelicula(String titulo, Integer anyoEstreno, String genero, String director) {
        this.titulo = titulo;
        this.anyoEstreno = anyoEstreno;
        this.genero = genero;
        this.director = director;
        id++;
        setAumentoId(id);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnyoEstreno() {
        return anyoEstreno;
    }

    public void setAnyoEstreno(Integer anyoEstreno) {
        this.anyoEstreno = anyoEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public static Integer getId() {
        return id;
    }

    public static void setId(Integer id) {
        Pelicula.id = id;
    }

    public Integer getAumentoId() {
        return aumentoId;
    }

    public void setAumentoId(Integer aumentoId) {
        this.aumentoId = aumentoId;
    }

    @Override
    public int compareTo(Pelicula pelicula) {
        return titulo.compareTo(pelicula.getTitulo());
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", anyoEstreno=" + anyoEstreno +
                ", genero='" + genero + '\'' +
                ", director='" + director + '\'' +
                ", Id=" + aumentoId +
                '}';
    }
}
