package solid.models;

import solid.interfaces.Flyable;
import solid.interfaces.Singable;

public class Eagle extends Bird implements Flyable, Singable {
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " soars high in the sky.");
    }

    @Override
    public void sing() {
        System.out.println(getName() + " screeches.");
    }
}
