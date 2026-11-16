package adapter;

import adapter.yes_bank.yesBank;

public class yesBankAdapter implements BankAPI {
    private final yesBank bank;

    public yesBankAdapter() {
        this(new yesBank());
    }

    public yesBankAdapter(yesBank bank) {
        if (bank == null) {
            throw new IllegalArgumentException("yesBank instance cannot be null");
        }
        this.bank = bank;
    }

    @Override
    public void transfer(String from, String to, int amount) {
        bank.sendAmount(to, from, amount);
    }
}
