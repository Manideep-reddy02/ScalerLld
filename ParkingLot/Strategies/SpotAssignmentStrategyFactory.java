package ParkingLot.Strategies;

import ParkingLot.Models.SlotAllotmentStrategyType;

public class SpotAssignmentStrategyFactory {
    public static SpotAssignmentStrategy getStrategyByType(SlotAllotmentStrategyType slotAllotmentStrategyType){
        return new RandomAssignmentStrategy();
    }
}
