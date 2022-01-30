package U4.T1.a9.personal;

public class mecanicos {
  private String nombreCompleto;
  private int telefono;
  private String especialidad;

  public enum enumEspecialidad {
    frenos,
    hidraulica
  }

  public String getNombreCompleto() {
    return nombreCompleto;
  }

  public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto = nombreCompleto;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void setEspecialidad(String especialidad) {
    this.especialidad = especialidad;
  }

  public mecanicos(
      String nombreCompletoMecanico, int telefonoMecanico, enumEspecialidad especialidadMecanico) {
    setNombreCompleto(nombreCompletoMecanico);
    setTelefono(telefonoMecanico);
    setEspecialidad(String.valueOf(especialidadMecanico));
  }
}
