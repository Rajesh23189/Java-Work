package Collection.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDeque_1 {
    public static void main(String args[])
    {
        ArrayDeque arrde = new ArrayDeque();
        arrde.add(10);
        arrde.add(20);
        arrde.add(30);
        arrde.add(40);
        System.out.println(arrde);

        arrde.addFirst("addFirst Method use to add element First");
        arrde.addLast("addLast Method use to add element Rear/End");
        System.out.println(arrde);




    }
}
