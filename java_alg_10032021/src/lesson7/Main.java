package lesson7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(1, 6);
        graph.addEdge(6, 9);
        graph.addEdge(9, 7);
        graph.addEdge(7, 3);
        graph.addEdge(7, 4);
        graph.addEdge(3, 5);
        graph.addEdge(5, 4);
        graph.addEdge(4, 8);
        graph.addEdge(8, 2);
        graph.addEdge(8, 0);

        BreadthFirstPath breadthFirstPath = new BreadthFirstPath(graph, 0);
        System.out.println(breadthFirstPath.pathTo(9)); //[8, 4, 7, 9]

    }
}
