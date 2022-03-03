package entregable45;


    import java.util.Comparator;

    public class ComparadorPorAnyo implements Comparator {
        @Override
        public int compare(Object objeto1, Object objeto2) {
            Multimedia multimedia1 = (Multimedia) objeto1;
            Multimedia multimedia2 = (Multimedia) objeto2;

            if (multimedia1.getPremiereYear() < multimedia2.getPremiereYear()) {
                return -1;
            } else if (multimedia1.getPremiereYear() > multimedia2.getPremiereYear()) {
                return 1;
            }
            return 0;
        }
}
