package Perez_Castano_U4_U5_EXAMEN;


import java.util.Comparator;

public class CompararPorAutor implements Comparator {
    @Override
    public int compare(Object objeto1, Object objeto2) {
        Agrupacion agru1 = (Agrupacion) objeto1;
        Agrupacion agru2 = (Agrupacion) objeto2;

        return (agru1.getAutor().compareTo(agru2.getAutor()));
    }
}
