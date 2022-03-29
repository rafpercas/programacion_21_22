package entregable67corregido;

import java.io.*;
import java.util.*;

public class Exchange implements Serializable{
    private HashMap<Divisa, LinkedHashSet<ParCotizacion>> mapaCotizaciones;

    public HashMap<Divisa, LinkedHashSet<ParCotizacion>> getMapaCotizaciones() {
        return mapaCotizaciones;
    }

    public void setMapaCotizaciones(HashMap<Divisa, LinkedHashSet<ParCotizacion>> mapaCotizaciones) {
        this.mapaCotizaciones = mapaCotizaciones;
    }

    public Exchange(HashMap<Divisa, LinkedHashSet<ParCotizacion>> mapaCotizaciones) {
        this.mapaCotizaciones = mapaCotizaciones;
    }

    public Exchange() {
        this.mapaCotizaciones = new HashMap<>();
    }

    public void mostrarDivisasOrdenadas() {
        TreeMap<Divisa, LinkedHashSet<ParCotizacion>> nuevoMap = new TreeMap<>(mapaCotizaciones);
        Set<Map.Entry<Divisa, LinkedHashSet<ParCotizacion>>> e1 = nuevoMap.entrySet();
        for (Map.Entry<Divisa, LinkedHashSet<ParCotizacion>> entrada : e1) {
            System.out.println(entrada.getKey());
        }
    }

    public void obtenerCotizaciones(String simbolo) {
        Set<Map.Entry<Divisa, LinkedHashSet<ParCotizacion>>> e1 = mapaCotizaciones.entrySet();
        for (Map.Entry<Divisa, LinkedHashSet<ParCotizacion>> entrada : e1) {
            if (entrada.getKey().getSimbolo().equals(simbolo)){
                System.out.println("Pares cotización del " + simbolo + ":");
                System.out.println(entrada.getValue());
            }
        }
    }

    public void mostrarCotizacionesAlAlzaUnaHora() {
        ArrayList<ParCotizacion> paresAlAlza = new ArrayList<>();
        Set<Map.Entry<Divisa, LinkedHashSet<ParCotizacion>>> e1 = mapaCotizaciones.entrySet();
        for (Map.Entry<Divisa, LinkedHashSet<ParCotizacion>> entrada : e1) {
            for (ParCotizacion parCotizacion : entrada.getValue()) {
                if(parCotizacion.getVariacionPorcentual() > 0){
                    paresAlAlza.add(parCotizacion);
                }
            }
        }
        for (ParCotizacion p : paresAlAlza) {
            System.out.println(p + ", ");
        }
    }

    public void addCotizacion(ParCotizacion cotizacion) {
        if(!mapaCotizaciones.containsKey(cotizacion.getDivisaBase())) {
            mapaCotizaciones.put(cotizacion.getDivisaBase(), new LinkedHashSet<ParCotizacion>());
            mapaCotizaciones.get(cotizacion.getDivisaBase()).add(cotizacion);
        }
        mapaCotizaciones.get(cotizacion.getDivisaBase()).add(cotizacion);
    }

    public void guardarCotizaciones() {
        try (ObjectOutputStream flujo_salida =
                     new ObjectOutputStream(new FileOutputStream("src/main/java/U7/Entregable_Tarde_2122/cotizaciones.dat"))) {
            flujo_salida.writeObject(this.mapaCotizaciones);
        } catch (IOException e) {
            System.out.println("¡Error al escribir el fichero!");
        }
    }

    public void recuperarCotizaciones() {
        try (ObjectInputStream flujo_entrada =
                     new ObjectInputStream(new FileInputStream("src/main/java/U7/Entregable_Tarde_2122/cotizaciones.dat"))) {
            this.mapaCotizaciones = (HashMap<Divisa, LinkedHashSet<ParCotizacion>>) flujo_entrada.readObject();
        } catch (IOException e) {
            System.out.println("¡Error al leer el fichero!");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "mapaCotizaciones=" + mapaCotizaciones +
                '}';
    }
}
