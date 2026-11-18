package observor.classes;

import observor.interfaces.*;

public class logisticService implements Subscriber{

    @Override
    public void update() {
        System.out.println("Logistics Updated");
    }

}
