package ARCH.HW5;

public class RouteWitoutTollRoads implements RoutingStrategy {
    @Override
    public void getRoute(Point a, Point b) {
        //some routing logic
        System.out.println("The route without toll roads from " + a.getCoordinates() + " to " + b.getCoordinates()
                + " is loaded");
    }
}
