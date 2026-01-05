package MULTITHREADING_CLASS_5.Object_Level_Locking;

public class Main extends Thread{
      public static void main(String args[]) {
            Indian_Bank bank1 = new Indian_Bank(4000);

            Atm atm = new Atm(bank1);
            atm.setName("Atm Thread");

            Gpay gpay = new Gpay(bank1);
            gpay.setName("Gpay Thread"); // Create Thread BZC Creating The Child class object Is equal To Creating Preant Class Object

            PhonePay p_pay = new PhonePay(bank1);
            p_pay.setName("Phone_Pay Thread");



            //give life of thread
            atm.start();
            gpay.start();
            p_pay.start();






      }
}
