package CoreJava.Exception_Handling;
class Alien{
    public void alpha()
    {
        beta();
    }
    public void beta()
    {
             alpha();
    }
}
public class Ex_Hand_6 {
    public static void main(String args[])
    {
        Alien a = new Alien();
        a.beta();
    }
}

/**Stack Over Flow Error**/
