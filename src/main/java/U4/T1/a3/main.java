package U4.T1.a3;

public class main {
  public static void main(String[] args) {
    CuentaCorriente c1 = new CuentaCorriente();
    c1.CuentaCorriente("Rafael","30303030J");
    c1.mostrarInfo();
    c1.ingresar(200);
    c1.mostrarInfo();
    c1.sacar(250);
    c1.mostrarInfo();
    c1.sacar(50);
    c1.mostrarInfo();
    c1.ingresar(400);
    c1.mostrarInfo();
    c1.sacar(450);
    c1.mostrarInfo();
    c1.sacar(400);
    c1.mostrarInfo();
    c1.CuentaCorriente("Manuel");
    //actividad 3
    c1.nombre="Rafael";
    c1.dni="187461";
    c1.mostrarInfo();

  }
}
