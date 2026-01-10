package JDBC_PROJECT_GARAGE_SERVICES.service;

import JDBC_PROJECT_GARAGE_SERVICES.config.DbConfig;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import  java.util.List;

public class CustomerService {

       public void addCustomer(Customer customer) throws SQLException
       {
           Connection connnection = DbConfig.getConnection();

           PreparedStatement ps = connnection.prepareStatement(
                   "INSERT INTO customer(customer_name,customer_number) VALUE(?,?)");

           ps.setString(1,customer.getcustomer_name());
           ps.setString(2,customer.getcustomer_ph_no());
           ps.executeUpdate();
           ps.close();
           connnection.close();
       }


       public List<Customer> getAllCustomers() throws SQLException{
                    List<Customer> list = new ArrayList<>();
                    Connection connection = DbConfig.getConnection();

                    Statement statement = connection.createStatement();
                    ResultSet rs = statement.executeQuery("SELECT *FROM customer");

                    while(rs.next()){
                        list.add(new Customer(
                                 rs.getInt("customer_id"),
                                 rs.getString("customer_name"),
                                 rs.getString("customer_name")
                                              )
                                 );
                    }
                    return list;
       }
}
