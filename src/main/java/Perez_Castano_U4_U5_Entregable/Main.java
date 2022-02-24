package Perez_Castano_U4_U5_Entregable;

public class Main {
  public static void main(String[] args) {
    //Creo los objetos p1,s1,s2 y l1 con sus respectivas clases
    Pelicula p1 = new Pelicula("Scream 5", "yo", 2015, 120, "yo", "españa");
    Serie s1 = new Serie("Pokemon", "yo tambien", 2022, 17);
    Serie s2 = new Serie("Digimon", "yo tambien", 2022, 17);
    Libro l1 = new Libro("no", "yo", 2019, "micasa", "AC123", 247);

    //Creo c1
    Catalogo c1 = new Catalogo();

    //Añado multimedias al catalogo c1
    c1.add_multimedia(p1);
    c1.add_multimedia(s1);
    c1.add_multimedia(s2);

    //Elimino elemento multimedia del catalogo c1
    c1.eliminar_multimedia(s1);

    //Pregunto el numero de elementos del catalogo c1
    c1.numero_de_elementos();

    c1.add_multimedia(l1);

    c1.numero_de_elementos();

    //Doy por finalizados los objetos p1,s1 y l1
    p1.dar_por_finalizado();
    s1.dar_por_finalizado();
    l1.dar_por_finalizado();

    //Añado capitulos al objeto s1
    s1.add_capitulo("S01E01");
    s1.add_capitulo("S01E02");
    s1.add_capitulo("S01E03");
    s1.add_capitulo("S01E04");

    //Elimino capitulo de s1
    s1.eliminar_capitulo("S01E03");

    //Uso los métodos play, pause y stop en los objetos s1 y p1
    s1.play();
    s1.pause();
    s1.stop();

    p1.play();
    p1.pause();
    p1.stop();
  }
}
