package solid.models;

import solid.interfaces.CanRun;

public class Ostrich extends Bird implements CanRun {
    public Ostrich(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " can run fast, but cannot fly or swim.");
    }
}
