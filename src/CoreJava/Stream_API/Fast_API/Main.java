package CoreJava.Stream_API.Fast_API;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {

    public static void main(String args[])
    {
       List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);



//        for(Integer ele : list)
//            System.out.print(ele+" ");

        /*--------------annonumus Inner class-----------------*/
        Consumer<Integer> consumer = new Consumer<Integer>()
        {
            @Override
            public void accept(Integer n) {
                System.out.print(n+" ");
            }
        };
        list.forEach(consumer);

        System.out.println();



        /*--------------using lambda----------------*/
        Consumer<Integer> consumer1 = (Integer n) -> {
            System.out.print(n+" ");
        };
        list.forEach(consumer1);



        /*-----------------Using lambda Inside---------------------*/
        list.forEach((Integer n)->{
            System.out.print(n+" ");
        });


        List<Float> F_list  = new ArrayList<Float>();


    }
}
