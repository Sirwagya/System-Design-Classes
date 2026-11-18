package decorator.icecream;

import decorator.icecream.classes.Chocolate;
import decorator.icecream.classes.OrangeCone;
import decorator.icecream.classes.Vanilla;
import decorator.icecream.interfaces.IceCream;

public class Client {
    public static void main(String[] args) {
        demoDecorator();
    }

    public static void demoDecorator(){
        // Create a base IceCream

        IceCream iceCream = new OrangeCone();

        iceCream = new Vanilla (iceCream);
        iceCream = new Chocolate (iceCream);

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDesc());
    }
}
