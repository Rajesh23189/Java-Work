package CoreJava.MULTITHREADING_CLASS_4.Debug.Ex_2;

public class Main  extends Thread{
    public static void main(String args[])
    {
        System.out.println("Main Thread Started");
         Main th1 = new Main();
        Main th2 = new Main();

        th1.setName("RajeshThread");
        th2.setName("KuheliThread");

        th1.start();
        th2.start();
    }
    public void run()
    {
        System.out.println("Task For My Thread");
    }
}
