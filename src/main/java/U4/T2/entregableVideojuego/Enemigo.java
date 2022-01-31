package U4.T2.entregableVideojuego;

public class Enemigo {
  public enum tipoEnemigo {
    BuzzBomber,
    CrabMeat,
    Coconuts,
    Chopper,
    Motobug
  }

  private tipoEnemigo enemyType;
  private Integer hp;
  private Integer dmg;

  public Enemigo(tipoEnemigo tipo) {
    this.enemyType = tipo;
    this.dmg = 70;
    this.hp = 100;
  }

  public int restarHp(Integer dmg) {
    this.hp -= dmg;
    if (this.hp < 0) {
      return this.hp = 0;
    } else {
      return this.hp;
    }
  }

  public void mostrarInfoEnemigo() {
    System.out.println("Tipo de enemigo: " + this.enemyType);
    System.out.println("Puntos de vida: " + this.hp);
    System.out.println("Puntos de daño: " + this.dmg);
  }

  public tipoEnemigo getEnemyType() {
    return enemyType;
  }

  public void setEnemyType(tipoEnemigo enemyType) {
    this.enemyType = enemyType;
  }
}
