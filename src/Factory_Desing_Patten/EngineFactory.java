package Factory_Desing_Patten;

public class EngineFactory {

    public static Engine getEngine(String type_of_engine)
    {
        if(type_of_engine.equalsIgnoreCase("Diesel"))
        {
            return new DieselEngine();
        }
        else if(type_of_engine.equalsIgnoreCase("petrol"))
        {
            return new petrolEngine();
        }
        else
        {
            throw new IllegalArgumentException("Invalid Engine Type");
        }

    }
}
