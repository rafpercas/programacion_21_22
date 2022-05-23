package Perez_Castano_U9_Entregable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transacciones {
    Connection connection = ConexionDB.getConnection();

    public void addEmpleado(Employee employee, Customer c1, Customer c2) throws SQLException {
        try{
        String sql="INSERT INTO `employees` (`employeeNumber`,`lastName`,`firstName`,`extension`,`email`,`officeCode`,`reportsTo`,`jobTitle`)\n"
                    + "VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement sentencia=connection.prepareStatement(sql);

        sentencia.setInt(1,employee.getEmployeeNumber());
        sentencia.setString(2,employee.getLastName());
        sentencia.setString(3,employee.getFirstName());
        sentencia.setString(4,employee.getExtension());
        sentencia.setString(5,employee.getEmail());
        sentencia.setString(6, employee.getOfficeCode());
        sentencia.setInt(7,employee.getReportsTo());
        sentencia.setString(8,employee.getJobTitle());


        sentencia.executeUpdate();

        }catch(SQLException ex){
            System.out.println(ex.getMessage());        }
        try{
            String sql="INSERT INTO `customers` (`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`postalCode`,`city`,`state`,`addressLine2`,`country`,`salesRepEmployeeNumber`,`creditLimit`)\n"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement sentencia=connection.prepareStatement(sql);

            sentencia.setInt(1, c1.getCustomerNumber());
            sentencia.setString(2, c1.getCustomerName());
            sentencia.setString(3,c1.getContactLastName());
            sentencia.setString(4,c1.getContactFirstName());
            sentencia.setInt(5,c1.getPhone());
            sentencia.setString(6,c1.getAddressLine1());
            sentencia.setString(7, c1.getAddressLine2());
            sentencia.setString(8,c1.getCity());
            sentencia.setString(9,c1.getState());
            sentencia.setInt(10,c1.getPostalCode());
            sentencia.setString(11,c1.getCountry());
            sentencia.setInt(12,c1.getSalesRepEmployeeNumber());
            sentencia.setDouble(13,c1.getCreditLimit());


            sentencia.executeUpdate();

        }catch(SQLException ex){
            System.out.println(ex.getMessage());        }
        try{
            String sql="INSERT INTO `customers` (`customerNumber`,`customerName`,`contactLastName`,`contactFirstName`,`phone`,`addressLine1`,`postalCode`,`city`,`state`,`addressLine2`,`country`,`salesRepEmployeeNumber`,`creditLimit`)\n"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";
            PreparedStatement sentencia=connection.prepareStatement(sql);

            sentencia.setInt(1, c2.getCustomerNumber());
            sentencia.setString(2, c2.getCustomerName());
            sentencia.setString(3,c2.getContactLastName());
            sentencia.setString(4,c2.getContactFirstName());
            sentencia.setInt(5,c2.getPhone());
            sentencia.setString(6,c2.getAddressLine1());
            sentencia.setString(7, c2.getAddressLine2());
            sentencia.setString(8,c2.getCity());
            sentencia.setString(9,c2.getState());
            sentencia.setInt(10,c2.getPostalCode());
            sentencia.setString(11,c2.getCountry());
            sentencia.setInt(12,c2.getSalesRepEmployeeNumber());
            sentencia.setDouble(13,c2.getCreditLimit());


            sentencia.executeUpdate();

        }catch(SQLException ex){
            System.out.println(ex.getMessage());        }
    }
    public void addOficinaTokyo(Office o1){
        try {
            String sql =
                    "INSERT INTO `offices` (`officeCode`,`city`,`phone`,`addressLine1`,`addressLine2`,`state`,`country`,`postalCode`,`territory`)\n"
                            + "VALUES (?,?,?,?,?,?,?,?,?);";
            PreparedStatement sentencia = connection.prepareStatement(sql);
            sentencia.setQueryTimeout(30);

            sentencia.setString(1, o1.getOfficeCode());
            sentencia.setString(2, o1.getCity());
            sentencia.setString(3, o1.getPhone());
            sentencia.setString(4, o1.getAddressLine1());
            sentencia.setString(5, o1.getAddressLine2());
            sentencia.setString(6, o1.getState());
            sentencia.setString(7, o1.getCountry());
            sentencia.setString(8, o1.getPostalCode());
            sentencia.setString(9, o1.getTerritory());

            sentencia.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            String sql =
                    "update employees set officeCode = 10 where officeCode = ";
            PreparedStatement sentencia = connection.prepareStatement(sql);
            sentencia.setQueryTimeout(30);
            sentencia.setString(1, "5");

            sentencia.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            String sql =
                    "delete from offices where officeCode = ?";
            PreparedStatement sentencia = connection.prepareStatement(sql);
            sentencia.setQueryTimeout(30);
            sentencia.setString(1, "5");

            sentencia.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
