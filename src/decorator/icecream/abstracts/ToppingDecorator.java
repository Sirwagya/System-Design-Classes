package decorator.icecream.abstracts;

import decorator.icecream.interfaces.IceCream;

public abstract class ToppingDecorator implements IceCream{
    protected IceCream iceCream;
}
