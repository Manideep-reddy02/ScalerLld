package ParkingLot.Models;

public class Vehicle extends BaseModel {
    private String number;
    private VehicleType vehicleType;
    private String owner;

    public Vehicle(String number, VehicleType vehicleType, String owner) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
