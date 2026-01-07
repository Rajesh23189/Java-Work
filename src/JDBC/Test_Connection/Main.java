package JDBC.Test_Connection;
import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void  main(String args[])
    {


         String url = "jdbc:mysql://localhost:3306/My_Std";
         String username = "root";
         String password = "Rajesh@289";

         try{
             Class.forName("com.mysql.cj.jdbc.Driver");
             Connection con  = DriverManager.getConnection(url,username,password);//Establish Conncetion For DB
             Statement st  = con.createStatement();

             String sql_query = "SELECT *FROM student";
             ResultSet rs = st.executeQuery(sql_query);

             while(rs.next())
             {
                 System.out.println(
                         rs.getInt("id") +" || "+rs.getString("name")+ " || "+ rs.getInt("age")
                 );
             }

         }

         catch (Exception e){
             e.printStackTrace();
         }
    }

}
