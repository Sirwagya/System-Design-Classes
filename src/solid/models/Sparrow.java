package solid.models;

import solid.interfaces.Flyable;
import solid.interfaces.Singable;

public class Sparrow extends Bird implements Singable, Flyable {
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println(getName() + " sings very well.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " flies swiftly.");
    }
}
