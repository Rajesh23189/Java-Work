package Collection.MAP;

import java.util.HashMap;
class Telusko
{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Telusko{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Telusko(int id,String name ) {
        this.id = id;
        this.name = name;
    }

    public Telusko() {
        super();
    }
}
public class Map_1 {
    public static void main(String args[])
    {
//        HashMap hm1 = new HashMap();
//        hm1.put(1,"Java");
//        hm1.put(alien,"SpringBoot");
//        hm1.put(56.3,"MicroServices");
//        System.out.println(hm1);


        Telusko telusko = new Telusko(1,"java");
        HashMap hm2 = new HashMap();
        hm2.put(telusko,"SpringBoot");//key Is object Type
        hm2.put(4,"MicroService");
        hm2.put(null,"MicroService");//Value Duplicate Allow
        hm2.put(8,null); //Value can also Be null


    }
}
