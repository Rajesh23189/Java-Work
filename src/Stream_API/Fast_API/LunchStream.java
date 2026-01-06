package Stream_API.Fast_API;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LunchStream {
    public static void main(String args[])
    {


        List<Integer> list = new ArrayList<>();

        list.add(28);
        list.add(24);
        list.add(300);
        list.add(0);
        list.add(15);

        System.out.println(list);


        /*
        ----Effected The collection------

        Collections.sort(list);
        System.out.println(list);
        */


        // Don't effected original collection

        Stream<Integer> streamData1 = list.stream();
        Stream<Integer> sortedData = streamData1.sorted();
        sortedData.forEach((Integer n) -> System.out.print(n+" "));
        System.out.println(list);

        /*
         ---------it give error one stream only one operation will perfrom--------

            Stream<Integer> streamData2 = streamData1.map((n)->n*2);
            streamData2.forEach((n)-> System.out.print(n+" "));

            */

        List<Integer> list2 = new ArrayList<>();

        list2.add(28);
        list2.add(24);
        list2.add(300);
        list2.add(0);
        list2.add(15);

        System.out.print(list2);
        //method chaining
        list2.stream().
                sorted().
                map((n)-> n*2).
                forEach((n)-> System.out.print(n+" "));

    }
}


 /** 🔗 What is Method Chaining?
            Method chaining means calling multiple methods one after another in a single statement,
            where each method returns an object, so the next method can be called on it. **/