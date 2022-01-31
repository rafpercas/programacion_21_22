package U4.T2.entregableVideojuego;

import java.util.Calendar;

public class Videojuego {
    private float ip;
    private Personaje.EnumPersonaje prota;
    private Escenario escenarioVid;
    private Enemigo enemigoVid;
    private String fechaPartida;

    public Videojuego(float ipVideojuego){
        this.ip = ipVideojuego;
        this.prota = Personaje.EnumPersonaje.Sonic;
        //this.escenarioVid = escenarioPredet;
        //this.enemigoVid = ;
    }

    public float getIp() {
        return ip;
    }

    public void setIp(float ip) {
        this.ip = ip;
    }
    public void mostrarInfoPartida(){
   getFechaPartida();
    }
    private String getFechaPartida() {
        Calendar c = Calendar.getInstance();

        String dia, mes, annio, hora, minuto, segundo;

        dia = Integer.toString(c.get(Calendar.DATE));
        mes = Integer.toString(c.get(Calendar.MONTH) + 1);
        annio = Integer.toString(c.get(Calendar.YEAR));

        hora = Integer.toString(c.get(Calendar.HOUR));
        minuto = Integer.toString(c.get(Calendar.MINUTE));
        segundo = Integer.toString(c.get(Calendar.SECOND));

        return dia + "/" + mes + "/" + annio + " " + hora + ":" + minuto + ":" + segundo;
    }
}
