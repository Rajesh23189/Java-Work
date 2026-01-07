//1 dsa and 1 springBoot and 1 Java  book Avaliable  And 2 student access Book At A Time

package CoreJava.MULTITHREADING_CLASS_2;

class Library implements Runnable
{
     String  res1 = new String("JAVA");
     String res2 = new String("DSA");
     String res3 = new String("SPRING_BOOT");

     @Override
     public void run()
     {
         String thread_name  = Thread.currentThread().getName();


         if(thread_name.equalsIgnoreCase("Student1"))
         {
             try
             {
                 System.out.println("Student 1 Got Into Library");
                 Thread.sleep(3000);
                 synchronized (res1)
                 {
                     System.out.println("Student1 Has Acquired "+res1);
                     Thread.sleep(5000);
                     synchronized (res2)
                     {
                         System.out.println("Student1 Has Acquired "+res2);
                         Thread.sleep(3000);
                         synchronized (res3)
                         {
                             System.out.println("Student1 Has Acquired "+res3);
                             Thread.sleep(3000);
                         }
                     }
                 }
             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }
         }
         else //studennt 2
         {
             try
             {
                     System.out.println("Student 2Use Got Into Library");
                     Thread.sleep(4000);
                     synchronized (res1)
                     {
                         System.out.println("Student2 Has Acquired "+res1);
                         Thread.sleep(4000);
                         synchronized (res2)
                         {
                             System.out.println("Student2 Has Acquired "+res2);
                             Thread.sleep(4000);
                             synchronized (res3)
                             {
                                 System.out.println("Student2 Has Acquired "+res3);
                                 Thread.sleep(4000);
                             }
                         }
                     }

             }
             catch (Exception e)
             {
                 e.printStackTrace();
             }
         }
     }
}
public class Real_World_Application {
      public static void main(String args[])
      {
              Library lb = new Library();


              //New Stated
              Thread thread1 = new Thread(lb);
              Thread thread2 = new Thread(lb);


              thread1.setName("Student1");
              thread2.setName("Student2");


              //Runnable_stated
              thread1.start();
              thread2.start();

      }
}
