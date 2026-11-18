package observor;

import observor.classes.Amazon;
import observor.classes.emailService;
import observor.classes.inventoryService;
import observor.interfaces.Subscriber;

public class client {
    public static void main(String[] args) {
        demoObservor();
    }

    private static void demoObservor(){

        Amazon amazon = new Amazon();
        Subscriber email = new emailService();
        Subscriber inv = new inventoryService();

        amazon.subscribe(inv);
        amazon.subscribe(email);

        amazon.orderPlace();

    }
}
