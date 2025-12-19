package MULTITHREADING_CLASS_2;



class MyBMW implements Runnable
{
    @Override
    public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " Has Entered Parking Lot");
            Thread.sleep(4000);
            synchronized (this) {
                System.out.println(Thread.currentThread().getName() + " Has Entered Into Car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Has Started To Drive The Car");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " Has Came Back And Parking The Car");

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class Thread_1 {
    public static void main(String args[])
    {
        MyBMW  thread = new MyBMW();

        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        Thread t3 = new Thread(thread);

        t1.setName("RAMESH");
        t2.setName("SURESH");
        t3.setName("DINESH");

        t1.start();
        t2.start();
        t3.start();
    }
}
