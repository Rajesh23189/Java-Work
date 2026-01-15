package CoreJava.MULTITHREADING_CLASS_2;
class Student
{
    String name;
    int RollNo;
    String address;
    int batchNo;
    String Batchname;
    String result ;

    void Result_show()
    {
        this.result = "Fail";
    }
}
public class debug {
    public static void main(String args[])
    {
        Student st = new Student();

        st.name = "Rajesh";
        st.address = "Wb";
        st.Batchname = "Java";
        st.RollNo = 101;
        st.batchNo =  6;
        st.result = "Pass";
        st.Result_show();
        System.out.println("Show Result : "+st.result);

    }
}
