package U7.examen2021;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maraton {
    private static Map<String, Maraton> MapaAtletas = new LinkedHashMap<>();
    enum enumCategorias{
        senior,
        junior,
        veterano
    }
    private String nombre;
    private String pais;
    private Double marca;
    private enumCategorias categoria;
    private boolean finisher;
    private static Integer dorsal = 0;
    private Integer aumentoDorsal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Double getMarca() {
        return marca;
    }

    public void setMarca(Double marca) {
        this.marca = marca;
    }

    public enumCategorias getCategoria() {
        return categoria;
    }

    public void setCategoria(enumCategorias categoria) {
        this.categoria = categoria;
    }

    public boolean isFinisher() {
        return finisher;
    }

    public void setFinisher(boolean finisher) {
        this.finisher = finisher;
    }

    public static Integer getDorsal() {
        return dorsal;
    }

    public static void setDorsal(Integer dorsal) {
        Maraton.dorsal = dorsal;
    }

    public Integer getAumentoDorsal() {
        return aumentoDorsal;
    }

    public void setAumentoDorsal(Integer aumentoDorsal) {
        this.aumentoDorsal = aumentoDorsal;
    }


    public Maraton(String nombre, String pais, Double marca, enumCategorias categoria, boolean finisher) {
        this.nombre = nombre;
        this.pais = pais;
        this.marca = marca;
        this.categoria = categoria;
        this.finisher = finisher;
        dorsal++;
        setAumentoDorsal(dorsal);
    }

    @Override
    public String toString() {
        return "Maraton{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", marca=" + marca +
                ", categoria=" + categoria +
                ", finisher=" + finisher +
                ", dorsal=" + aumentoDorsal +
                '}';
    }
    public static void cargarAtletas(){
        try (ObjectOutputStream flujo_salida =
                     new ObjectOutputStream(new FileOutputStream("maraton.dat"))) {
            flujo_salida.writeObject(MapaAtletas);

        } catch (IOException e) {
            System.out.println("¡Error al escribir el fichero!");
        }
    }
}
