package U5.T1.a3;

public class HoraExacta extends Hora {
  private Integer segundo;

  public HoraExacta(Integer hora, Integer minuto, Integer segundo) {
    super(hora, minuto);
    this.segundo = segundo;
  }

  public void setSegundo(Integer segundo) {
    if (segundo < 60) {
      this.segundo = segundo;
    }
  }

  public void inc() {
    if (this.segundo < 60) {
      this.segundo += 1;
    }
  }
}
