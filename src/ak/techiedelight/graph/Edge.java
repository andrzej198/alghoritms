package ak.techiedelight.graph;

public class Edge {
    /**
     * -1 if edge is not set up.
     */
    private int number = -1;
    private String name;

    public Edge(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
