package Adapter;

public interface BankApi {
     double getBlance(String accountNumber);

     boolean sendMoney(String fromAmount,String toAmount,double amount);


}
