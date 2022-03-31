package Perez_Castano_U6U7_Examen;

import java.io.*;
import java.util.*;

public class Filmaffinity implements Serializable {
  private List<Pelicula> listaPeliculas = new ArrayList<>();
  private List<Actor> listaActores = new ArrayList<>();
  private HashMap<Pelicula, List<Actor>> mapaPeliActores = new LinkedHashMap<>();
  private HashMap<Actor, List<Pelicula>> mapaActorPelis = new LinkedHashMap<>();

  public List<Pelicula> getListaPeliculas() {
    return listaPeliculas;
  }

  public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
    this.listaPeliculas = listaPeliculas;
  }

  public List<Actor> getListaActores() {
    return listaActores;
  }

  public void setListaActores(ArrayList<Actor> listaActores) {
    this.listaActores = listaActores;
  }

  public HashMap<Pelicula, List<Actor>> getMapaPeliActores() {
    return mapaPeliActores;
  }

  public void setMapaPeliActores(HashMap<Pelicula, List<Actor>> mapaPeliActores) {
    this.mapaPeliActores = mapaPeliActores;
  }

  public HashMap<Actor, List<Pelicula>> getMapaActorPelis() {
    return mapaActorPelis;
  }

  public void setMapaActorPelis(HashMap<Actor, List<Pelicula>> mapaActorPelis) {
    this.mapaActorPelis = mapaActorPelis;
  }

  public void addPeliculaActor(Pelicula p, Actor a) {
    this.listaPeliculas.add(p);
    this.listaActores.add(a);
    if (!mapaPeliActores.containsKey(p)) {
      ArrayList<Actor> actores = new ArrayList<>();
      actores.add(a);
      mapaPeliActores.put(p, actores);
    } else {
      mapaPeliActores.get(p).add(a);
    }
    if (!mapaActorPelis.containsKey(a)) {
      ArrayList<Pelicula> pelis = new ArrayList<>();
      pelis.add(p);
      mapaActorPelis.put(a, pelis);
    } else {
      mapaActorPelis.get(a).add(p);
    }
  }

  public List<Actor> getActores(Pelicula p) {
    Set<Actor> lista =
        new TreeSet<>(
            new Comparator<Actor>() {
              @Override
              public int compare(Actor a1, Actor a2) {
                return a1.getApellido().compareTo(a2.getApellido());
              }
            });
    Set<Map.Entry<Pelicula, List<Actor>>> entradas = mapaPeliActores.entrySet();
    Iterator<Map.Entry<Pelicula, List<Actor>>> it = entradas.iterator();
    List<Actor> resultado = new ArrayList<Actor>();
    while (it.hasNext()) {
      Map.Entry<Pelicula, List<Actor>> entrada = it.next();
      resultado.addAll(entrada.getValue());
    }
    return resultado;
  }

  public List<Pelicula> getPeliculas(Actor a) {
    Set<Pelicula> lista =
        new TreeSet<>(
            new Comparator<Pelicula>() {
              @Override
              public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
              }
            });
    Set<Map.Entry<Actor, List<Pelicula>>> entradas = mapaActorPelis.entrySet();
    Iterator<Map.Entry<Actor, List<Pelicula>>> it = entradas.iterator();
    List<Pelicula> resultado = new ArrayList<Pelicula>();
    while (it.hasNext()) {
      Map.Entry<Actor, List<Pelicula>> entrada = it.next();
      resultado.addAll(entrada.getValue());
    }
    return resultado;
  }

  public Pelicula getPelicula(String titulo) {
    Pelicula resultado = null;
    for (int i = 0; i < listaPeliculas.size(); i++) {
      if (listaPeliculas.get(i).getTitulo().equals(titulo)) {
        resultado = listaPeliculas.get(i);
      }
    }
    return resultado;
  }

  public void removePelicula(String titulo) {}

  public Actor getActor(String nombre, String apellido) {
    Actor resultado = null;
      for (int i = 0; i < listaActores.size(); i++) {
          if (listaActores.get(i).getNombre().equals(nombre) && listaActores.get(i).getApellido().equals(apellido)) {
              resultado = listaActores.get(i);
          }
      }
      return resultado;
  }


  public void guardarDatos() {

    try (ObjectOutputStream out =
        new ObjectOutputStream(
            new FileOutputStream("src/main/java/Perez_Castano_U6U7_Examen/filmaffinity.dat"))) {
      Set<Map.Entry<Actor, List<Pelicula>>> entradas = mapaActorPelis.entrySet();
      Set<Pelicula> completa = new TreeSet<>();
      Iterator<Map.Entry<Actor, List<Pelicula>>> it = entradas.iterator();
      while (it.hasNext()) {
        Map.Entry<Actor, List<Pelicula>> entrada = it.next();
        completa.addAll(entrada.getValue());
      }
      out.writeObject(completa);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public void cargarDatos() {
    try (ObjectInputStream flujoEntrada = new ObjectInputStream(new FileInputStream(""))) {
      mapaActorPelis = (HashMap<Actor, List<Pelicula>>) flujoEntrada.readObject();

    } catch (IOException e) {
      System.out.println("Error al leer el fichero");
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}
