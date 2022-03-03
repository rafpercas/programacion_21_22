package Perez_Castano_U4_U5_EXAMEN;

public class Main {
  public static void main(String[] args) {
    //Creo integrantes
    Integrante i1 = new Integrante("Rafa", 28, "Sevilla");
    System.out.println(i1);
    Integrante i2 = new Integrante("Serra", 28, "Mairena");
    System.out.println(i2);
    //Creo chirigota y comparsa
    Chirigota chiri1 = new Chirigota("Hola", "yo", "yo", "yo", "nose", 10);
    System.out.println(chiri1);
    Comparsa compar1 = new Comparsa("Nose", "Serra", "Serra", "Serra", "ni idea", "Serra");
    System.out.println(compar1);

  //metodo caminito del falla
    chiri1.caminito_del_falla();
    //metodo amo a escucha
    chiri1.amo_a_escucha();
    //metodo cantar la presentacion
    chiri1.cantar_la_presentacion();
    //metodo tipo
    chiri1.hacer_tipo();


    //Creo array de agrupaciones oficiales para Coac
    AgrupacionOficial[] agrupacion = {compar1, chiri1};
    Coac c1 = new Coac(agrupacion, 0);
    c1.inscribir_agrupacion(chiri1);
    c1.inscribir_agrupacion(compar1);
    c1.numeroAgrupaciones();
    System.out.println(c1);

  }
}
