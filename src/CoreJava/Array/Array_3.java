package CoreJava.Array;

public class Array_3 {
    public static void main(String args[])
    {
        //2D Jaggd array or Inregular array
        int[][]  marks = new int[3][];

        marks[0] = new int[4];
        marks[1] = new int[8];
        marks[2] = new int[5];

        System.out.println(marks[0].length);
        System.out.println(marks[1].length);
        System.out.println(marks[2].length);
        System.out.println("All 2D CoreJava.Array.Array Size is different , it a Jagged arrray");


    }
}
