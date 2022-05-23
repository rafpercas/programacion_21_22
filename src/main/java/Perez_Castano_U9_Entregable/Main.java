package Perez_Castano_U9_Entregable;

import java.sql.SQLException;

public class Main {
  public static void main(String[] args) throws SQLException {
    Consultas c1 = new Consultas();
    c1.FiltroPrecio();

    c1.InfoPagos();

    c1.informeCategoria();

    Employee e1 =
        new Employee(
            1624,
            "Perez",
            "Rafael",
            "x5800",
            "alum.rperezc.2021@iesalixar.org",
            "1",
            1143,
            "Developer");
    Customer cust1 =
        new Customer(1000, "a", "Perez", "Rafael", 1000002, "", "", "", "", 19134, "", 1624, 12.5);
    Customer cust2 =
        new Customer(1001, "aa", "Perez", "Rafael", 1000002, "", "", "", "", 19134, "", 1624, 12.5);
    Transacciones t1 = new Transacciones();
    t1.addEmpleado(e1, cust1, cust2);

    Office o1 = new Office("10", "NewTokyo", "+12345", "", "", "Tokyo", "Japan", "1234", "Japan");
    t1.addOficinaTokyo(o1);



    //PARA CERRAR CONEXION
  }
}
