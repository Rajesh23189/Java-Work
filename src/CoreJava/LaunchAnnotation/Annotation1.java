package CoreJava.LaunchAnnotation;
class Animal
{
    public void anumalUsuualyHuntsAndEat()
    {
        System.out.println("Animal Is Eating.......");
    }
}

class Tiger extends Animal
{

    //overridding Parent class method to suite child requirement
    @Override
    public void anumalUsuualyHuntsAndEat() {
        System.out.println("Tiger Hunts and Eat.......");
    }
}
public class Annotation1 {
    public static void main(String args)
    {

    }
}
