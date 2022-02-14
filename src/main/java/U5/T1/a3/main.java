package U5.T1.a3;
// Actividad 3: A partir de la clase Hora, implementar la clase HoraExacta, que incluye en la hora
// los segundos. Además de los métodos visibles de Hora, dispondrá de:
//
//    HoraExacta(hora, minuto, segundo)
//    setSegundo(valor), que da valor a los segundos, siempre y cuando sea un valor con sentido
//    inc(), que incrementa la hora en un segundo
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
