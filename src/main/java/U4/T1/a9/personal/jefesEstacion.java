package U4.T1.a9.personal;

public class jefesEstacion {
    private String nombreCompleto;
    private String dni;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public jefesEstacion(String nombreCompletoJefe, String dniJefe){
    setNombreCompleto(nombreCompletoJefe);
    setDni(dniJefe);
}
}
