package Perez_Castano_U4_U5_EXAMEN;

import java.util.Arrays;

public class Cuarteto extends AgrupacionOficial implements Callejera{
    private Integer numMiembros;

    public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipo,Integer miembros) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.numMiembros = miembros;
    }


    public Integer getNumMiembros() {
        return numMiembros;
    }

    public void setNumMiembros(Integer numMiembros) {
        this.numMiembros = numMiembros;
    }

    @Override
    public void amo_a_escucha() {
        System.out.println("Amo a escucha el Cuarteto "+this.nombre);
    }
    @Override
    public void caminito_del_falla(){
        System.out.println("El cuarteto "+this.nombre+" va caminito del falla.");
    }
    @Override
    public String toString() {
        return "Cuarteto{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numMiembros=" + numMiembros +
                '}';
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del cuarteto con nombre "+this.nombre);
    }

    @Override
    public void hacer_tipo() {
        System.out.println("La cuarteto "+this.nombre+" va de "+this.tipo);

    }
}
