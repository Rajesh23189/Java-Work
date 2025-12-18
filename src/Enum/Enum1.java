//package Enum;
//enum Week
//{
//
//    //Canstance
//   // mon,tue,wed,thu,fri,sat,sun;
//
//    //Canstance  write in capital letter
//    MON,TUE,WED,THU,FRI,SAT,SUN;
//
//}
//public class Enum1 {
//    public static void main(String args[])
//    {
//        Week week = Week.MON;
//        System.out.println(week);
//
//        //index
//        int index = Week.THU.ordinal();
//        System.out.println(index);
//
//        //store value in array
//        Week[] weekAr =  Week.values();
//        for(Week day : weekAr)
//            System.out.print(day+" ");
//
//
//    }
//}

package Enum;

import java.sql.SQLOutput;

enum Month
{
     //Canstance
    JAN,FEV,MAR,APR,MAY,JUN,JUL,AUG,SEP,NEV,DEC
}

public class Enum1{
     public static void main(String args[])
     {
         Month month  = Month.JAN;
         System.out.println(month);

         int index = Month.JAN.ordinal();
         System.out.println(index);


         Month[] monthArr = Month.values();
         for(Month mon : monthArr)
             System.out.print(mon+" ");
     }
}