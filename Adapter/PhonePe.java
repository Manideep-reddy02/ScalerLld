package Adapter;

public class PhonePe {
    private BankApi bankApi;

    public PhonePe(BankApi bankApi){
        this.bankApi = bankApi;
    }
    double returnBlance (){
        double currentBalance = bankApi.getBlance("123456");
        return currentBalance*2;
    }
}
