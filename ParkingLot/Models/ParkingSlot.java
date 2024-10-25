package ParkingLot.Models;

import java.util.List;

public class ParkingSlot extends BaseModel{
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private int  spotNumber;
    private ParkingFloor parkingFloors;

    public List<VehicleType> getSupportedVehicleTypes() {
        return supportedVehicleTypes;
    }

    public void setSupportedVehicleTypes(List<VehicleType> supportedVehicleTypes) {
        this.supportedVehicleTypes = supportedVehicleTypes;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public ParkingFloor getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(ParkingFloor parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
