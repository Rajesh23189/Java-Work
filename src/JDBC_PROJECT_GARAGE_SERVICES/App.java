package JDBC_PROJECT_GARAGE_SERVICES;

import JDBC_PROJECT_GARAGE_SERVICES.entity.Customer;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Invoices;
import JDBC_PROJECT_GARAGE_SERVICES.service.BillingService;
import JDBC_PROJECT_GARAGE_SERVICES.service.CustomerService;
import JDBC_PROJECT_GARAGE_SERVICES.service.InvoiceService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        BillingService billingService  = new BillingService();
        CustomerService customerService = new CustomerService();
        InvoiceService invoiceService  = new InvoiceService();



        while (true)
        {
            System.out.println("================MENU================");
            System.out.println("1. ADD Customer \n2. Generate Invoice \n3. Show Invoice \n4.Exit");

            System.out.print("Enter Choice  => : ");
            int choice  = sc.nextInt();

            boolean flag  = true;
             switch (choice)
             {
                 case 1:{
                     System.out.print("Enter customer Name => ");
                     String name  = sc.nextLine();
                     sc.nextLine();
                     System.out.print("Enter Phone Number(Must Be 10 Digit) => ");
                     String  phone_number ;


                     while (true)
                     {
                         phone_number = sc.nextLine();
                         if(phone_number.length() == 10)
                              break;
                         else {
                             System.out.print("Enter Valid 10 Digit phone number");
                             System.out.print("Enter Phone Number(Must Be 10 Digit) => ");
                              }
                         try{
                             billingService.customerService.addCustomer(new Customer(0,name,phone_number));
                         }
                         catch (Exception e)
                         {
                             e.printStackTrace();
                         }
                         break;
                     }
                     }


                 case 2 :{
                         System.out.print("Enter Customer Id => ");
                         int customer_id  = sc.nextInt();
                         System.out.print("Enter vehicle Id => ");
                         int vehicle_id  = sc.nextInt();

                         // use for Garage Owner which services customer want
                         System.out.print("Enter How Many Services You => ");
                         int  n = sc.nextInt();
                         List<Integer> services_id  = new ArrayList<>();
                         for(int  i = 1;i<=n;i++)
                         {
                             System.out.print("Enter Service Id => ");
                             int id = sc.nextInt();
                             services_id.add(id);
                         }
                         try
                         {
                             billingService.createInvoice(customer_id,vehicle_id,services_id);
                         }
                         catch (SQLException e)
                         {
                             e.printStackTrace();
                         }

                         break;
                       }


                 case 3:{
                     try{
                         billingService.showAllInvoices();
                       }
                     catch (SQLException e){
                         e.printStackTrace();
                     }
                     break;

                    }

                 case 4:{
                      flag = false;
                        }

             }
        }




    }
}
