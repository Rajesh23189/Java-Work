package CoreJava.MULTITHREADING_CLASS_5.Class_Level_locking;



public class Main extends Thread{
      public static void main(String args[]) {

          Indian_Bank bank1 = new Indian_Bank();
          Indian_Bank bank2 = new Indian_Bank();

         Atm atm = new Atm();
          atm.setName("Atm Thread");

          Gpay gpay = new Gpay();
          gpay.setName("Gpay Thread"); // Create Thread BZC Creating The Child class object Is equal To Creating Preant Class Object

            PhonePay p_pay = new PhonePay(bank2);
            p_pay.setName("Phone_Pay Thread");

            //give life of thread
            atm.start();
            gpay.start();
            p_pay.start();






      }
}
