package Perez_Castano_U9_Entregable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static Connection con = null;

    public static Connection getConnection() {
        try {
            if (con == null) {
                String driver = "com.mysql.cj.jdbc.Driver";
                String url = "jdbc:mysql://localhost:8093/classicmodels?autoReconnect=true";
                String pwd = "programacion";
                String usr = "programacion";
                Class.forName(driver);
                con = DriverManager.getConnection(url, usr, pwd);
                System.out.println("Conection Succesfull");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }

    public static void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
