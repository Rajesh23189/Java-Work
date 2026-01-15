package CoreJava.Exception_Handling;

class Parent{
    public void work()
    {
        System.out.println("Parent Work Hard");
    }
}
class Child1 extends Parent{
    public void work(){
        System.out.println("child1 also Work Hard");
    }
}
class Child2 extends Parent{
    public void work() throws ArithmeticException
    {
        System.out.println("child2 also Work Hard");
    }
}
public class Ex_Hand_8 {
    public static void main(String args[])
    {

    }
}
/** If Parent Class not Diclear any Exceaption Then Child class Only Diclear only
  un-chacke Exceaption , But Not  declear any Chacke **/