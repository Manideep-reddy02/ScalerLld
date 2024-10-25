package ParkingLot.Strategies;

import ParkingLot.Models.*;

public interface SpotAssignmentStrategy {
    ParkingSlot getSlot(Gate gate, VehicleType vehicleType);
}
