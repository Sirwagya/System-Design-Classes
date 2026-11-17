package adapter.adapters;

import adapter.interfaces.BankAPI;
import adapter.thirdparty.YesBank;

public class YesBankAdapter implements BankAPI {
    private final YesBank bank;

    public YesBankAdapter() {
        this(new YesBank());
    }

    public YesBankAdapter(YesBank bank) {
        if (bank == null) {
            throw new IllegalArgumentException("YesBank instance cannot be null");
        }
        this.bank = bank;
    }

    @Override
    public void transfer(String from, String to, int amount) {
        bank.sendAmount(to, from, amount);
    }
}
