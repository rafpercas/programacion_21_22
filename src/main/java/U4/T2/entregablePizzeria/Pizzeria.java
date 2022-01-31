package U4.T2.entregablePizzeria;

import java.util.Arrays;

public class Pizzeria {
  private int maxPedidos;
  private int contadorPedidos;
  private Pedido[] pedidos;

  public Pizzeria() {
    maxPedidos = 5;
    pedidos = new Pedido[maxPedidos];
  }

  public Pizzeria(int maxPedidosPizza) {
    this.maxPedidos = maxPedidosPizza;
    pedidos = new Pedido[maxPedidos];
  }

  public void addPedido(Pedido p) {
    if (contadorPedidos < maxPedidos) {
      pedidos[contadorPedidos++] = p;
    } else {
      pedidos = Arrays.copyOf(pedidos, pedidos.length + 1);
      pedidos[contadorPedidos++] = p;
    }
  }

  public void muestraPedidos() {
    System.out.println("Pedidos: ");
    for (int i = 0; i < contadorPedidos; i++) {
      System.out.println("- Pedido " + i + " (" + pedidos[i].getFecha() + ") :");
      pedidos[i].getPizza().muestraInfoPizza();
    }
  }

  public void muestraCantidadPedidos() {
    System.out.println("Num. pedidos: " + contadorPedidos);
  }
}
