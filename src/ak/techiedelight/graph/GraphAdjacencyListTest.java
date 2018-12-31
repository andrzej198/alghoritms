package ak.techiedelight.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GraphAdjacencyListTest {

    public static final int GRAPH_SIZE = 10;

    @org.junit.jupiter.api.Test
    void addEdge() {
        Graph g = new GraphAdjacencyList();
        g.addEdge(new Edge("A"));
        assertEquals(1, g.getEdgesNumber());
        g.addEdge(new Edge("B"));
        assertEquals(2, g.getEdgesNumber());
    }

    @org.junit.jupiter.api.Test
    void getEdgesNumber() {
        Graph g = new GraphAdjacencyList();
        for (int i = 0; i < GRAPH_SIZE; i++) {
            g.addEdge(new Edge("A" + i));
        }

        assertEquals(GRAPH_SIZE, g.getEdgesNumber());
    }

    @org.junit.jupiter.api.Test
    void createTestGraph() {
        DiGraph g = new GraphAdjacencyList();
        Edge e0 = new Edge("0");
        Edge e1 = new Edge("1");
        Edge e2 = new Edge("2");
        Edge e3 = new Edge("3");

        g.addVertex(e2, e0, 5);
        g.addVertex(e0, e1, 6);
        g.addVertex(e2, e1, 4);
        g.addVertex(e1, e2, 7);
        g.addVertex(e3, e2, 10);


        //Vertex v20 = new Vertex(e0, e1, )


    }
}