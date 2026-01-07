package CoreJava.MULTITHREADING_CLASS_1.Thread4;

import java.util.Scanner;
class BankingActivity1 extends Thread
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



class PrintingActivity1 extends Thread
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




class PrintingMSG1 extends Thread
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



public class Thread4 {
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println("Application Start...");


        BankingActivity1 b = new BankingActivity1();//Creating The Object Of BankingActivity is e
        PrintingActivity1 pa = new PrintingActivity1();
        PrintingMSG1 pm = new PrintingMSG1();

        b.start();
        pa.start();


        //Whenever b,pa thread completed then stared pm thread
        b.join();
        pa.join();

        pm.start();
        pm.join();


        System.out.println("Application Terminated");
    }
}
