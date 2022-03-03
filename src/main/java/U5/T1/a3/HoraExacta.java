package U5.T1.a3;

public class HoraExacta extends Hora {
    private Integer segundo;
    private static Integer segundo2;

    public HoraExacta(Integer hora, Integer minuto, Integer segundo) {
        super(hora, minuto);
        this.segundo = segundo;
    }

    public void setSegundo(Integer segundo) {
        //añadir cuando meta por ejemplo 1000 segundos/minutos en padre.
        if (segundo < 60) {
            this.segundo = segundo;
        }
    }

    public void inc() {
        if (this.segundo < 60) {
            this.segundo += 1;
        } else {
            super.inc();
            this.segundo = 0;
        }
    }
}

