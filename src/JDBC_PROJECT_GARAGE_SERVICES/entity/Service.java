package JDBC_PROJECT_GARAGE_SERVICES.entity;

public class Service {

    private int service_id;
    private String services_name;
    private double cost;


    public Service()
    {

    }


    public Service(int service_id, String services_name, double cost) {
        this.service_id = service_id;
        this.services_name = services_name;
        this.cost = cost;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public String getServices_name() {
        return services_name;
    }

    public void setServices_name(String services_name) {
        this.services_name = services_name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "service_id=" + service_id +
                ", services_name= " + services_name  +
                ", cost=" + cost ;
    }
}
