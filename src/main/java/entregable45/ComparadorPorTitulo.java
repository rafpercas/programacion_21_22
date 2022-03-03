package entregable45;


    import java.util.Comparator;

    public class ComparadorPorTitulo implements Comparator {
        @Override
        public int compare(Object objeto1, Object objeto2) {
            Multimedia multimedia1 = (Multimedia) objeto1;
            Multimedia multimedia2 = (Multimedia) objeto2;

            return (multimedia1.getTitulo().compareTo(multimedia2.getTitulo()));
        }
}
