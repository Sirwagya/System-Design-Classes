package adapter;

import adapter.icici_bank.iciciBank;

public class iciciBankAdapter implements BankAPI {
    private final iciciBank bank;

    public iciciBankAdapter() {
        this(new iciciBank());
    }

    public iciciBankAdapter(iciciBank bank) {
        if (bank == null) {
            throw new IllegalArgumentException("iciciBank instance cannot be null");
        }
        this.bank = bank;
    }

    @Override
    public void transfer(String from, String to, int amount) {
        bank.sendMoney(to, from, amount);
    }
}
