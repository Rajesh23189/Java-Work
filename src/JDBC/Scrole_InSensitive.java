package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Scrole_InSensitive {

     public static void main(String args[]) {
         String url = "jdbc:mysql://localhost:3306/My_Std";
         String username = "root";
         String password = "Rajesh@289";
         try (Connection con = DriverManager.getConnection(url, username, password);
              Statement statement =
                       con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                               ResultSet.CONCUR_READ_ONLY);
         ) {

                 System.out.println("Fetching Data From DataBase Server.......");
                 String query  = "SELECT *FROM student";
                 ResultSet rs = statement.executeQuery(query);
                 Thread.sleep(10000);

                 while(rs.next())
                 {
                     System.out.println(rs.getInt("id")+ " || "
                                      +rs.getString("name")+" || "
                                       +rs.getInt("age")
                                       );
                 }

           }
         catch (Exception e)
         {
             e.printStackTrace();
         }

     }
}
