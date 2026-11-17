package adapter.thirdparty;

public class IciciBank {
    public void sendMoney(String to, String from, int amount) {
        System.out.println("ICICI Bank sent Rupees " + amount + " to " + to + " from " + from);
    }
}
