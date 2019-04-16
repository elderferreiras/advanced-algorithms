package depthFirstSearch;

import breadthFirstSearch.Vertex;

public class App {
    public static void main(String[] args) {
        Vertex v1 = new Vertex(1);
        Vertex v2 = new Vertex(2);
        Vertex v3 = new Vertex(3);
        Vertex v4 = new Vertex(4);
        Vertex v5 = new Vertex(5);

        v1.addNeighborVertex(v2);
        v1.addNeighborVertex(v3);
        v3.addNeighborVertex(v4);
        v4.addNeighborVertex(v5);

        DFS dfs = new DFS();
        dfs.dfs(v1);
    }
}
