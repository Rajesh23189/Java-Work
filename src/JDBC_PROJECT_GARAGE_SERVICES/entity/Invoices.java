package JDBC_PROJECT_GARAGE_SERVICES.entity;

public class Invoices {
    private int Invoices_id;
    private int customer_id;
    private int  vehicle_id;
    private double cost;


    public Invoices(int Invoices_id,int customer_id,int vehicle_id,double cost)
    {
        this.Invoices_id = Invoices_id;
        this.customer_id = customer_id;
        this.vehicle_id = vehicle_id;
        this.cost = cost;
    }


    public int getInvoices_id() {
        return Invoices_id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public int getVehicle_id() {
        return vehicle_id;
    }
    public double getcost() {
        return cost;
    }


    public void setInvoices_id(int id) {
        this.Invoices_id = Invoices_id;
    }
    public void setCustomer_id(int customer_id) {

        this.customer_id = customer_id;
    }
    public void setVehicle_id(int vehicle_id) {

        this.vehicle_id = vehicle_id;
    }


    @Override
    public String toString() {
        return "Invoices_id=" + Invoices_id +
                ", customer_id=" + customer_id +
                ", vehicle_id=" + vehicle_id +
                ", cost =" + cost;
    }
}
