package lesson7;

public class GraphPath {
    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    public GraphPath(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
    }
}
