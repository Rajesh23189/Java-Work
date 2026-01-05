package MULTITHREADING_CLASS_5.Class_Level_locking;

public class Indian_Bank {

    static int accountBal = 4000;



     synchronized static public void withdrawal(int withdrawal)
    {
         accountBal = accountBal - withdrawal;
         System.out.println(withdrawal+" amount Withdrawal Successfully");
    }

    synchronized static public void deposit(int deposit)
    {
         accountBal = accountBal + deposit;
        System.out.println(deposit+" Amount Deposit Successfully");
    }

    synchronized static public void checkBalance()
    {
        System.out.println("The Balance Is The Account Is : "+accountBal);
    }
}
