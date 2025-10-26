package Collection.Sort;

import java.util.ArrayList;
import java.util.Collections;

public class collection_1 {
    public static void main(String args[])
    {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(100);
        list.add(50);
        list.add(150);
        list.add(25);
        list.add(75);
        list.add(125);

        //sort
        Collections.sort(list);
        System.out.println(list);

        ArrayList<String> str  = new ArrayList<>();
        str.add("Rajesh");
        str.add("Manik");
        str.add("Kuheli");
        str.add("Pramanik");
        //sort
        Collections.sort(str);
        System.out.println(str);

    }
}
