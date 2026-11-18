package observor;

import observor.classes.*;
import observor.interfaces.*;
public class client {
    public static void main(String[] args) {
        demoObservor();
    }

    public static void demoObservor(){

        Amazon amazon = new Amazon();
        Subscriber email = new emailService();
        Subscriber inv = new inventoryService();
        Subscriber log = new logisticService();

        amazon.subscribe(inv);
        amazon.subscribe(email);
        amazon.subscribe(log);

        amazon.orderPlace();

    }
}
