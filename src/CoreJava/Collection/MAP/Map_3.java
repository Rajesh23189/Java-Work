package CoreJava.Collection.MAP;

import java.util.TreeMap;

public class Map_3 {
    public static void main(String args[])
    {
        TreeMap tm = new TreeMap();
        tm.put(1,"Java");
        tm.put(2,"SpringBoot");
        //tm.put(null , "Java8") Key Can't Be null
        tm.put(7, null); //value can be null


    }
}
