package adapter.thirdparty;

public class YesBank {
    public void sendAmount(String to, String from, int amount) {
        System.out.println("Yes Bank sent Rupees " + amount + " to " + to + " from " + from);
    }
}
