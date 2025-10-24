package Collection.ArrayList.LinkedList;

import java.util.LinkedList;

public class LinkedList_1 {
    public static void main(String args[])
    {
        LinkedList ll1 = new LinkedList();

//        //mathod
//        ll1.add(10);
//        ll1.add("Java");
//        ll1.add("Kolkata");
//        ll1.add(56.23);
//        System.out.println(ll1);

        //add first
        ll1.addFirst("first");

        //add last
        ll1.addLast("Last");

        //add any Point
        ll1.add(1,"Index1");

        //System.out.println(ll1);


         ll1.offer("Data Append Rear end");
        // System.out.println(ll1);

        ll1.offerFirst("Data Add In Front end ");
        //System.out.println(ll1);

        System.out.println(ll1.peek()); //Don't Remove The Data , give the first Data In of collection

        System.out.println(ll1.poll()); // Remove The Data , give the first Data In of collection

        System.out.println(ll1);
    }
}
