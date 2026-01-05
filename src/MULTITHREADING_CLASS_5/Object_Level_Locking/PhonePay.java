package MULTITHREADING_CLASS_5.Object_Level_Locking;

public class PhonePay extends Thread{

    private Indian_Bank bank;

    public PhonePay(Indian_Bank bank)
    {
        this.bank = bank;
    }

    @Override
    public void run()
    {
        System.out.println("ChackBalance");
        bank.checkBalance();
    }

}
