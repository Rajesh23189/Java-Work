package JDBC_PROJECT_GARAGE_SERVICES.service;

import JDBC_PROJECT_GARAGE_SERVICES.config.DbConfig;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServicesProvide {

    public static void showAllServices() throws SQLException
    {
        Connection connection = DbConfig.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs =  statement.executeQuery("SELECT *FROM Services");
        System.out.println("Services_id                     Services_name                          services_cost");
        while(rs.next()){
            System.out.println(rs.getInt("service_id")+"    "+rs.getString("description")+"   "+rs.getInt("cost"));
        }
    }
    public static void addServices(int customer_id,int service_id) throws SQLException
    {
        Connection connection = DbConfig.getConnection();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO CustomerServices(customer_id,service_id) VALUE(?,?)");
        ps.setInt(1,customer_id);
        ps.setInt(2,service_id);
        ps.executeUpdate();
        ps.close();
    }



    public Service serviceDetails(int services_id) throws SQLException
    {
        Service service = new Service();
        Connection connection = DbConfig.getConnection();
        Statement statement  = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT service_id,description,cost FROM Services service_id ="+services_id);
        while (rs.next())
        {
            service = new Service(rs.getInt("service_id"),
                                   rs.getString("description"),
                                   rs.getDouble("cost"));
        }
        return service;
    }


}
