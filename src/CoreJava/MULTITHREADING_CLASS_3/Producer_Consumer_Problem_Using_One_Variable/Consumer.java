package CoreJava.MULTITHREADING_CLASS_3.Producer_Consumer_Problem_Using_One_Variable;

class Consumer extends Thread
{
    Queue q;
    public Consumer(Queue q)
    {
        this.q = q;
    }
    @Override
    public void run()
    {

        while(true)
        {
            q.Consume();
        }
    }
}
