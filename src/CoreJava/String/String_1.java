package CoreJava.String;

public class String_1 {
    public static void main(String args[])
    {
    /** Here string Create CoreJava.String Constance Pool Duplicate Not allow**/
//        CoreJava.String str1 = "Rajesh";
//        CoreJava.String str2 = "Rajesh";
//        System.out.println(str1 == str2);//True


        /** Here string Create Heap : Duplicate allow  **/
//        CoreJava.String str1 = new CoreJava.String("Rajesh");
//        CoreJava.String str2 = new CoreJava.String("Rajesh");
//        System.out.println(str1 == str2);//False


        /** equal() : Compair the Content of string **/
//        CoreJava.String str1 = new CoreJava.String("Rajesh");
//        CoreJava.String str2 = new CoreJava.String("Rajesh");
//        System.out.println(str1.equals(str2));//True

//        /** Concat **/
//        CoreJava.String str1 = new CoreJava.String("Rajesh");
//        System.out.println(str1);
//        str1 = str1.concat("Manik");
//        System.out.println(str1);// New str1 Object Created

//        /**  Concept  **/
//        CoreJava.String st1 = "Rajesh";
//        CoreJava.String st2 = st1.concat(" Java"); // if we perfrom Concat Opeartion then Object Create In Heap Area
//        CoreJava.String st3 = "Rajesh Java"; // Object Create In SCP area
//        /**So , st2 and st3 Refraence Is Differnt Object **/
//        System.out.println(st1 == st2);//false
    }
}
/** CoreJava.String is Immutable **/
