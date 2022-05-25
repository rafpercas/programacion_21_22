package U9.MySQL.examenpruebau8u9;

public class Main {
    public static void main(String[] args) {
        ModificacionDOM modiDom = new ModificacionDOM();
        modiDom.parseDOM("programacion_21_22/src/main/java/U9/MySQL/examenpruebau8u9/ejercicio.xml");
        Libro l1 = new Libro("rafa1","rafa","rafaelo","200","noruega");
        modiDom.addLibro(l1);
        RecorridoStax recStax = new RecorridoStax();
        recStax.numPostsStax("programacion_21_22/src/main/java/U9/MySQL/examenpruebau8u9/ejercicio2.xml");

    }
}
