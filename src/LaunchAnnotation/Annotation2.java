package LaunchAnnotation;

import java.lang.annotation.*;

//Craete My Own Annotation

@Retention(RetentionPolicy.RUNTIME)
@Target(
        {
        ElementType.TYPE,
        ElementType.CONSTRUCTOR,
        ElementType.METHOD}
       )
@interface CricketPlayear
{
    String country() default  "India";
    int age();
} //@ this specifies comiler that annotation type is being create


//Dhoni is a cricket player who lived india and play for india and won all ICC tropy

@CricketPlayear(country = "India",age=35) //You Write
class Dhoni
{
     private int innings;
     public Dhoni()
     {

     }
     @CricketPlayear(age =44 )
    public int getInnings() {
        return innings;
    }

    @CricketPlayear(age =44 )
    public void setInnings(int innings) {
        this.innings = innings;
    }
}
public class Annotation2 {
    public static void main(String args[])
    {
       Dhoni thala = new Dhoni();
       thala.setInnings(297);
       System.out.println(thala.getInnings());



       //API to Fatch The data
        Class<? extends Dhoni > c = thala.getClass();
       CricketPlayear an = c.getAnnotation(CricketPlayear.class);
       CricketPlayear CP =(CricketPlayear)an;
       int age  = CP.age();
       String co = CP.country();
        System.out.println(age);
        System.out.println(co);

    }
}
