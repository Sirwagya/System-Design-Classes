package decorator.icecream.classes;

import decorator.icecream.abstracts.ToppingDecorator;
import decorator.icecream.interfaces.IceCream;

public class ButterScotch extends ToppingDecorator{

     ButterScotch(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public int getCost(){
        return iceCream.getCost() + 90;
    }

    public String getDesc(){
        return iceCream.getDesc() + ", ButterScotch";
    }
}
