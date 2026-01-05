package MULTITHREADING_CLASS_4.Debug.using_lambda;

public class Main implements Runnable{
    public static void main(String args[])
    {

        Thread th1 = new Thread(new Main());
        th1.setName("Rajesh");
        th1.start();
        //Using lambda expresion and Task Of kuheli Thread
        Runnable r =() -> {
            System.out.println("Task of Thread "+Thread.currentThread().getName());

        };

        Thread th2 = new Thread(r);
        //Direct  Thread
        /*th2 = new Thread(r =() -> { System.out.println("Task of Thread "+Thread.currentThread().getName());
        });
          */
        th2.setName("Kuheli");
        th2.start();

        //Task Of Main Thread
        System.out.println("Task Of Thread "+Thread.currentThread().getName());
    }
    @Override
    public void run()
    {
        //Task Of Rajesh Thread
        System.out.println("Task Of Thread "+Thread.currentThread().getName());
    }


}


/* Direct
th2 = new Thread(r =() -> {
                      System.out.println("Task of Thread "+Thread.currentThread().getName());
        });
 */