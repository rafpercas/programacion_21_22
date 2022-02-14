package U5.T1.a2;

public class Hora12 extends Hora{
    public enum amPm{
        am,
        pm
    }
    private Integer hora;
    private Integer minuto;
    private  amPm ampm;

    public Hora12(Integer hora, Integer minuto, amPm mananaTarde) {
        this.hora = hora;
        this.minuto = minuto;
        this.ampm = mananaTarde;
    }
}
