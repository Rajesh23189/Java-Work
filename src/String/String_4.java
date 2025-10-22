package String;

import com.sun.jdi.event.StepEvent;

public class String_4 {
    public static void main(String args[])
    {
        /* It Not Possible Bcz s1 is final
        final String s1 = "Rajesh";
        s1 = s1+" Manik";  */

        /*final String s1 = "RAJESH";
        String s2 = s1 + " MANIK";
        //It Possible We Only Use The Data */

        /*String s1 = "RAJESH";
        String s2 = "RAJESH";
        int res = s1.compareTo(s2);
        if(res == 0) System.out.println("String Is Euqel");
        else System.out.println("String Is Euqel");*/




//        /** StringBufer : allways Create The Heap Area**/
//        StringBuffer st1 = new StringBuffer("Rajesh");
//        System.out.println(st1);
//        st1.append(" Manik");
//        System.out.println(st1); //Same String Where Is Chage





//          //Default Size Of StringBuffer : 16 same as stringBuffer
//        StringBuffer str  = new StringBuffer();
//        System.out.println(str.capacity());



        //Different Behave Of equal Methos : It a Part Of Object Class , BY Default It chake Reference
        StringBuilder st1  = new StringBuilder("Rajesh");
        StringBuilder st2  = new StringBuilder("Rajesh");
        System.out.println(st1.equals(st2)); //Object Create In Heap Area so, False ,BCZ ,StringBulider class Inheritance The equal Mathod , chake Object or reference


        //String Class Override The method , to compair the content
        String st3  = new String("Rajesh");
        String st4  = new String("Rajesh");
        System.out.println(st3.equals(st4));//Create Alos Heap Area ,  but true , compair content
        // equal : method so, Show The Behaveor Based con Object , mean Polymorphism








    }
}
