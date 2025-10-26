package Collection.Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Employee
{
    private Integer id;
    private  String name;
    private String city;

    public Employee(Integer id,String name,String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    @Override
    public String toString()
    {
        return "Empolyee [id = "+id+" , name = "+name+" city = "+city+"]";
    }
}
public class Gen_1 {
    public static void main(String args[])
    {
        ArrayList<String> list  = new ArrayList<>();
        list.add("Rajesh");
        list.add("Manik");
        list.add("DevOps");


        ArrayList<Employee> em = new ArrayList<>();
        em.add(new Employee(289,"Rajesh","Bishnupur"));//It take Object
        em.add(new Employee(92,"kuheli","Sagarpur"));
        em.add(new Employee(01,"rajoke","Bishnupur"));
        for(Employee ele : em)
        {
            System.out.println(ele);
        }

    }
}

/** Using CENERIC we Achive Type Saefty **/