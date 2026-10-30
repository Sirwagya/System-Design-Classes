package SOLID.classes;

import SOLID.interfaces.*;

public class Penguin extends Bird implements canRun, canSwim{

    public Penguin (String name){
        super(name);
    }

    public void Run () {
        System.out.println("can Walk, I guess");
    }

    public void Swim () {
        System.out.println("Can swim very well");
    }


}
