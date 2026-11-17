package adapter.adapters;

import adapter.interfaces.BankAPI;
import adapter.thirdparty.IciciBank;

public class IciciBankAdapter implements BankAPI {
    private final IciciBank bank;

    public IciciBankAdapter() {
        this(new IciciBank());
    }

    public IciciBankAdapter(IciciBank bank) {
        if (bank == null) {
            throw new IllegalArgumentException("IciciBank instance cannot be null");
        }
        this.bank = bank;
    }

    @Override
    public void transfer(String from, String to, int amount) {
        bank.sendMoney(to, from, amount);
    }
}
