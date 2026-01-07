package CoreJava.MULTITHREADING_CLASS_5.Class_Level_locking;


public class Atm extends Thread{



    @Override
    public void run()
    {
        System.out.println("Withdrawal");
        Indian_Bank.withdrawal(4000);
    }
}
