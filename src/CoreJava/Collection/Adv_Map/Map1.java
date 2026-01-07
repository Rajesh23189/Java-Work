package CoreJava.Collection.Adv_Map;

import java.util.HashMap;

class Telusko
{
    private Integer id;
    private String courseName;

    public Integer getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Override
    public String toString()
    {
        return "Telusko [id = "+id+", courseName = "+courseName+"]";
    }

    public Telusko(Integer id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }
}


public class Map1 {
    public static void main(String args[])
    {
//        HashMap hm1 = new HashMap();
//        hm1.put(1,"Java");
//        hm1.put(2,"SpringBoot");
//        hm1.put(3,"Microservice");
//        System.out.println(hm1);

        Telusko telusko = new Telusko(1,"Java");
        HashMap hm2 = new HashMap();
        hm2.put("Alien","Java");
        hm2.put(telusko,"Java");
        hm2.put(1,"Name");
        hm2.put(1,"ame");//key Must Be unique
        hm2.put(null,"Rajesh");


        HashMap<Integer,String> hm3 = new HashMap<>();
        hm3.put(1,"Java");
    }
}
