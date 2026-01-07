package CoreJava.MULTITHREADING_CLASS_1.Thread4;

import java.util.Scanner;
class BankingActivity2  implements Runnable
{
    @Override
    public void run(){
        banking();
    }
    public void banking()
    {
        System.out.println("Banking Activity Started");
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter The User Name : ");
        String un =sc.next();
        sc.nextLine();
        System.out.print("Enter The Pass : ");
        String  pass  = sc.nextLine();
        System.out.println("Collect your Cash ");
        System.out.println("Banking Activity Terminated");
    }
}



class PrintingActivity2 implements Runnable
{
    @Override
    public void run(){
        try {
            PrintingStar();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void PrintingStar() throws InterruptedException
    {
        System.out.println("Printing Activity Started...");
        for(int  i =0;i<=4;i++){
            System.out.println("Cash Printing");
            Thread.sleep(4000);
        }
        System.out.println("Printing Activity Terminated");
    }
}




class PrintingMSG2 implements Runnable
{
    @Override
    public void run(){
        try {
            printingMsg();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    public void printingMsg() throws InterruptedException
    {
        System.out.println("Printing important msg started...");
        for(int  i =0;i<=4;i++){
            System.out.println("I win");
            Thread.sleep(4000);
        }
        System.out.println("Printing important msg Terminated");
    }
}



public class Thread5 {
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println("Application Start...");


        BankingActivity2 b = new BankingActivity2();//Creating The Object Of BankingActivity is e
        PrintingActivity2 pa = new PrintingActivity2();
        PrintingMSG2 pm = new PrintingMSG2();

        Thread thread1 = new Thread(b);
        Thread thread2 = new Thread(pa);
        Thread thread3 = new Thread(pm);

        //Give life
        thread1.start();
        thread2.start();
        thread3.start();




        System.out.println("Application Terminated");
    }
}

