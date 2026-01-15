package JDBC_PROJECT_GARAGE_SERVICES.service;

import JDBC_PROJECT_GARAGE_SERVICES.config.DbConfig;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Invoices;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class InvoiceService{

    public void addInvoice(Invoices invoice) throws SQLException
    {

        try(Connection connnection = DbConfig.getConnection();
        PreparedStatement ps = connnection.prepareStatement(
                "INSERT INTO Invoices(customer_id,vehicle_id,cost) VALUES(?,?,?)");) {
            ps.setInt(1, invoice.getCustomer_id());
            ps.setInt(2, invoice.getVehicle_id());
            ps.setDouble(3, invoice.getcost());
            ps.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    public List<Invoices> getAllInvoices() throws SQLException{
        List<Invoices> list  = new ArrayList<>();

        Connection connection = DbConfig.getConnection();
        Statement statement  = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT *FROM invoices");

        while(rs.next())
        {
            list.add(new Invoices(
                       rs.getInt("customer_id"),
                       rs.getInt("vehicle_id"),
                       rs.getInt("service_id"),
                       rs.getInt("invoices_id")
                                 )
            );
        }
        return list;
    }
}
