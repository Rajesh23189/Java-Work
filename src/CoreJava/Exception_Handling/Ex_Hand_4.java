package CoreJava.Exception_Handling;

import java.util.Scanner;

class Alpha3 {
    public void calc()
    {
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Alpha Connection Established");
            System.out.print("Enter The Numerator : ");
            int nem = scan.nextInt();
            System.out.print("Enter The Denominator : ");
            int Den = scan.nextInt();
            int result = nem / Den;
            System.out.println("Result Is : " + result);

            System.out.println("Alpha Connection Terminated");
        }
        catch(Exception e){
        System.out.println("Excepation Handling In Alpha class");
        throw e;
         }
        finally{
            System.out.println("Alpha Connection Terminated");
        }
    }
}

class Beta3
{
    public void disp()
    {
        Alpha3 ap = new Alpha3();
        ap.calc();
    }
}
public class Ex_Hand_4{
    public static void main(String args[])
    {
        try{
            System.out.println("Main Connection Establist");
            Alpha3 ap = new Alpha3();
            ap.calc();
        }
        catch (ArithmeticException e){
            System.out.println("Execption Caught At Main Method");
        }

        System.out.println("Main Connection Terminated");
    }
}
 //So, Here Exce Han
