package SOLID.classes;

import SOLID.interfaces.*;


public class Ostrich extends Bird implements canRun{

    public Ostrich (String name) {
        super(name);
    }
    
    @Override 
    public void Run(){
        System.out.println("Can Run, not Swim");
    }
}
