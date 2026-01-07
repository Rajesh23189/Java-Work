package CoreJava.Stream_API.Fast_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class LunchStream2 {

    public static void main(String args[])
    {
        List<String> list = new ArrayList<>();

        list.add("Rajesh");
        list.add("Kuheli");
        list.add("Manik");
        list.add("Pramanik");
        list.add("Rajesh@Kuheli");
        list.add("Rajesh");

        System.out.println(list);

      Set<String> ListSet = list.stream().collect(Collectors.toSet());
      List<String> Sorted_List_Set = ListSet.stream().sorted().collect(Collectors.toList());

      System.out.println(ListSet);
        System.out.println(Sorted_List_Set);

    }
}
