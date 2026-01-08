package CoreJava.Exception_Handling;

import java.util.Scanner;

class Alpha {
    public void calc() {
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

class Beta
{
    public void disp()
    {
        Alpha ap = new Alpha();
        ap.calc();
    }
}
public class Ex_Hand_2 {
    public static void main(String args[])
    {
        System.out.println("Dynamic_Query Connection Establist");
        // if Exception Occur Then JVM Chake   calc then disp then main stack Exception Handling or not
        Beta b = new Beta();
        b.disp();

        // if Exception Occur Then JVM Chake Only  calc and main stack Exception Handling or not
        Alpha a = new Alpha();
        a.calc();
        System.out.println("Dynamic_Query Connection Terminated");
    }
}
