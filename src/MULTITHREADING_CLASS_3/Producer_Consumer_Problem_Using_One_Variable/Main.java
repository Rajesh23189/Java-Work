package MULTITHREADING_CLASS_3.Producer_Consumer_Problem_Using_One_Variable;

public class Main {
    public static void main(String args[])
    {

          Queue q = new Queue();

         Producer prd = new Producer(q);//Anonymus Object : new Producer(q).start()
         Consumer con =  new Consumer(q);//Anonymus Object : new Consumer(q).start()

         prd.start();
         con.start();


    }
}
