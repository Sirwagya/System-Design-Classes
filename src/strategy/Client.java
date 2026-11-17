package strategy;

import strategy.enums.ModeType;
import strategy.factory.PathCalculatorFactory;
import strategy.interfaces.PathCalculator;

public class Client {
    public static void main(String[] args) {
        demoStrategy();
    }

    public static void demoStrategy() {
        PathCalculator bikeCalculator = PathCalculatorFactory.getPathCalculator(ModeType.BIKE);
        GoogleMap gMap = new GoogleMap(bikeCalculator);
        gMap.findPath("Vedam", "Newton");

        gMap.setPathCalculator(PathCalculatorFactory.getPathCalculator(ModeType.CAR));
        gMap.findPath("Vedam", "Newton");

        gMap.setPathCalculator(PathCalculatorFactory.getPathCalculator(ModeType.WALK));
        gMap.findPath("Vedam", "Newton");
    }
}
