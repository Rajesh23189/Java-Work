package Collection.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vector_1 {
    public static void main(String args[])
    {
        Vector v = new Vector();
        v.addElement((100));
        v.add(200);
        v.add(300);
        v.add(400);
        v.add(500);

        Iterator itr  = v.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        Enumeration en = v.elements();
        while ((en.hasMoreElements()))
        {
            System.out.print(en.nextElement()+" ");
        }
    }
}
