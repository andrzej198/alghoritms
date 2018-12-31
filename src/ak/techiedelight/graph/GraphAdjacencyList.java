package ak.techiedelight.graph;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList implements DiGraph {

    List<Edge> edges = new ArrayList<Edge>();
    List<Vertex> vertexs;

    @Override
    public void addEdge(Edge e) {
        e.setNumber(edges.size());
        edges.add(e);
    }

    @Override
    public int getEdgesNumber() {
        return edges.size();
    }

    @Override
    public void addVertex(Edge eStart, Edge eEnd, int weight) {
        Vertex vertex = new Vertex(eStart, eEnd, weight);
        if (!edges.contains(eStart)) {
            edges.add(eStart);
        }
        if (!edges.contains(eEnd)) {
            edges.add(eEnd);
        }
        vertexs.add(vertex);
    }
}
