package U4.T1.a5;

public class main {
  public static void main(String[] args) {
    CuentaCorriente c1 = new CuentaCorriente();
    c1.CuentaCorriente("Rafael", "30303030J");
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
    // actividad 3
    // c1.nombre
    // c1.dni
    c1.mostrarInfo();
    // actividad 4
    CuentaCorriente.modificarBanco("bbva");
    c1.mostrarInfo();

    Texto t1 = new Texto();
    t1.Texto(10, "hola");
    t1.mostrarCadena();
    t1.introducirCaracter('a',"final");
    t1.mostrarCadena();
    t1.introducirCaracter('a',"principio");
    t1.mostrarCadena();
    t1.introducirCadena("adio","principio");
    t1.mostrarCadena();
  }
}
