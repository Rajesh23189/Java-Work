package CoreJava.Collection.Itrator;


import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Itr_1 {
    public static void main(String args[]) {


        ArrayList arr = new ArrayList();
        arr.add(100);
        arr.add(200);
        arr.add(300);
        arr.add(400);



        /** Normal Loop : Concurrent Modification Allow , **/
       /* for(int  i =0;i < arr.size();i++) {
            System.out.println(arr.get(i)+"");
            arr.add(44);
        }*/



        /** Iterator Concurrent Modification   Not  Allow , Throw Excepation **/
       /* Iterator itr  = arr.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());

        }*/

        CopyOnWriteArrayList al = new CopyOnWriteArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        //for copyOnWriteArrayList Class : Concurrent Modification  Not Allow, but Applaction Falled Saved
        /* Iterator itr  = arr.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+" ");
            al.add(44);

        }*/

        //ListIterator : Print Reverse Order
        /*ListIterator Litr  = al.listIterator(al.size());
        while(Litr.hasPrevious())
        {
            System.out.print(Litr.previous()+" ");
        }*/


    }
}

