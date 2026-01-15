package CoreJava.Exception_Handling;
class Gamma{
    public int disp(){
        try{
            System.out.println("Disp Method Called");
            return 10;
        }
        finally {
            System.out.println("Finally Block Of Gamma");
            return 44;
        }

    }
}
public class Ex_Hand_5 {
    public static void main(String args[]){
        Gamma ga = new Gamma();
        System.out.println(ga.disp()); // Output : 44
    }
}

/**After return Statement finally Block Excuted**/
