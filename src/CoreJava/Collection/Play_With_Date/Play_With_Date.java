package CoreJava.Collection.Play_With_Date;
import java.util.Date;
public class Play_With_Date {
    public static void main(String args[])
    {
//        Date date  = new Date();//Date class Of util package will return both date and Time
//        System.out.println(date);
//        System.out.println(date.getYear());
//        System.out.println(date.getTime());

         //how get Corrent time
        long timeInMs = 1761490833902L;
        Date date = new Date(timeInMs);
        System.out.println(date);


    }
}
