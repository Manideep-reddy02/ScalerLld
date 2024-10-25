package ParkingLot.Service;

import ParkingLot.Exceptions.GateNotFoundException;
import ParkingLot.Models.*;
import ParkingLot.Repository.GateRepository;
import ParkingLot.Repository.ParkingLotRepository;
import ParkingLot.Repository.VehicleRepository;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    public Ticket issueTicket(VehicleType vehicleType,
                              String vehicleNumber,
                              String ownerName,
                              Long gateID) throws GateNotFoundException {
        //Create a ticket Object
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        //setup gate for my ticket Object

        Optional<Gate> gateOptional = gateRepository.getGateById(gateID);
        if(gateOptional.isEmpty()){
            throw new GateNotFoundException();
        }
        Gate gate = gateOptional.get();
        ticket.setGeneratedAt(gate);
        ticket.setGeneratedBy(gate.getOperator());

        //setup vehicle in ticket object

        //check if vehicle in database
        //1 -> yes
             // get vehicle from db
             // put that in ticket object
        //2 -> No
             //create object of vehicle and save in DB
             // put in ticket object
         Optional<Vehicle> vehicleOptional = vehicleRepository.getVehicleByNumber(vehicleNumber);

         Vehicle saveVehicle;

         if(vehicleOptional.isEmpty()){
             Vehicle vehicle = new Vehicle(vehicleNumber,vehicleType,ownerName);
             saveVehicle = vehicleRepository.saveVehicle(vehicle);
         }else{
             saveVehicle = vehicleOptional.get();

         }
         ticket.setVehicle(saveVehicle);

         //to assign a slot we need slot assign strategy and parkingLot
        // parking lot-> type of spotAssignmentStrategy


        //get the parking lot from the gate
         ParkingLot parkingLot = parkingLotRepository.getParkingLotBygate(gate);
         SlotAllotmentStrategyType slotAllotmentStrategyType = parkingLot.getSlotAllotmentStrategyType();



        //assign a spot to the vehicle
        //return ticket object
        return null;

    }
}
