//Runtime Stack Mach of Exception Handling

package Exce_Hand.java;

import java.util.Scanner;

public class Ex_Hand {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);



        System.out.println("Connection Established");
        System.out.print("Enter The Numerator : ");
        int nem = scan.nextInt();
        System.out.print("Enter The Denominator : ");
        int Den = scan.nextInt();
        int result = 0;

        System.out.print("Kindly Enter The size Of Array : ");
        int size = scan.nextInt();
        System.out.print("Kindly Enter Position At which element to be Insert : ");
        int index  = scan.nextInt();
        System.out.print("Please Enter Insert Data : ");
        int data = scan.nextInt();




        try{

            //Those 5 statement Are Risky Statement
            result = nem/Den;
            int[] arr = new int[size];
            arr[index] = data;
            System.out.println("Result Is : "+result);
            System.out.println("Data Insert Ina Array is : "+arr[index]);
        }

        catch (ArithmeticException e){
            System.out.println("Please Enter The Non Denominator");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Please Enter Possitive Number ");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Be Within Your Limits , Don't cross Boundaries ");
        }
        catch (Exception e){ //Exception Class Is parent Of all Exception Classes
            System.out.println("Some Problem");
        }



        System.out.println("Connection Terminated");
    }
}

