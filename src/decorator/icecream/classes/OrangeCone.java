package decorator.icecream.classes;

import decorator.icecream.interfaces.IceCream;

public class OrangeCone implements IceCream{

    public int getCost(){
        return 10;
    }

    public String getDesc(){
        return "Orange Cone";
    }
}
