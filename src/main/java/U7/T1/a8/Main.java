package U7.T1.a8;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

// Actividad 8: Implementar una función a la que se le pase una lista de nombres y devuelva una
// copia sin elementos repetidos (sin modificar la original), con el prototipo:
//
// List eliminaRepetidos (List c)
public class Main {
    public static void main(String[] args) {
        ArrayList<String> listaReal = new ArrayList<>();
        String s1 = "Rafa";
        String s2 = "Serra";
        String s3 = "Jorge";
        String s4 = "Babs";
        String s5 = "Mercedes";
        String s6 = "Manuel";
        String s7 = "Rafa";
        listaReal.add(s1);
        listaReal.add(s2);
        listaReal.add(s3);
        listaReal.add(s4);
        listaReal.add(s5);
        listaReal.add(s6);
        listaReal.add(s7);

        System.out.println(eliminarRepetidos(listaReal));
    }

    private static List eliminarRepetidos(List lista) {
        LinkedHashSet<String> listaSinRepes = new LinkedHashSet<>();
        listaSinRepes.addAll(lista);
        ArrayList<String> listaNueva = new ArrayList<>();
        listaNueva.addAll(listaSinRepes);
        return listaNueva;
    }

}

