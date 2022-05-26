package Perez_Castano_U8U9_Examen.ejercicio3;


import com.google.gson.Gson;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Consultas {
    private static List<Employee> employeeList = new ArrayList<>();

    public static List<Employee> mostrarEmpleados(Integer numOficina) {

        try {
            Connection con = ConexionBD.getConnection();

            String sql = "SELECT * FROM employees where officeCode=?";

            PreparedStatement statement = con.prepareStatement(sql);

            statement.setInt(1,numOficina);

            statement.setQueryTimeout(30);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                Employee e =
                        new Employee(
                                rs.getInt("employeeNumber"),
                                rs.getString("lastName"),
                                rs.getString("firstName"),
                                rs.getString("extension"),
                                rs.getString("email"),
                                rs.getString("officeCode"),
                                rs.getInt("reportsTo"),
                                rs.getString("jobTitle"));

                employeeList.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return employeeList;
    }
    public static void listToJson() {

    Gson gson = new Gson();

    String json_completo = gson.toJson(employeeList);

        System.out.println(json_completo);
    }
}
