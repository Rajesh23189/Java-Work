package LooseCoupling;

public class Car {

    Engine engine = new PetrolEngine();

    public void Drive()
    {
        engine.start();
        System.out.println("Car Is Started.....");
    }
}


/*
---> Flexible But Still poor
---> we are using interface but we have make object hardcoded [new PetrolEngine()]


  ====> To remove this problem we use factory design patten

 */
