package solid.models;

import solid.interfaces.CanRun;
import solid.interfaces.CanSwim;

public class Penguin extends Bird implements CanRun, CanSwim {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " waddles on land.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims very well.");
    }
}
