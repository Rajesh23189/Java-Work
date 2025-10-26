package Collection.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricket
{
    int age;
    String name;
    double avg;
    public Cricket(int age, String  name,double avg)
    {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }
    @Override
    public String toString()
    {
        return "Crickter [ age = "+age+" name = "+name+" avg = "+avg+"]";
    }

}

//Mathod 1 to Implement Interface using implement Key Word
class Alpha implements Comparator<Cricket>
{
    @Override
    public  int compare(Cricket o1,Cricket o2)
    {
        if(o1.avg > o2.avg)
             return 1;
        else
            return -1;
    }
}
public class ComplexSort_1 {
    public static void main(String args[])
    {
        ArrayList<Cricket> c1 = new ArrayList<>();
        c1.add(new Cricket(34,"Rajesh",560));
        c1.add(new Cricket(39,"Rohit",87.00));
        c1.add(new Cricket(32,"Virat",100 ));
        c1.add(new Cricket(30,"Rahul",445));
        System.out.println("Before Sort : ");
        System.out.println(c1);


        Alpha a = new Alpha();
        Collections.sort(c1 , a );//sort The list c1 Based on Information Avalable In a class


        System.out.println("After Sort : ");
        System.out.println(c1);



    }
}
