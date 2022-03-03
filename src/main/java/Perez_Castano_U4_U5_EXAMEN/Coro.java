package Perez_Castano_U4_U5_EXAMEN;

import java.util.Arrays;

public class Coro extends AgrupacionOficial{
    private Integer numBandurrias;
    private Integer numGuitarras;

    public Integer getNumBandurrias() {
        return numBandurrias;
    }

    public void setNumBandurrias(Integer numBandurrias) {
        this.numBandurrias = numBandurrias;
    }

    public Integer getNumGuitarras() {
        return numGuitarras;
    }

    public void setNumGuitarras(Integer numGuitarras) {
        this.numGuitarras = numGuitarras;
    }

    public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer bandurrias, Integer guitarras) {
        super(nombre, autor, autorMusica, autorLetras, tipo);
        this.numBandurrias = bandurrias;
        this.numGuitarras = guitarras;

    }

    @Override
    public void caminito_del_falla(){
    System.out.println("El coro "+this.nombre+" va caminito del falla.");
    }
    @Override
    public String toString() {
        return "Coro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", autorMusica='" + autorMusica + '\'' +
                ", autorLetras='" + autorLetras + '\'' +
                ", tipo='" + tipo + '\'' +
                ", numBandurrias=" + numBandurrias +
                ", numGuitarras=" + numGuitarras +
                '}';
    }


    @Override
    public void cantar_la_presentacion() {
        System.out.println("Cantando la presentacion del coro con nombre "+this.nombre);

    }

    @Override
    public void hacer_tipo() {
        System.out.println("El coro "+this.nombre+" va de "+this.tipo);
    }
}
