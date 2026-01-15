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

    public Vehicles VehiclesDetails(int customer_id) throws  SQLException
    {
        Vehicles vehicles = new Vehicles();
        Connection connection = DbConfig.getConnection();
        Statement statement  = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT vehicle_id,customer_id,number_plate,model FROM Vehicles WHERE customer_id ="+customer_id);
         while (rs.next()){
             vehicles = new Vehicles(rs.getInt("vehicle_id"),
                                      rs.getString("number_plate"),
                                       rs.getString("model")
                                     );
         }
         return  vehicles;
    }


}
