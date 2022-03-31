package Perez_Castano_U6U7_Examen;

public class Main {
  public static void main(String[] args) {
    Pelicula p1 = new Pelicula("Scream",1990,"Thriller","Rafa");
    Pelicula p2 = new Pelicula("Scream 2",1992,"Terror","Serra");
    Pelicula p3 = new Pelicula("Scream 3",1994,"Comedia","Elena");
    Pelicula p4 = new Pelicula("Scream 4",1996,"Anime","Jorge");
    Pelicula p5 = new Pelicula("Scream 5",1998,"Thriller","Rafa");

    Actor a1 = new Actor("Vanessa","Perez","Rumana");
    Actor a2 = new Actor("Manuel","Solano","Española");
    Actor a3 = new Actor("Azahara","Perez","Estadounidense");
    Actor a4 = new Actor("Nevada","Perez","Española");
    Actor a5 = new Actor("Erytheia","Perez","Francesa");

    Filmaffinity f1 = new Filmaffinity();

    f1.addPeliculaActor(p1,a1);
    f1.addPeliculaActor(p1,a3);
    f1.addPeliculaActor(p1,a4);

    f1.addPeliculaActor(p2,a5);
    f1.addPeliculaActor(p2,a2);
    f1.addPeliculaActor(p2,a3);

    f1.addPeliculaActor(p3,a1);
    f1.addPeliculaActor(p3,a2);
    f1.addPeliculaActor(p3,a3);
    f1.addPeliculaActor(p3,a4);

    System.out.println(f1.getActores(p1));
    System.out.println("*************");
    System.out.println(f1.getActores(p2));
    System.out.println("*************");
    System.out.println(f1.getPeliculas(a1));

    f1.guardarDatos();
    f1.cargarDatos();

    System.out.println(f1.getActor("Manuel","Solano"));


    System.out.println(f1.getPelicula("Scream"));
  }
}
