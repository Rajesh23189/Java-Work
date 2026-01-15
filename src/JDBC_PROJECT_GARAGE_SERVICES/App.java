package JDBC_PROJECT_GARAGE_SERVICES;

import JDBC_PROJECT_GARAGE_SERVICES.entity.Customer;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Vehicles;
import JDBC_PROJECT_GARAGE_SERVICES.service.BillingService;
import JDBC_PROJECT_GARAGE_SERVICES.service.CustomerService;
import JDBC_PROJECT_GARAGE_SERVICES.service.ServicesProvide;
import JDBC_PROJECT_GARAGE_SERVICES.service.VehicleServices;

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
            System.out.println("1.ADD Customer With Vehicle   \n2.Enter Services Which You Want   \n3.Generate Invoice  \n4.Show Invoice \n5.Show All Services  \n6.exit");

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
                     String number_plate = sc.nextLine();
                     System.out.print("Enter Model => ");
                     String model = sc.nextLine();
                     Customer customer_Details =  billingService.customerService.customerDetails(phone_number);
                     int customer_id = customer_Details.getCustomer_id();
                     billingService.vehicleServices.addVehicle(new Vehicles(0,number_plate,model),customer_id);
                     break;
                 }






                 case 2 :{

                     ServicesProvide.showAllServices();


                     /**Get Customer Details**/
                     sc.nextLine();
                     String  phone_number;
                     while (true)
                     {
                         System.out.print("Enter Phone Number(Must Be 10 Digit) => ");
                         phone_number = sc.nextLine();
                         if(phone_number.length() == 10)
                             break;
                         else {
                             System.out.print("Enter Valid 10 Digit phone number\n");
                         }
                     }
                     Customer customerDetails;
                     customerDetails = new CustomerService().customerDetails(phone_number);
                     int customer_id = customerDetails.getCustomer_id();




                     //Add Services
                     System.out.print("Enter How Many Services You => ");
                     int  n = sc.nextInt();
                     for(int  i = 1;i<=n;i++)
                     {
                         System.out.print("Enter Service Id => ");
                         int service_id = sc.nextInt();
                         ServicesProvide.addServices(customer_id,service_id);
                     }
                     break;
                 }


                 case 3:
                 {

                     /**Get Customer Details**/
                     sc.nextLine();
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
                     Customer customerDetails;
                     customerDetails = new CustomerService().customerDetails(phone_number);
                     int customer_id = customerDetails.getCustomer_id();

                     /**Get Vehicle Id**/

                     VehicleServices vehicleServices = new VehicleServices();
                     Vehicles vehicles =  vehicleServices.VehiclesDetails(customer_id);
                     int vehicle_id = vehicles.getVehicle_id();

                     List<Integer> all_services  = CustomerService.get_all_service_for_particular_customer(customer_id);
                     billingService.createInvoice(all_services,customer_id,vehicle_id);

                     break;

                 }

                 case 4:{
                     try{
                         billingService.showAllInvoices();
                       }
                     catch (SQLException e){
                         e.printStackTrace();
                     }
                     break;

                    }




                 case 5:{
                     ServicesProvide.showAllServices();
                     break;
                 }


                 case 6:{
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
