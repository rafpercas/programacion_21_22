package U7.examen2021;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- MENÚ ---");
        System.out.println("1. Cargar atleta");
        System.out.println("2. Guardar atleta ");
        System.out.println("3. Inscribir atleta");
        System.out.println("4. Guardar tiempo");
        System.out.println("5. Borrar atleta");
        System.out.println("6. Mostrar lista finishers");
        System.out.println("7. Mostras lista por categoria");
        System.out.println("8. Participantes por pais");
        System.out.println("9. Salir");
        Maraton a1 = new Maraton("Rafa","España",17.95, Maraton.enumCategorias.junior,true);
        System.out.println(a1);
        Maraton a2 = new Maraton("Rafa","España",17.95, Maraton.enumCategorias.junior,true);
        System.out.println(a2);
        Maraton.cargarAtletas();
    }
}
