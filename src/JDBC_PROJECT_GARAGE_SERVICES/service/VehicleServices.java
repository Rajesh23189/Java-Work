package JDBC_PROJECT_GARAGE_SERVICES.service;

import JDBC_PROJECT_GARAGE_SERVICES.config.DbConfig;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Customer;
import JDBC_PROJECT_GARAGE_SERVICES.entity.Vehicles;

import java.sql.*;

public class VehicleServices {

    public void addVehicle(Vehicles vehicles,int customer_id) throws SQLException
    {
        Connection connnection = DbConfig.getConnection();


        PreparedStatement ps = connnection.prepareStatement(
                "INSERT INTO Vehicles(customer_id,number_plate,model) VALUE(?,?,?)");


        ps.setInt(1,customer_id);
        ps.setString(2,vehicles.getVehicle_number_plate());
        ps.setString(3,vehicles.getVehicle_model());
        ps.executeUpdate();
        ps.close();
        connnection.close();
    }


}
