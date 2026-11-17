package strategy.factory;

import strategy.enums.ModeType;
import strategy.interfaces.PathCalculator;
import strategy.strategies.BikePathCalculator;
import strategy.strategies.CarPathCalculator;
import strategy.strategies.WalkPathCalculator;

public class PathCalculatorFactory {
    private PathCalculatorFactory() {}

    public static PathCalculator getPathCalculator(ModeType mode) {
        if (mode == null) {
            throw new IllegalArgumentException("ModeType cannot be null");
        }
        return switch (mode) {
            case CAR -> new CarPathCalculator();
            case BIKE -> new BikePathCalculator();
            case WALK -> new WalkPathCalculator();
        };
    }
}
