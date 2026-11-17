package strategy.strategies;

import strategy.interfaces.PathCalculator;

public class CarPathCalculator implements PathCalculator {
    @Override
    public int findPath(String src, String dst) {
        System.out.println("Calculating car route from " + src + " to " + dst);
        return 15;
    }
}
