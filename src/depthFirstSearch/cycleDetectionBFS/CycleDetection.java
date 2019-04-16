package depthFirstSearch.cycleDetectionBFS;

import vertex.Vertex;

import java.util.List;

public class CycleDetection {
    public void detectCycle(List<Vertex> vertexList) {
        for (Vertex v: vertexList) {
            if ( !v.isVisited() ) {
                dfs(v);
            }
        }
    }

    public void dfs(Vertex vertex) {
        System.out.println("DFS on vertex " + vertex);
        vertex.setBeingVisited(true);

        for(Vertex v: vertex.getNeighboors()) {
            System.out.println("Visiting the neighbors of vertex " + vertex);
            if (v.isBeingVisited()) {
                System.out.println("There is a backward edge, therefore a cycle.");
                return;
            }

            if( !v.isVisited() ) {
                System.out.println("Visiting vertex " + v + "  .");
                v.setVisited(true);
                dfs(v);
            }
        }

        vertex.setBeingVisited(false);
        vertex.setVisited(true);
    }
}
