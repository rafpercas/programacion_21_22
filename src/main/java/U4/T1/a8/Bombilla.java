package U4.T1.a8;
// Actividad 8: Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender
// o apagar individualmente. Para ello hacer una clase Bombilla con una variable privada que indique
// si está encencida o apagada, así como un método que nos diga el estado de la bombilla.
//
// Además, queremos poner un interruptor general, de forma que si saltan los fusibles, todas las
// bombillas se muestran como apagadas. Cuando el fusible se repara, las bombillas vuelven a estar
// encendidas o apagadas, según estuvieran antes del percance. Cada bombilla se enciende o se apagan
// individualmente, pero solo responde si su interruptor particular está activado y además hay luz

// general.
public class Bombilla {
  private boolean apagada = true;
  private boolean interruptorGeneralOn = true;

  public boolean isApagada() {
    return apagada;
  }

  public void setApagada(boolean apagada) {
    this.apagada = apagada;
  }

  public boolean isInterruptorGeneralOn() {
    return interruptorGeneralOn;
  }

  public void setInterruptorGeneralOn(boolean interruptorGeneralOn) {
    this.interruptorGeneralOn = interruptorGeneralOn;
  }

  public Bombilla() {
    setApagada(true);
  }

  public void estadoBombilla() {
    if (isApagada() || !isInterruptorGeneralOn()) {
      System.out.println("La bombilla está apagada.");
    } else {
      System.out.println("La bombilla está encendida.");
    }
  }
  public void cambiarInterruptor(){
      if(isInterruptorGeneralOn()){
          setInterruptorGeneralOn(false);
      }else{
          setInterruptorGeneralOn(true);
      }
  }

  public void estadoInterruptor() {
    if(isInterruptorGeneralOn()){
      System.out.println("El interruptor general está encendido.");
    }else {
      System.out.println("El interruptor está apagado.");
    }
  }

  public void encenderBombilla() {
    if (isInterruptorGeneralOn()) {
      setApagada(false);
    } else {
      System.out.println("El interruptor general está apagado.");
    }
  }
  public void apagarBombilla(){
      if(!isApagada()){
      setApagada(false);
      }
  }
}
