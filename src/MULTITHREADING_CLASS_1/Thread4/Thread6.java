package MULTITHREADING_CLASS_1.Thread4;
import java.util.Scanner;
class BankingActivity6 implements Runnable
{



    @Override
    public void run(){
        String thread_name  = Thread.currentThread().getName();
        if(thread_name.equals("Bank"))
             banking();
        else if(thread_name.equals("Cash"))
             PrintingCash();
        else
            printingMsg();
    }



    public void banking()
    {
        System.out.println("Banking Activity Started");
        Scanner sc  = new Scanner(System.in);
        sc.nextLine();
        System.out.print("Enter The User Name : ");
        String un =sc.next();
        sc.nextLine();
        System.out.print("Enter The Pass : ");
        String  pass  = sc.nextLine();
        System.out.println("Collect your Cash ");
        System.out.println("Banking Activity Terminated");
    }

    public void PrintingCash()
    {
        System.out.println("Printing Activity Started...");
        for(int  i =0;i<=4;i++){
            System.out.println("Cash Printing");
            try
            {
                Thread.sleep(4000);
            }
           catch (InterruptedException e){
                e.printStackTrace();
           }
        }
        System.out.println("Printing Activity Terminated");
    }


    public void printingMsg()
    {
        System.out.println("Printing important msg started...");
        for(int  i =0;i<=4;i++){
            System.out.println("I win");
            try
            {
                Thread.sleep(4000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Printing important msg Terminated");
    }

}


public class Thread6 {

    public static void main(String args[]) throws InterruptedException
    {
        System.out.println("Application Start...");


        BankingActivity6 b = new BankingActivity6();   //Creating The Object Of BankingActivity is e


        Thread thread1 = new Thread(b);
        Thread thread2 = new Thread(b);
        Thread thread3 = new Thread(b);


        thread1.setName("Bank");
        thread2.setName("Cash");
        thread3.setName("MSG");

        thread1.start();
        thread2.start();
        thread3.start();



        System.out.println("Application Terminated");
    }
}
