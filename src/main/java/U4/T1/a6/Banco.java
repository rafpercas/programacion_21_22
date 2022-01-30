package U4.T1.a6;

public class Banco {
    public static String nombre = "La Caixa";
    private long capital;
    private String direccionCentral;

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Banco.nombre = nombre;
    }

    public long getCapital() {
        return capital;
    }

    public void setCapital(long capital) {
        this.capital = capital;
    }

    public String getDireccionCentral() {
        return direccionCentral;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }

    public void Banco(long capitalBanco, String direccionCentralBanco){
    setNombre(nombre);
    this.capital = capitalBanco;
    this.direccionCentral = direccionCentralBanco;
    }
    public void Banco(String direccionCentralBanco){
        setNombre(nombre);
        setCapital(5200000);
        this.direccionCentral = direccionCentralBanco;
    }
}
