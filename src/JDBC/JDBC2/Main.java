package JDBC.JDBC2;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class Main {
    public static void main(String args[])
    {
        String  url  =  "jdbc:mysql://localhost:3306/My_Std";
        String username  = "root";
        String password = "Rajesh@289";
        try(Connection con  = DriverManager.getConnection(url,username,password);
            Statement statement  = con.createStatement();
              ){

            // INSERT DATA
            String query = " INSERT INTO student (id,name,age) VALUES (5,'miss.kuheli pramanik',21)";
            int update  = statement.executeUpdate(query);
            System.out.println("Insert : "+update);


            //UPDATE DATA
            String update_query  = "UPDATE student SET name = 'Kuheli Manik' WHERE id  = 2 ";
            statement.executeUpdate(update_query);



            //Show Table
            String  Table_query = "SELECT *FROM student";
            ResultSet rs  = statement.executeQuery(Table_query);
            while(rs.next())
            {
                System.out.println(
                        rs.getInt("id") +" || "+rs.getString("name")+ " || "+ rs.getInt("age")
                );
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {

        }
    }
}
