package U4.T2.entregableVideojuego;

public class Personaje {
  public enum EnumPersonaje {
    Sonic,
    Tails,
    Knuckles
  }

  private EnumPersonaje character;
  private float velocidad;
  private Integer punchDmg;
  private Integer kickDmg;

  public Personaje() {
    creaPersonaje(EnumPersonaje.Sonic);
  }

  public Personaje(EnumPersonaje personajeElegido) {
    creaPersonaje(personajeElegido);
  }

  public void muestraInfoPersonaje() {
    System.out.println("Personaje: " + this.character);
    System.out.println("Velocidad: " + this.velocidad);
    System.out.println("Daño de puño: " + this.punchDmg);
    System.out.println("Daño de patada: " + this.kickDmg);
  }

  private void creaPersonaje(EnumPersonaje personajeElegido) {
    switch (personajeElegido) {
      case Sonic:
        this.character = EnumPersonaje.Sonic;
        this.velocidad = 100.0F;
        this.punchDmg = 100;
        this.kickDmg = 200;
        break;

      case Tails:
        this.character = EnumPersonaje.Tails;
        this.velocidad = 90.0F;
        this.punchDmg = 90;
        this.kickDmg = 180;
        break;
      case Knuckles:
        this.character = EnumPersonaje.Knuckles;
        this.velocidad = 120.0F;
        this.punchDmg = 110;
        this.kickDmg = 180;
        break;
    }
  }
}
