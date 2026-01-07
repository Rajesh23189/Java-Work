package CoreJava.MULTITHREADING_CLASS_1;

public class Thread2 {
    public static void main(String args[]) throws InterruptedException
    {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        thread.setName("Telusko");
        thread.setPriority(4);
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println("Application Terminated.....");
    }
}
