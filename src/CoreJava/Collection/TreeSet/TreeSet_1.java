package CoreJava.Collection.TreeSet;

import java.util.TreeSet;

public class TreeSet_1 {
    public static void main(String args[])
    {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(90);
        ts.add(80);
        ts.add(70);
        ts.add(60);
        ts.add(50);
        ts.add(40);
        ts.add(30);
        System.out.println(ts);

        /**Data Store Inorder Tervarsal Wise**/

        System.out.println(ts.ceiling(65));//give Nearest Higest Value if 65 not present
        System.out.println(ts.higher(65));//give Allways Nearest Higest Value

        System.out.println(ts.floor(45));//give Nearest lower Value if 65 not present
        System.out.println(ts.lower(45));//give Allways Nearest Lower Value


        //tailset(data) :  give the remaning list include data
        System.out.println(ts.tailSet(50));//50 60 70 80 90 100
        //HeadSet(data) : give the before List Exclude data
        System.out.println(ts.headSet(60));//30 40 50

    }
}
