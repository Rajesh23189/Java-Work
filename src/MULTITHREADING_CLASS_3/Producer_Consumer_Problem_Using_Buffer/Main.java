package MULTITHREADING_CLASS_3.Producer_Consumer_Problem_Using_Buffer;

public class Main {
    public static void main(String args[]) {

        Queue q = new Queue();

        new Producer(q).start();
        new Consumer(q).start();






    }
}