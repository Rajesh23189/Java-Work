package CoreJava.MULTITHREADING_CLASS_3.Producer_Consumer_Problem_Using_One_Variable;

class Producer extends Thread {


    int  i =1;
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
            q.produce(i++);
        }
    }
}
