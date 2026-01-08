package JDBC.Dynamic_Query;

import java.sql.*;

public class Dynamic_Query {

      public static void main(String args[])
      {
          String url = "jdbc:mysql://localhost:3306/My_Std";
          String username = "root";
          String password = "Rajesh@289";

          try(Connection con  = DriverManager.getConnection(url,username,password);)
          {
              String  query  = "INSERT INTO student (id,name,age) VALUE (?,?,?)";
              PreparedStatement pstmt  = con.prepareStatement(query);

              //Insert Data
              pstmt.setInt(1,1);
              pstmt.setString(2,"Rajesh");
              pstmt.setInt(3,20);
              pstmt.executeUpdate();

              pstmt.setInt(1,2);
              pstmt.setString(2,"Kuheli");
              pstmt.setInt(3,21);

              pstmt.executeUpdate();


              //Show Table
              Statement statement = con.createStatement();
              ResultSet rs = statement.executeQuery("SELECT *FROM student");

              while (rs.next()){
                  System.out.println(rs.getInt("id")+"||"+rs.getString("name")+"||"+rs.getInt("age"));
              }


          }
          catch (Exception e){
              e.printStackTrace();
          }
      }
}
