package U4.T1.a9.personal;

public class maquinistas {
  private String nombreCompleto;
  private String dni;
  private float sueldoMensual;
  private String rango;

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

  public float getSueldoMensual() {
    return sueldoMensual;
  }

  public void setSueldoMensual(float sueldoMensual) {
    this.sueldoMensual = sueldoMensual;
  }

  public String getRango() {
    return rango;
  }

  public void setRango(String rango) {
    this.rango = rango;
  }

  public maquinistas(
      String nombreCompletoMaquinista,
      String dniMaquinista,
      float sueldoMaquinista,
      String rangoMaquinista) {
    setNombreCompleto(nombreCompletoMaquinista);
    setDni(dniMaquinista);
    setSueldoMensual(sueldoMaquinista);
    setRango(rangoMaquinista);
  }
}
