package JDBC.Dynamic_Query;

import java.sql.*;
import java.util.Scanner;

public class Insert_Value_Using_preparedStatement {

    public static void main(String args[])
    {
        String url = "jdbc:mysql://localhost:3306/My_Std";
        String username = "root";
        String password = "Rajesh@289";

        try(Connection con = DriverManager.getConnection(url,username,password))
        {


            System.out.println("==========================================================");
            System.out.println("Insert Data In DataBase.......");


            Scanner sc = new Scanner(System.in);
            System.out.print("Enter How Many Row Are You Insert : ");
            int row = sc.nextInt();



            for(int i = 1;i<=row;i++)
            {
                String query  = "INSERT INTO student (id,name,age) VALUE (?,?,?)";
                PreparedStatement parst = con.prepareStatement(query);

                System.out.print("Enter student Id : ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Name Of Student : ");
                String  name  = sc.nextLine();


                System.out.print("Enter "+name+" age : ");
                int age  = sc.nextInt();

                parst.setInt(1,id);
                parst.setString(2,name);
                parst.setInt(3,age);
                parst.executeUpdate();

            }


            System.out.println("==========================================================");

            System.out.println("Retrieve Data In DataBase");
            //show DataBase
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT *FROM student");
            while (rs.next()){
                System.out.println(rs.getInt("id")+" || "+rs.getString("name")+rs.getInt("age"));
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
