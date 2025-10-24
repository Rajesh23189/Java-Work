package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String args[])
    {


        //Any Type of data store
        ArrayList alist = new ArrayList();
        alist.add(100);
        alist.add(200.52);
        alist.add("Rajesh");
        alist.add(true);
       /* System.out.println(alist); */

        /* 0 index go to 1 index , 1 index go to2 index
         add : automatic shift By One lndex
        ArrayList alist = new ArrayList();
        alist.add(100);
        alist.add(200.52);
        alist.add(0,"rajesh");
        System.out.println(alist);
        */

        //contains
        System.out.println(alist.contains("Rajesh"));






    }
}
