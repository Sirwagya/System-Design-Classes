package SOLID.classes;

import SOLID.interfaces.*;

public class Sparrow extends Bird implements Singable, Flyable{
    public Sparrow (String name) {
        super(name);
    }

    public void sing() {
        System.out.println("Sings very well");
    }
    
    public void fly() {
        System.out.println("can Fly");
    }
}
