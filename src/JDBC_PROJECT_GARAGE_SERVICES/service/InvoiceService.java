package JDBC_PROJECT_GARAGE_SERVICES.service;

import JDBC_PROJECT_GARAGE_SERVICES.config.DbConfig;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Invoices;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class InvoiceService {

    public void addInvoice(Invoices invoice) throws SQLException
    {
        Connection connnection = DbConfig.getConnection();

        PreparedStatement ps = connnection.prepareStatement(
                "INSERT INTO customer(customer_id,vehicle_id,service_id) VALUE(?,?,?)");

        ps.setInt(1,invoice.getCustomer_id());
        ps.setInt(2,invoice.getVehicle_id());
        ps.setInt(3,invoice.getService_id());
        ps.executeUpdate();
        ps.close();
        connnection.close();
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
