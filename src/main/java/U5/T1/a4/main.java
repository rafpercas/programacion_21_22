package U5.T1.a4;
//Actividad 4: Añadir a la clase HoraExacta un método que compare si
// dos horas (la invocante y la otra pasada como parámetro de entrada al método) son iguales o distintas.
public class main {
  public static void main(String[] args) {
    Hora h1 = new Hora(23,57);
    h1.inc();
    h1.inc();
    h1.inc();
    h1.inc();
    h1.setMinuto(59);
    h1.inc();
    h1.inc();
    h1.inc();
    h1.inc();
    h1.inc();
    System.out.println(h1);
  }
}
