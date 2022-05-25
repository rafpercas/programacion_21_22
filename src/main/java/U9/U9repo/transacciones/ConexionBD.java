package U9_bd.MYSQL.teoria.transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
  private static Connection con = null;

  public static Connection getConnection() {
    try {
      if (con == null) {
        con =
            DriverManager.getConnection(
                "jdbc:mysql://192.168.1.127:3306/classicmodels?user=chema&password=Chema@daw1"
                    + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        System.out.println("Connection Successful");
      }
    } catch (SQLException ex) {
      ex.printStackTrace();
    }
    return con;
  }

  public static void close() {
    try {
      if (con != null) con.close();
    } catch (SQLException e) {
      // Falla el cierre de la conexión
      System.err.println(e.getMessage());
    }
  }
}
