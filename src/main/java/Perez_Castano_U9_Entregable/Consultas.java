package Perez_Castano_U9_Entregable;

import java.sql.*;
import java.util.Scanner;

public class Consultas {
Connection connection = ConexionDB.getConnection();
    Scanner teclado = new Scanner(System.in);

    public void FiltroPrecio() throws SQLException {
        try {

        Statement statement = connection.createStatement();

        statement.setQueryTimeout(30);

    System.out.println("Introduce el precio mínimo: ");
    Double precioMin = teclado.nextDouble();
        ResultSet rs = statement.executeQuery("select productName,buyPrice from products where buyPrice > "+ precioMin);

        while (rs.next()) {
            System.out.println("Product Name :" + rs.getString("productName"));
            System.out.println("Buy Price :" + rs.getDouble("buyPrice"));

            System.out.println("-----------------");
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void InfoPagos(){
        try {
            Statement statement = connection.createStatement();

            statement.setQueryTimeout(30);

            System.out.println("Introduce el id del cliente: ");
            int numCliente = teclado.nextInt();
            ResultSet rs = statement.executeQuery("select customerName,checkNumber, paymentDate,amount from customers c " +
                    "join payments p on p.customerNumber = c.customerNumber where c.customerNumber = "+ numCliente);

            while (rs.next()) {
                System.out.println("Customer Name :" + rs.getString("customerName"));
                System.out.println("Check Number :" + rs.getString("checkNumber"));
                System.out.println("Payment Date:" + rs.getDate("paymentDate"));
                System.out.println("Amount :" + rs.getDouble("amount"));
                System.out.println("-----------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void informeCategoria(){
        try {
            Statement statement = connection.createStatement();

            statement.setQueryTimeout(30);

            System.out.println("Introduce el nombre de la categoría: ");
            String nombreCategoria = teclado.next();
            ResultSet rs = statement.executeQuery("select p.productName,od.quantityOrdered, od.priceEach from products p join orderdetails od on p.productCode = od.productCode " +
                    "where p.productLine = '"+ nombreCategoria+"'");

            while (rs.next()) {
                System.out.println("Product Name :" + rs.getString("productName"));
                System.out.println("Quantity Ordered:" + rs.getInt("quantityOrdered"));
                System.out.println("Price Each:" + rs.getInt("priceEach"));

                System.out.println("-----------------");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
