package Collection.Generic;

import java.util.ArrayList;
interface Alpha<T>
{

}
class Generics<T> //implements Alpha<String>
{
    //T wapper Class Data Type
    private T ref;
    public Generics(T ref)
    {
        this.ref = ref;
    }
    public void disp()
    {
        System.out.println("The Tyoe Of T Is : "+ref.getClass().getName());
    }
    public T getRef()
    {
        return ref;
    }
}

public class Gen_2 {

    public static void main(String args[])
    {
        Generics<Integer> my_gen = new Generics<>(44);
        my_gen.disp();
        System.out.println(my_gen.getRef());


        //Generics<Integer> my_gen = new Generics<>("Rajesh"); give compile Time error Becouse We working on Integer Type of data

        Generics<String> my_gen1 = new Generics<>("Rajesh");
        my_gen1.disp();
        System.out.println(my_gen1.getRef());

    }
}
