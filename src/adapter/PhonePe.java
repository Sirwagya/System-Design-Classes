package adapter;

public class PhonePe {
    private final BankAPI bankApi;

    public PhonePe(BankAPI bankApi) {
        if (bankApi == null) {
            throw new IllegalArgumentException("BankAPI implementation cannot be null");
        }
        this.bankApi = bankApi;
    }

    public void pay(String from, String to, int amount) {
        bankApi.transfer(from, to, amount);
    }
}
