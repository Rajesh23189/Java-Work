package CoreJava.MULTITHREADING_CLASS_5.Object_Level_Locking;

public class Gpay extends Thread{

    private Indian_Bank bank;

    public Gpay(Indian_Bank bank)
    {
        this.bank = bank;
    }

    @Override
    public void run()
    {
        System.out.println("Deposit");
        bank.deposit(4000);
    }
}
