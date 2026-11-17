package strategy.strategies;

import strategy.interfaces.PathCalculator;

public class WalkPathCalculator implements PathCalculator {
    @Override
    public int findPath(String src, String dst) {
        System.out.println("Calculating walking route from " + src + " to " + dst);
        return 35;
    }
}
