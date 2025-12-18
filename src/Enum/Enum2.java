package Enum;
enum Result
{
     PASS,FAIL,NR;

     /**
       How Run Enum Back Ground Enum
     public static final Result PASS = new Result();
    public static final Result FAIL = new Result();
      public static final Result NR = new Result();
      **/

//     enum Week
//     {
//
//     }
    private  int marks;
    Result()
    {
        System.out.println("Constructor of Enum");
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }
    public int getMarks()
    {
        return marks;
    }
}
public class Enum2 {
  public static void main(String args[])
  {
      Result result =  Result.PASS;
      System.out.println(result.getMarks());
      result.setMarks(44);
      System.out.println(result.getMarks());
  }
}
