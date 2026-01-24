package TightCoupling;

public class Car {
    Engine engine = new Engine();

    public void Drive()
    {
        engine.start();
        System.out.println("Car Is Moving .......");
    }
}

//Car Object Is Dependent In Engine Class
