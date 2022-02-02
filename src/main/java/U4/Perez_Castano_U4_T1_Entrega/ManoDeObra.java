package U4.Perez_Castano_U4_T1_Entrega;

public class ManoDeObra {
    private String nombreEmpresa;
    private String descripcionTrabajo;
    private float horasRealizadas;
    private Integer cantObreros;

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcionTrabajo() {
        return descripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {
        this.descripcionTrabajo = descripcionTrabajo;
    }

    public float getHorasRealizadas() {
        return horasRealizadas;
    }

    public void setHorasRealizadas(float horasRealizadas) {
        this.horasRealizadas = horasRealizadas;
    }

    public Integer getCantObreros() {
        return cantObreros;
    }

    public void setCantObreros(Integer cantObreros) {
        this.cantObreros = cantObreros;
    }

    public ManoDeObra(String nombreEmpresa, String descripcionTrabajo, float horasRealizadas, Integer cantObreros) {
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionTrabajo = descripcionTrabajo;
        this.horasRealizadas = horasRealizadas;
        this.cantObreros = cantObreros;
    }

    public void mostrar_informacion(){
    System.out.println("Nombre de la empresa: "+getNombreEmpresa());
    System.out.println("Descripción del trabajo: "+getDescripcionTrabajo());
    System.out.println("Horas realizadas: "+getHorasRealizadas());
    System.out.println("Cantidad de obreros: "+getCantObreros());
    }
}
