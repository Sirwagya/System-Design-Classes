package adapter;

public class Client {
    public static void main(String[] args) {
        demoAdapter();
    }

    private static void demoAdapter() {
        String from = "Hari";
        String to = "Ravi";
        int amount = 89_045;

        PhonePe phonePeWithYesBank = new PhonePe(new yesBankAdapter());
        phonePeWithYesBank.pay(from, to, amount);

        PhonePe phonePeWithIciciBank = new PhonePe(new iciciBankAdapter());
        phonePeWithIciciBank.pay(from, to, amount);
    }
}
