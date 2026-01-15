package CoreJava.Array;



class Alien
{
    int id;
    String name;
    String cours;
}



public class Array_5 {
    public static void main(String args[])
    {
        //Create array with defiend class
        Alien[] arr = new Alien[3];
        arr[0]  = new Alien();
        arr[1]  = new Alien();
        arr[2]  = new Alien();

        arr[0].id = 1;
        arr[0].name = "Rajesh";
        arr[0].cours = "Java ";
        System.out.println(arr[0].id);
        System.out.println(arr[0].name);
        System.out.println(arr[0].cours);
    }
}
