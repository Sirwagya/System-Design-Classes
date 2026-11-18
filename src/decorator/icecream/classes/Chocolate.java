package decorator.icecream.classes;

import decorator.icecream.abstracts.ToppingDecorator;
import decorator.icecream.interfaces.IceCream;

public class Chocolate extends ToppingDecorator{

     public Chocolate(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getCost(){
        return iceCream.getCost() + 120;
    }

    public String getDesc(){
        return iceCream.getDesc() + ", Chocolate";
    }

}
