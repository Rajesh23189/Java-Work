package Factory_Desing_Patten;

public class Main {
    public static void main(String args[])
    {
        Engine engine = EngineFactory.getEngine("DIESEL");
        Car car = new Car(engine);
        car.Drive();
    }
}
