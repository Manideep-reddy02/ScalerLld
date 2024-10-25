package ParkingLot.Controllers;

import ParkingLot.DTOS.IssueTicketRequestDTO;
import ParkingLot.DTOS.IssueTicketResponseDTO;
import ParkingLot.DTOS.ResponseStatus;
import ParkingLot.Models.Ticket;
import ParkingLot.Service.TicketService;

public class TicketController {
    TicketService ticketService;

    TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO requestDTO){
        Ticket ticket;
        IssueTicketResponseDTO responsedto = new IssueTicketResponseDTO();
        try {
             ticket = ticketService.issueTicket(
                    requestDTO.getVehicleType(),
                    requestDTO.getVehicleNumber(),
                    requestDTO.getOwnerName(),
                    requestDTO.getGateID());
        }
        catch (Exception ex){
            responsedto.setResponseStatus(ResponseStatus.FAILURE);
            return responsedto;
        }

        responsedto.setTicket(ticket);
        responsedto.setResponseStatus(ResponseStatus.SUCCESS);
        return responsedto;
    }
}
