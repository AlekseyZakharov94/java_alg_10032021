package ARCH.HW5;

public class ShortestRoute implements RoutingStrategy {

    @Override
    public void getRoute(Point a, Point b) {
        //some routing logic
        System.out.println("The shortest route from " + a.getCoordinates() + " to " + b.getCoordinates() + " is loaded");
    }
}
