package MULTITHREADING_CLASS_3.Producer_Consumer_Problem_Using_One_Variable;

public class Queue {


    int data;
    boolean flag = false;


    synchronized public void produce(int i)
    {
        try
        {  if(flag == true)
           {
               System.out.println("Producer in wait state");
                wait();
           }
            else {
            data = i;
            System.out.println("I Have Produce Data : "+data);
            flag = true;
            notify();//notify consumer
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }



    synchronized public void Consume()
    {

        try
        {
            if(flag == false)
            {
                System.out.println("Producer in wait state");
                wait();
            }
            else {
                System.out.println("I Have Consume Data : "+data);
                flag = false;
                notify();//notify producer
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
