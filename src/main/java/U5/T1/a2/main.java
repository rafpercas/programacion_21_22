package U5.T1.a2;
//Actividad 2: Escribir la clase Hora12, que funciona de forma similar a la clase Hora,
// con la diferencia de que las
// horas solo pueden tomar un valor entre 1 y 12; y se distingue la mañana de la tarde mediante "am" y "pm".
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
    Hora12 h2 = new Hora12(12,58, Hora12.amPm.am);
    System.out.println(h2.toString());
  }
}
