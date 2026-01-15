package CoreJava.Collection.MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

interface  Alpha
{
    interface Beta{

        static void disp()
        {
            System.out.println("Static method of an Inner Class");
        }
    }

}

public class Map_4 {
    public static void main(String args[])
    {
        //How Access The Disp Method : Alpha.Beta.disp()
        HashMap<Integer , String> hm = new HashMap<>();
        hm.put(1,"Java");//Entry --> Map //Entery Is a inner interface Face Of Map InterFace
        hm.put(2,"DSA");
        hm.put(3,"SpringBoot");

        //How Access Data
        String data  = hm.get(1);
        //System.out.println(data);

//        //All The value We can Access
//        CoreJava.Collection<CoreJava.String> values = hm.values();
//        Iterator<CoreJava.String> itr = values.iterator();
//        while (itr.hasNext())
//        {
//            System.out.print(itr.next()+" ");
//        }

//        //Access All The Key
//        Set<Integer> key  = hm.keySet();
//        Iterator<Integer> itr = key.iterator();
//        while(itr.hasNext())
//        {
//            System.out.print(itr.next()+" ");
//        }

        //Values & Key Value Together
        Set entry = hm.entrySet();
        Iterator itr = entry.iterator();
//        while (itr.hasNext())
//        {
//             HashMap.Entry pair = (Entry) itr.next();
//            System.out.println("Key : "+pair.getKey() + "Value : "+pair.getValue());
//
//        }

    }
}
