package CoreJava.MULTITHREADING_CLASS_1;

class MyCar implements Runnable
{
    @Override
    synchronized public void run(){
        try
        {
            System.out.println(Thread.currentThread().getName()+" Has Entered Parking Lot");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" Has Entered Into Car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" Has Started To Drive The Car");
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName()+" Has Came Back And Parking The Car");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
public class RealWorld {

    public static void main(String args[])
    {
       MyCar car  = new MyCar();

        Thread t1 = new Thread(car);
        Thread t2 = new Thread(car);
        Thread t3 = new Thread(car);

        t1.setName("RAMESH");
        t2.setName("SURESH");
        t3.setName("DINESH");

        t1.start();
        t2.start();
        t3.start();



    }
}
