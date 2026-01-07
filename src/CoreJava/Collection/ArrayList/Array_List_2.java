package CoreJava.Collection.ArrayList;

import java.util.ArrayList;

public class Array_List_2 {
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add(400);
        al.add(500);
        al.add(600);

        int data = (int) al.get(2); //Casting

        //using for loop
        for(int i = 0;i<al.size();i++)
            System.out.print(al.get(i)+" ");



    }
}
