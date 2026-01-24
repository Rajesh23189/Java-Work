package Factory_Desing_Patten;

public class Car {

    Engine engine;

    public Car(Engine engine)
    {
        this.engine = engine;
    }

    public void Drive()
    {
        engine.start();
        System.out.println("Car Is Moving");
    }
}
