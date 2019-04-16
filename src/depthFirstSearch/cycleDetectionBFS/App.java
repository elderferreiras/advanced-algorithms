package depthFirstSearch.cycleDetectionBFS;

import vertex.Vertex;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");

        v1.addNeighborVertex(v2);
        v2.addNeighborVertex(v3);
        v1.addNeighborVertex(v3);
        v4.addNeighborVertex(v1);
        v4.addNeighborVertex(v5);
        v5.addNeighborVertex(v6);
        //v6.addNeighborVertex(v4);

        List<Vertex> vertexList = new ArrayList<Vertex>();
        vertexList.add(v1);
        vertexList.add(v2);
        vertexList.add(v3);
        vertexList.add(v4);
        vertexList.add(v5);
        vertexList.add(v6);

        CycleDetection cycleDetection = new CycleDetection();
        cycleDetection.detectCycle(vertexList);
    }
}
