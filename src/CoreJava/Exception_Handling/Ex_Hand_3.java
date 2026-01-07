package CoreJava.Exception_Handling;

import java.util.Scanner;

class Alpha1 {
    public void calc() throws ArithmeticException
    {
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
}

class Beta1
{
    public void disp()
    {
        Alpha1 ap = new Alpha1();
        ap.calc();
    }
}
public class Ex_Hand_3{
    public static void main(String args[])
    {
        try{
            System.out.println("Main Connection Establist");
            Alpha1 ap = new Alpha1();
            ap.calc();
        }
        catch (ArithmeticException e){
        System.out.println("Execption Caught At Main Method");
        }

        System.out.println("Main Connection Terminated");
    }
}
