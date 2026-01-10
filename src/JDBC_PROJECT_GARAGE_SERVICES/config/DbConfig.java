package JDBC_PROJECT_GARAGE_SERVICES.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

    private static final String  URL = "jdbc:mysql://localhost:3306/GARAGE_PROJECT";
    private static final String USERNAME  = "root";
    private static final String PASSWORD = "Rajesh@289";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }



}
