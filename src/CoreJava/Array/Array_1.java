package CoreJava.Array;

import java.util.Scanner;

public class Array_1 {
    public static void main(String args[])
    {
        int[] marks = new int[5];
        //Method 1 to store
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;

        //Method 2 store
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<marks.length;i++){
            System.out.print("Please Enter The Student "+i+1+" Marks : ");
            marks[i] = sc.nextInt();
        }


        //for print
        for(int i = 0;i<marks.length;i++){
            System.out.println("Student "+i+1+" Marks is : "+marks[i]);
        }
    }
}

/** length : it a not a method , it a key word  **/
