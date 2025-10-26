package Collection.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricket1
{
    int age;
    String name;
    double avg;
    public Cricket1(int age, String  name,double avg)
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
public class ComplexSort_2 {
    public static void main(String args[])
    {
        ArrayList<Cricket1> c1 = new ArrayList<>();
        c1.add(new Cricket1(34,"Rajesh",560));
        c1.add(new Cricket1(39,"Rohit",87.00));
        c1.add(new Cricket1(32,"Virat",100 ));
        c1.add(new Cricket1(30,"Rahul",445));
        System.out.println("Before Sort : ");
        System.out.println(c1);

        //Using Anonumous Inner class
        Comparator<Cricket1> c = new Comparator<Cricket1>() {
            @Override
            public int compare(Cricket1 o1, Cricket1 o2) {
                if(o1.age > o2.age) return 1;
                else return -1;
            }
        };

        Collections.sort(c1,c);//sort list Based On information Present In Annonumas Inner Class
        System.out.println("After Sort : ");
        System.out.println(c1);
    }
}
