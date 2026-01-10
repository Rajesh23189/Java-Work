package JDBC_PROJECT_GARAGE_SERVICES;

import JDBC_PROJECT_GARAGE_SERVICES.entity.Customer;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Vehicles;
import JDBC_PROJECT_GARAGE_SERVICES.service.BillingService;
import JDBC_PROJECT_GARAGE_SERVICES.service.ServicesProvide;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String args[]) throws SQLException {
        Scanner sc = new Scanner(System.in);

        BillingService billingService  = new BillingService();



        while (true)
        {
            System.out.println("================MENU================");
            System.out.println("1. ADD Customer With Vehicle \n2. Generate Invoice \n3. Show Invoice \n4. Show All Services\n5.exit");

            System.out.print("Enter Choice  => ");
            int choice  = sc.nextInt();

             switch (choice)
             {
                 case 1:{
                     //Add Customer
                     System.out.print("Enter customer Name => ");
                     sc.nextLine();
                     String name  = sc.nextLine();
                     System.out.print("Enter Phone Number(Must Be 10 Digit) => ");
                     String  phone_number;
                     while (true)
                     {
                         phone_number = sc.nextLine();
                         if(phone_number.length() == 10)
                              break;
                         else {
                             System.out.print("Enter Valid 10 Digit phone number\n");
                             System.out.print("Enter Phone Number(Must Be 10 Digit) => ");
                              }
                     }
                     billingService.customerService.addCustomer(new Customer(0,name,phone_number));


                     //Add Vehicle
                     System.out.print("Enter Your Number Plate => ");
                     sc.nextLine();
                     String number_plate = sc.nextLine();
                     System.out.print("Enter Model => ");
                     String model = sc.nextLine();
                     Customer customer_Details =  billingService.customerService.customerDetails(phone_number);
                     int customer_id = customer_Details.getCustomer_id();
                     billingService.vehicleServices.addVehicle(new Vehicles(0,number_plate,model),customer_id);
                     break;
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
                     ServicesProvide.showAllServices();
                     break;
                 }


                 case 5:{
                      System.exit(0);
                        }

                 default:{
                     System.out.println("Enter Valid Choice");
                     break;
                 }
             }
        }

    }
}
