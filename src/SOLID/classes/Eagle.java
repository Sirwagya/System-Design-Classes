package SOLID.classes;
import SOLID.interfaces.*;

public class Eagle extends Bird implements Flyable , Singable{ 
    public Eagle (String name){
        super(name);
    }
    @Override 
    public void fly () {
        System.out.println("Flies");
    }

    @Override 
    public void sing() {
        System.out.println("Sings");
    }

}
