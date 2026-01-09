package JDBC_PROJECT_GARAGE_SERVICES.entity;

public class Customer {

    private int customer_id;
    private String customer_name;
    private String customer_ph_no;


    public Customer(int customer_id,String customer_name,String customer_ph_no)
    {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_ph_no = customer_ph_no;
    }




    public int getCustomer_id(){
        return customer_id;
    }

    public String getcustomer_name(){
        return customer_name;
    }
    public String getcustomer_ph_no(){
        return customer_ph_no;
    }


    public void setCustomer_id(int customer_id)
    {
        this.customer_id = customer_id;
    }

    public void setCustomer_name(String customer_name)
    {
        this.customer_name = customer_name;
    }

    public void setCustomer_ph_no(String customer_ph_no)
    {
        this.customer_ph_no = customer_ph_no;
    }


    @Override
    public String toString() {
        return "customer_id = "+customer_id+"||  customer name is  = "+customer_name+"|| customer phone number = "+customer_ph_no;
    }

}
