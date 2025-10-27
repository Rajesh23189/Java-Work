package Collection.MAP;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;

class Passport
{
    private String name;
    private String city;
    private String country;

    public Passport(String name,String city,String country) {
        super();
        this.name = name;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
public class Map_5 {
    public static void main(String arg[])
    {
        System.out.println("Passport Information App");
        Passport pass1  = new Passport("Rohan","WestBengal","India");
        Passport pass2  = new Passport("Rohit","Mumbi","India");
        Passport pass3  = new Passport("Rahul","calgary","Canada");

        Integer id1 = Integer.valueOf(101);
        Integer id2 = Integer.valueOf(201);
        Integer id3 = Integer.valueOf(301);

        HashMap<Integer , Passport> hm = new HashMap<>();
        hm.put(id1,pass1);
        hm.put(id2,pass2);
        hm.put(id3,pass3);


        Scanner sc = new Scanner(System.in);
        System.out.print("Kindely Enter Your Passport Number : ");
        Integer userPass =  sc.nextInt();

        Set<Entry<Integer , Passport>> entry = hm.entrySet();
        Iterator<Entry<Integer , Passport>> itr = entry.iterator();
        Boolean flag = true;


        while(itr.hasNext() )
        {
            Map.Entry keyValue = (Entry) itr.next();
            Integer key = (Integer) keyValue.getKey();
            if(userPass.equals(key)) //Compares object values : equal , not use == bcz it use Reference variable
            {
                System.out.println("Please Find Your Passport details below : ");
                System.out.println(keyValue.getValue());
                flag = false;
                break;
            }
        }



        if(flag)
            System.out.println("Unable yo Fetch Your Information based On Passport id given ");

    }
}
