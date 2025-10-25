package Collection.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSet_1 {
    public static void main(String args[])
    {
        LinkedHashSet hs = new LinkedHashSet();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(175);
        System.out.println(hs);
        /** Hashing + order Of Insertation Precerve **/

        //Douplicate Not Allow
        hs.add(50);
        System.out.println(hs);
    }
}
