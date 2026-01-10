package JDBC_PROJECT_GARAGE_SERVICES.service;

import JDBC_PROJECT_GARAGE_SERVICES.config.DbConfig;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
}
