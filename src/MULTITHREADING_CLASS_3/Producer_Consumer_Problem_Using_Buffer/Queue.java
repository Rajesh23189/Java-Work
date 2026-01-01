package MULTITHREADING_CLASS_3.Producer_Consumer_Problem_Using_Buffer;

public class Queue {


    int[]  buffer  = new int[5];
    int i = 0;

    synchronized public void produce()
    {
        try
        {
            while(i == buffer.length-1)
            {
                wait();
            }


            buffer[i] = (int)(Math.random() * 100); //Generated Random Value
            i++;
            System.out.println("Producer Produce Data : "+buffer[i]);
            notify();//notify consumer

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }



    synchronized public void consumer()
    {

        try
        {
            while(i == 0)
            {
                wait();
            }


            System.out.println("Consumer Consume Data : "+buffer[i]);
            i--;
            notify();//notify producer


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }



}
