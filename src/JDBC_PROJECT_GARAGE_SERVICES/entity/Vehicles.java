package JDBC_PROJECT_GARAGE_SERVICES.entity;

public class Vehicles {
    private int vehicle_id;
    private String vehicle_number_plate;
    private String vehicle_model;


    public Vehicles()
    {

    }
    public Vehicles(int vehicle_id, String vehicle_number_plate, String vehicle_model) {
        this.vehicle_id = vehicle_id;
        this.vehicle_number_plate = vehicle_number_plate;
        this.vehicle_model = vehicle_model;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_number_plate() {
        return vehicle_number_plate;
    }

    public void setVehicle_number_plate(String vehicle_number_plate) {
        this.vehicle_number_plate = vehicle_number_plate;
    }

    public String getVehicle_model() {
        return vehicle_model;
    }

    public void setVehicle_model(String vehicle_model) {
        this.vehicle_model = vehicle_model;
    }

    @Override
    public String toString() {
        return
                "vehicle_id=" + vehicle_id +
                ", vehicle_number_plate='" + vehicle_number_plate + '\'' +
                ", vehicle_model='" + vehicle_model ;
    }
}
