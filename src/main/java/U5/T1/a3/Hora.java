package U5.T1.a3;

public class Hora {
  private Integer hora;
  private Integer minuto;

  public Hora(Integer hora, Integer minuto) {
    this.hora = hora;
    this.minuto = minuto;
  }

  public void inc() {
    if (this.minuto < 60) {
      this.minuto += 1;
      if (this.minuto == 60) {
        this.hora += 1;
        this.minuto = 0;
        if(this.hora>24){
          this.hora=0;
        }
      }
    }
  }

  public void setHora(Integer hora) {
    if (hora <= 24) {
      this.hora = hora;
    }
  }

  public void setMinuto(Integer minuto) {
    if (minuto < 60) {
      this.minuto = minuto;
    }
  }
  public String toString(){
    return this.hora+":"+this.minuto;
  }
}
