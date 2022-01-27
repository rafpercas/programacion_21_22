package U4.T2.entregableVideojuego;

public class main {
  public static void main(String[] args) {
    personaje p1 = new personaje();
    p1.muestraInfoPersonaje();
    personaje p2 = new personaje(personaje.EnumPersonaje.Knuckles);
    p2.muestraInfoPersonaje();
    enemigo e1 = new enemigo(enemigo.tipoEnemigo.CrabMeat);
    e1.restarHp(20);
    e1.mostrarInfoEnemigo();
    e1.restarHp(90);
    e1.mostrarInfoEnemigo();
  }
}
