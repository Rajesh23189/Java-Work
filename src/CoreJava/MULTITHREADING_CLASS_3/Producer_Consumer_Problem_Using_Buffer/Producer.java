package CoreJava.MULTITHREADING_CLASS_3.Producer_Consumer_Problem_Using_Buffer;



class Producer extends Thread {



    Queue q;
    public Producer(Queue q)
    {
        this.q = q;
    }

    @Override
    public void run()
    {
        while(true)
        {
            q.produce();
        }
    }
}
