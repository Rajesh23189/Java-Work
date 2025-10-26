package Collection.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class FootBall implements Comparable<FootBall>
{
    int age;
    String name;
    double avg;
    public FootBall(int age, String  name,double avg)
    {
        this.age = age;
        this.name = name;
        this.avg = avg;
    }
    @Override
    public String toString()
    {
        return "FootBoller  :  [ age = "+age+" name = "+name+" avg = "+avg+"]";
    }
    @Override
    public int compareTo(FootBall o)
    {
        if(this.avg > o.avg) return 1;
        else  return -1;
    }

}

public class complex_sort_3 {
    public static void main(String args[])
    {
        ArrayList<FootBall> c1 = new ArrayList<>();
        c1.add(new FootBall(34,"Rajesh",560));
        c1.add(new FootBall(39,"Rohit",87.00));
        c1.add(new FootBall(32,"Virat",100 ));
        c1.add(new FootBall(30,"Rahul",445));
        System.out.println("Before Sort : ");
        System.out.println(c1);


        Collections.sort(c1);
        System.out.println("After Sort : ");
        System.out.println(c1);
    }
}
