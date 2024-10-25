package Adapter;

import Adapter.thirdparty.YesBankApi.yesbankApi;

public class YesBankAdapter implements BankApi{
    private yesbankApi yesbankApi = new yesbankApi();
    @Override
    public double getBlance(String accountNumber) {
        return yesbankApi.getbal();
    }

    @Override
    public boolean sendMoney(String fromAmount, String toAmount, double amount) {
        return false;
    }
}
