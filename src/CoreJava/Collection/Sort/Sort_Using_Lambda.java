package CoreJava.Collection.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Cricket2
{
    int age;
    String name;
    double avg;
    public Cricket2(int age, String  name,double avg)
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
public class Sort_Using_Lambda {
    public static void main(String args[])
    {
        ArrayList<Cricket2> c1 = new ArrayList<>();
        c1.add(new Cricket2(34,"Rajesh",560));
        c1.add(new Cricket2(39,"Rohit",87.00));
        c1.add(new Cricket2(32,"Virat",100 ));
        c1.add(new Cricket2(30,"Rahul",445));
        System.out.println("Before Sort : ");
        System.out.println(c1);

       //Using Lambda Expreseion
        Comparator<Cricket2> c  = (Cricket2 o1 , Cricket2 o2)->{
              if(o1.age > o2.age) return 1;
              else return -1;
        };
        Collections.sort(c1,c);
        System.out.println("After Sort : ");
        System.out.println(c1);
    }
}
