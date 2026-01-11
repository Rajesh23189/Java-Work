package JDBC_PROJECT_GARAGE_SERVICES.service;
import JDBC_PROJECT_GARAGE_SERVICES.config.DbConfig;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Invoices;

import java.sql.*;
import java.util.List;

public class BillingService {

       public CustomerService customerService = new CustomerService();

       public  VehicleServices vehicleServices = new VehicleServices();

       public  InvoiceService invoiceService = new InvoiceService();





       /** Create Invoice **/
       public void createInvoice(List<Integer> servicesIds,int customerId,int vehicleId) throws SQLException
       {
           double Total_cost = 0;

           System.out.println("Hi");
           Connection connection = DbConfig.getConnection();
           PreparedStatement ps = connection.prepareStatement(
                   "SELECT cost FROM Services WHERE service_id = ?");

           for (int ele : servicesIds) {
               ps.setInt(1, ele);
               ResultSet rs = ps.executeQuery();
               if (rs.next()) {
                   Total_cost += rs.getDouble("cost");
               }
           }
           invoiceService.addInvoice(new Invoices(0,customerId,vehicleId,Total_cost));
           System.out.println("Invoice Create Successfully...");
       }

       /** Show All Invoice **/

       public void showAllInvoices() throws SQLException
       {
           List<Invoices> invoices = invoiceService.getAllInvoices();

           for(Invoices invoice : invoices)
           {
               System.out.println(invoice);
           }
       }
}
