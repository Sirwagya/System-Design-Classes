package adapter;

import adapter.adapters.IciciBankAdapter;
import adapter.adapters.YesBankAdapter;

public class Client {
    public static void main(String[] args) {
        demoAdapter();
    }

    public static void demoAdapter() {
        String from = "Hari";
        String to = "Ravi";
        int amount = 89_045;

        PhonePe phonePeWithYesBank = new PhonePe(new YesBankAdapter());
        phonePeWithYesBank.pay(from, to, amount);

        PhonePe phonePeWithIciciBank = new PhonePe(new IciciBankAdapter());
        phonePeWithIciciBank.pay(from, to, amount);
    }
}
