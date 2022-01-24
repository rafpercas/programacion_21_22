package U4.T1.a10;

public class Hora {
  private int hora;
  private int minuto;
  private int segundo;
  private int sumarSegundos;

  public int getHora() {
    return hora;
  }

  public void setHora(int hora) {
    this.hora = hora;
  }

  public int getMinuto() {
    return minuto;
  }

  public void setMinuto(int minuto) {
    this.minuto = minuto;
  }

  public int getSegundo() {
    return segundo;
  }

  public void setSegundo(int segundo) {
    this.segundo = segundo;
  }

  public int getSumarSegundos() {
    return sumarSegundos;
  }

  public void setSumarSegundos(int sumarSegundos) {
    this.sumarSegundos = sumarSegundos;
  }

  public Hora(int horaIntroducir, int cantidadSegundos) {
    setHora(horaIntroducir);
    setSumarSegundos(cantidadSegundos);
    while (cantidadSegundos >= 60) {
        setMinuto(getMinuto() + 1);
        cantidadSegundos -= 60;
        setSegundo(cantidadSegundos);
        if(getMinuto()>=60){
          setMinuto(0);
          setHora(getHora()+1);
        }
    }
  }

  public void mostrarHora() {
    System.out.println(getHora() + ":" + getMinuto() + ":" + getSegundo());
  }
}
