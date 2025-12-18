package MULTITHREADING_CLASS_1;

import java.util.Scanner;
class BankingActivity
{
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


class PrintingActivity
{
    public void Printing() throws InterruptedException
    {
        System.out.println("Printing Activity Started...");
        for(int  i =0;i<=4;i++){
            System.out.println("Cash Printing");
            Thread.sleep(4000);
        }
        System.out.println("Printing Activity Terminated");
    }
}


class PrintingMSG
{
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


public class Thread3 {
    public static void main(String args[]) throws InterruptedException
    {
        System.out.println("Application Start...");


        BankingActivity b = new BankingActivity();
        PrintingActivity pa = new PrintingActivity();
        PrintingMSG pm = new PrintingMSG();

        b.banking();
        pa.Printing();
        pm.printingMsg();


        System.out.println("Application Terminated");
    }
}
