package decorator.icecream.classes;

import decorator.icecream.abstracts.ToppingDecorator;
import decorator.icecream.interfaces.IceCream;

public class Vanilla extends ToppingDecorator{

    public Vanilla(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getCost(){
        return iceCream.getCost() + 100;
    }

    public String getDesc(){
        return iceCream.getDesc() + ", Vanilla";
    }
}
