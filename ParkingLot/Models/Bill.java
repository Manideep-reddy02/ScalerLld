package ParkingLot.Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    private Date exitTime;
    private Operator generatedBy;
    private int amount;
    private Ticket ticket;
    private BillStatus billStatus;
    private Gate gate;
    private List<Payment> payments;

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Operator getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public List<FeeCaluculatorStrategyType> getFeeCaluculatorStrategyTypes() {
        return feeCaluculatorStrategyTypes;
    }

    public void setFeeCaluculatorStrategyTypes(List<FeeCaluculatorStrategyType> feeCaluculatorStrategyTypes) {
        this.feeCaluculatorStrategyTypes = feeCaluculatorStrategyTypes;
    }

    private List<FeeCaluculatorStrategyType> feeCaluculatorStrategyTypes;

}
