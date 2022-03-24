package Perez_Castano_U6U7_entregable;

import java.io.*;
import java.util.*;

public class Exchange {
  private Divisa base;
  private Divisa destino;
  private static Map<Divisa, ParCotizacion> MapaExchange = new LinkedHashMap<>();

  public Exchange(Divisa base, Divisa destino) {
    this.base = base;
    this.destino = destino;
  }

  public void mostrarDivisasOrdenadas() {
    LinkedHashSet<Divisa> divisasOrdenadas = new LinkedHashSet<>(MapaExchange.keySet());
    ArrayList<Divisa> listaNueva = new ArrayList<>(divisasOrdenadas);
    System.out.println(listaNueva);
  }

  public void obtenerCotizaciones(String simbolo) {

    if (MapaExchange.containsValue(simbolo)) {
      System.out.println(MapaExchange.get(simbolo));
    } else {
      System.out.println("No se encuentra ese símbolo.");
    }
  }

  public void mostrarCotizacionesAlAlzaUnaHora() {}

  public void addCotizacion(ParCotizacion cotizacion) {
    MapaExchange.put(cotizacion.getBase(), cotizacion);
  }

  public void guardarCotizaciones() {
    try (ObjectOutputStream flujo_salida =
        new ObjectOutputStream(new FileOutputStream("cotizaciones.dat"))) {
      flujo_salida.writeObject(MapaExchange);

    } catch (IOException e) {
      System.out.println("Error al escribir el fichero.");
    }
  }

  public void recuperarCotizaciones() {
    try (ObjectInputStream flujo_entrada =
        new ObjectInputStream(new FileInputStream("cotizaciones.dat"))) {
      MapaExchange = (Map<Divisa, ParCotizacion>) flujo_entrada.readObject();

    } catch (IOException e) {
      System.out.println("Error al leer el fichero");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }

}
