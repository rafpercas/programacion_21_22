package Perez_Castano_U4_U5_EXAMEN;

public class Integrante {
  public static Integer dar_numero_participante = 0;
  private Integer numero_participante;
  private String nombre;
  private Integer edad;
  private String localidad;

  public Integrante(String nombre, Integer edad, String localidad) {
    this.nombre = nombre;
    this.edad = edad;
    this.localidad = localidad;
    numero_participante = dar_numero_participante;
    numero_participante++;
    setNumero_participante(numero_participante);
  }

  public static Integer getDar_numero_participante() {
    return dar_numero_participante;
  }

  public static void setDar_numero_participante(Integer dar_numero_participante) {
    Integrante.dar_numero_participante = dar_numero_participante;
  }

  public Integer getNumero_participante() {
    return dar_numero_participante;
  }

  public void setNumero_participante(Integer numero_participante) {
    this.dar_numero_participante = numero_participante;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Integer getEdad() {
    return edad;
  }

  public void setEdad(Integer edad) {
    this.edad = edad;
  }

  public String getLocalidad() {
    return localidad;
  }

  public void setLocalidad(String localidad) {
    this.localidad = localidad;
  }

  @Override
  public String toString() {
    return "Integrante{"
        + "numero_participante="
        + numero_participante
        + ", nombre='"
        + nombre
        + '\''
        + ", edad="
        + edad
        + ", localidad='"
        + localidad
        + '\''
        + '}';
  }
}
