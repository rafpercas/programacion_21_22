package U4.T2.entregableVideojuego;

import java.util.Arrays;

public class Escenario {
  private final int maxEnemigos = 10;
  private Integer alturaPx;
  private Integer anchuraPx;
  private Integer cantAnillos;
  private Integer cantGemas;
  private Enemigo.tipoEnemigo[] tiposEnemigos = new Enemigo.tipoEnemigo[maxEnemigos];
  private Enemigo[] enemigos = new Enemigo[maxEnemigos];
  private int contadorEnemigos = 0;

  public Escenario(Enemigo.tipoEnemigo[] enemigosTipo) {
    this.alturaPx = 100;
    this.anchuraPx = 100;
    this.cantAnillos = 500;
    this.cantGemas = 2;
    this.tiposEnemigos = enemigosTipo;
  }

  public boolean generarEnemigo(Enemigo.tipoEnemigo tipoEnemigo) {
      boolean quedaSitio = false;
    if (contadorEnemigos < maxEnemigos) {
      this.tiposEnemigos[contadorEnemigos++] = tipoEnemigo;
        quedaSitio = true;

    }
    return quedaSitio;
  }

  public void eliminarEnemigo(int posicion) {}

  public void mostrarEscenario() {
    System.out.println("Altura: " + this.alturaPx);
    System.out.println("Anchura: " + this.anchuraPx);
    System.out.println("Anillos: " + this.cantAnillos);
    System.out.println("Gemas: " + this.cantGemas);
    System.out.println("Enemigos: ");
    for (int i = 0; i < contadorEnemigos; i++) {
      System.out.println("   - " + tiposEnemigos[i].toString());
    }
  }
}
