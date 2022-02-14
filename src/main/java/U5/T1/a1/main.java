package U5.T1.a1;
// Actividad 1: Diseñar la clase Hora que representa un instante de tiempo compuesto por una hora
// (de 0 a 23) y los minutos.
//
// Dispone del constructor:
//
//    Hora (hora,minuto), que construye un objeto con los datos pasados como parámetro
//
// y de los métodos:
//
//    inc(), que incrementa la hora en un minuto
//    setMinutos(valor), que da valor a los minutos, siempre y cuando sea un valor con sentido
//    setHora(valor),que da valor a la hora, siempre y cuando sea un valor con sentido
//    toString(), que devuelve un String con la representación del reloj.
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
