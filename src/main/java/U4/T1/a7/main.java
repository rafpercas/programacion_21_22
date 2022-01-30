package U4.T1.a7;

public class main {
  public static void main(String[] args) {
    Sintonizador s1 = new Sintonizador();
    s1.display();
    s1.modificarFrecuencia("up");
    s1.display();
    s1.modificarFrecuencia("down");
    s1.modificarFrecuencia("down");
    s1.modificarFrecuencia("down");
    s1.display();
    s1.modificarFrecuencia("up");
    s1.modificarFrecuencia("up");
    s1.display();
  }
}
