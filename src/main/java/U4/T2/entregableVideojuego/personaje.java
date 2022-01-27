package U4.T2.entregableVideojuego;

public class personaje {
  public enum EnumPersonaje {
    Sonic,
    Tails,
    Knuckles
  }

  private EnumPersonaje character;
  private float velocidad;
  private Integer punchDmg;
  private Integer kickDmg;

  public personaje() {
    this.character = EnumPersonaje.Sonic;
    this.velocidad = 100.0F;
    this.punchDmg = 100;
    this.kickDmg = 200;
  }

  public personaje(EnumPersonaje personajeElegido) {
    if (personajeElegido.equals(EnumPersonaje.Sonic)) {
      this.character = EnumPersonaje.Sonic;
      this.velocidad = 100.0F;
      this.punchDmg = 100;
      this.kickDmg = 200;
    }
    if (personajeElegido.equals(EnumPersonaje.Tails)) {
      this.character = EnumPersonaje.Tails;
      this.velocidad = 150.0F;
      this.punchDmg = 70;
      this.kickDmg = 170;
    }
    if (personajeElegido.equals(EnumPersonaje.Knuckles)) {
      this.character = EnumPersonaje.Knuckles;
      this.velocidad = 120.0F;
      this.punchDmg = 110;
      this.kickDmg = 180;
    }
  }

  public void muestraInfoPersonaje() {
    System.out.println("Personaje: " + this.character);
    System.out.println("Velocidad: " + this.velocidad);
    System.out.println("Daño de puño: " + this.punchDmg);
    System.out.println("Daño de patada: " + this.kickDmg);
  }
}
