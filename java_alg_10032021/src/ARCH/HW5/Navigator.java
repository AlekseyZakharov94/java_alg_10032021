package ARCH.HW5;

public class Navigator {

    public void getRoute(RoutingStrategy routingStrategy, Point a, Point b) {
        routingStrategy.getRoute(a, b);
    }

    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        RoutingStrategy strategy1 = new ShortestRoute();
        RoutingStrategy strategy2 = new RouteWitoutTollRoads();
        navigator.getRoute(strategy1, new Point("53.339688, -6.236688"), new Point("35.339688, -18.236688"));
        navigator.getRoute(strategy2, new Point("53.339688, -6.236688"), new Point("35.339688, -18.236688"));
    }
}
