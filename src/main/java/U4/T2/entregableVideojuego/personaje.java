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
        creaPersonaje(EnumPersonaje.Sonic);
    }


    public personaje(EnumPersonaje personajeElegido) {
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

            case Sonic -> {
                this.character = EnumPersonaje.Sonic;
                this.velocidad = 100.0F;
                this.punchDmg = 100;
                this.kickDmg = 200;
            }
            case Tails -> {
                this.character = EnumPersonaje.Tails;
                this.velocidad = 150.0F;
                this.punchDmg = 70;
                this.kickDmg = 170;
            }
            case Knuckles -> {
                this.character = EnumPersonaje.Knuckles;
                this.velocidad = 120.0F;
                this.punchDmg = 110;
                this.kickDmg = 180;
            }
        }
    }
}
