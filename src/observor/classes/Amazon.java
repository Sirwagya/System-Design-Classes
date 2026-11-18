package observor.classes;

import java.util.ArrayList;
import java.util.List;
import observor.interfaces.Publisher;
import observor.interfaces.Subscriber;

public class Amazon implements Publisher {
    private List<Subscriber> subs = new ArrayList<>();

    @Override
    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    @Override
    public void notifySub() {
        for (Subscriber s : subs) {
            s.update();
        }
    }

    public void orderPlace() {
        System.out.println("Order has been placed");
        notifySub();
    }
}
