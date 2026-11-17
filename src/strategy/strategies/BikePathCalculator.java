package strategy.strategies;

import strategy.interfaces.PathCalculator;

public class BikePathCalculator implements PathCalculator {
    @Override
    public int findPath(String src, String dst) {
        System.out.println("Calculating bike route from " + src + " to " + dst);
        return 10;
    }
}
