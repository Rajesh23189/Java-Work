package Array;

import java.util.Scanner;

public class Array_2 {
    public static void main(String args[])
    {
        int[][]  marks = new int[3][4];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<marks.length;i++){
             for(int j =0;j < marks[i].length;j++ ) {
                 System.out.print("Please Enter The Student Marks of " + i + " row and " + j + " colum: ");
                 marks[i][j] = sc.nextInt();
             }
        }

    }
}
