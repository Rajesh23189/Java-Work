package JDBC_PROJECT_GARAGE_SERVICES.service;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Invoices;

import java.sql.SQLException;
import java.util.List;

public class BillingService {

       public CustomerService customerService = new CustomerService();

       public  VehicleServices vehicleServices = new VehicleServices();

       public  InvoiceService invoiceService = new InvoiceService();





       /** Create Invoice **/
       public void createInvoice(int customerId, int vehicleId,List<Integer> servicesIds) throws SQLException
       {
           String services_id = "";
           for(int servicesId : servicesIds)
           {
             services_id += servicesId;
           }
           invoiceService.addInvoice(new Invoices(0,customerId,vehicleId,Integer.parseInt(services_id)));
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
