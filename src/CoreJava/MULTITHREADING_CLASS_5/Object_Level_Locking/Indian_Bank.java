package CoreJava.MULTITHREADING_CLASS_5.Object_Level_Locking;

public class Indian_Bank {

    int accountBal;

    public Indian_Bank(int accountBal)
    {
        this.accountBal = accountBal;
    }

    public synchronized void withdrawal(int withdrawal)
    {
         this.accountBal = this.accountBal - withdrawal;
         System.out.println(withdrawal+" amount Withdrawal Successfully");
    }

    public synchronized void deposit(int deposit)
    {
        this.accountBal = this.accountBal + deposit;
        System.out.println(deposit+" Amount Deposit Successfully");
    }

    public synchronized void checkBalance()
    {
        System.out.println("The Balance Is The Account Is : "+this.accountBal);
    }
}
