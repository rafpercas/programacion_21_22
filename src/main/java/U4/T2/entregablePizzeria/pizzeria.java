package U4.T2.entregablePizzeria;

import java.util.Arrays;

public class pizzeria {
  private int maxPedidos;
  private int contadorPedidos;
  private pedido[] pedidos;

  public pizzeria() {
    maxPedidos = 5;
    pedidos = new pedido[maxPedidos];
  }

  public pizzeria(int maxPedidosPizza) {
    this.maxPedidos = maxPedidosPizza;
    pedidos = new pedido[maxPedidos];
  }

  public void addPedido(pedido p) {
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
