package U4.T2.entregablePizzeria;

import java.util.Calendar;

public class pedido {
  private Pizza pizzaPedido;
  private String fechaPedido;

  public pedido() {
    pizzaPedido = new Pizza(Pizza.EnumSize.familiar);
    ingrediente i1 = new ingrediente("Jamón ibérico", 300);
    ingrediente i2 = new ingrediente();
    pizzaPedido.addIngrediente(i1);
    pizzaPedido.addIngrediente(i2);
    this.fechaPedido = get_fecha_pedido();
  }

  public pedido(Pizza p) {
    this.pizzaPedido = p;
    this.fechaPedido = get_fecha_pedido();
  }

  public String getFecha() {
    return fechaPedido;
  }

  public Pizza getPizza() {
    return pizzaPedido;
  }

  private String get_fecha_pedido() {
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
