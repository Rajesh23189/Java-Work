package CoreJava.MULTITHREADING_CLASS_5.Class_Level_locking;



public class Gpay extends Thread{


    @Override
    public void run()
    {
        System.out.println("Deposit");
        Indian_Bank.deposit(4000);
    }
}
