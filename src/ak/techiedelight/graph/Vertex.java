package ak.techiedelight.graph;

public class Vertex {
    private Edge start;
    private Edge end;
    private int weight;

    public Vertex(Edge eStart, Edge eEnd, int weight) {
        this.start = eStart;
        this.end = eEnd;
        this.weight = weight;
    }
}
