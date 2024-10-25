package ParkingLot.Strategies;

import ParkingLot.Models.Gate;
import ParkingLot.Models.ParkingSlot;
import ParkingLot.Models.VehicleType;

public class RandomAssignmentStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSlot getSlot(Gate gate, VehicleType vehicleType) {
        return null;
    }
}
