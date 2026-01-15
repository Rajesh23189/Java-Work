package CoreJava.Collection.Play_With_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Play_With_time {
    public static void main(String args[])
    {
        LocalDate date  = LocalDate.now();
        //System.out.println(date);
        int dayofMonth  = date.getDayOfMonth();
        int dayofYear  = date.getDayOfYear();
        System.out.println("Day Of Year : "+dayofYear);
        int month  = date.getMonthValue();
        int Year  = date.getYear();

        System.out.println(dayofMonth+"/"+month+"/"+Year);

        //My own Data
        LocalDate dob = LocalDate.of(2005,8,5);
        System.out.println("My Birth Day Is : "+dob);

        //Local Time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        System.out.println("Hour : "+lt.getHour()+" minutes : "+lt.getMinute()+" secend : "+lt.getSecond()+" NanoSceend : "+lt.getNano());

        LocalDateTime timeDate  = LocalDateTime.now();
        System.out.println(timeDate);


    }
}
