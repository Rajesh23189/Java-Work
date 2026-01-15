package CoreJava.Array;

public class Array_4 {
    public static void main(String args[])
    {
        int[] marks = new int[589650];
        //Method 1 to store
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;


        try{
            marks[5] = 60; //it a Exceaption out of bound
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
