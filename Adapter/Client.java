package Adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAdapter());
        System.out.println(phonePe.returnBlance());

    }
}
