package strategy;

import strategy.interfaces.PathCalculator;

public class GoogleMap {
    private PathCalculator pathCalculator;

    public GoogleMap(PathCalculator pathCalculator) {
        setPathCalculator(pathCalculator);
    }

    public void setPathCalculator(PathCalculator pathCalculator) {
        if (pathCalculator == null) {
            throw new IllegalArgumentException("PathCalculator cannot be null");
        }
        this.pathCalculator = pathCalculator;
    }

    public void findPath(String src, String dst) {
        int etaMinutes = pathCalculator.findPath(src, dst);
        System.out.println("Estimated time: " + etaMinutes + " mins");
    }
}
