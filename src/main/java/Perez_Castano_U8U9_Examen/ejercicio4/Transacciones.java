package Perez_Castano_U8U9_Examen.ejercicio4;


import Perez_Castano_U8U9_Examen.ejercicio3.ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    public static void insertarLineaProducto() {

        Connection con = ConexionBD.getConnection();

        try {
            con.setAutoCommit(false);

            String sql = "INSERT INTO productlines VALUES (?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, "RafaProducts");
            statement.setString(2, "Productos de Rafa");
            statement.setString(3, null);
            statement.setString(4, null);


            statement.executeUpdate();


            sql = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);

            statement.setString(1, "S10_2047");
            statement.setString(2, "Nombre");
            statement.setString(3, "RafaProducts");
            statement.setString(4, "");
            statement.setString(5, "");
            statement.setString(6, "");
            statement.setInt(7, 6);
            statement.setDouble(8, 6);
            statement.setDouble(9, 6);

            statement.executeUpdate();


            sql = "INSERT INTO products VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = con.prepareStatement(sql);

            statement.setString(1, "S10_2048");
            statement.setString(2, "Nombre1");
            statement.setString(3, "RafaProducts");
            statement.setString(4, "");
            statement.setString(5, "");
            statement.setString(6, "");
            statement.setInt(7, 6);
            statement.setDouble(8, 6);
            statement.setDouble(9, 6);

            statement.executeUpdate();

            con.commit();
            System.out.println("Inserción correcta.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            try {
                if (con != null) {
                    System.out.println("Error al insertar los elementos, se realizará rollback.");
                    con.rollback();
                }
            } catch (SQLException throwables) {
                System.out.println("Error al intentar hacer el rollback");
                throwables.printStackTrace();
            }
        }
    }
}
