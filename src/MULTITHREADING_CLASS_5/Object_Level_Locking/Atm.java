package MULTITHREADING_CLASS_5.Object_Level_Locking;

public class Atm extends Thread{

    private Indian_Bank bank;

    public Atm(Indian_Bank bank)            //Loose Coupling
    {
        this.bank = bank;
    }

    @Override
    public void run()
    {
        System.out.println("Withdrawal");
        bank.withdrawal(4000);
    }
}
