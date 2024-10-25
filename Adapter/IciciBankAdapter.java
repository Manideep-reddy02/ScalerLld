package Adapter;

import Adapter.thirdparty.IcicibankApi.IcciBankApi;

public class IciciBankAdapter implements BankApi{
   private IcciBankApi icciBankApi = new IcciBankApi();
    @Override
    public double getBlance(String accountNumber) {
        return icciBankApi.getbalance();
    }

    @Override
    public boolean sendMoney(String fromAmount, String toAmount, double amount) {
        return false;
    }
}
