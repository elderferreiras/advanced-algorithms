package breadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private int data;
    private boolean visited;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighboors() {
        return neighboors;
    }

    public void setNeighboors(List<Vertex> neighboors) {
        this.neighboors = neighboors;
    }

    private List<Vertex> neighboors;

    public Vertex(int data) {
        this.data = data;
        this.neighboors = new ArrayList<Vertex>();
    }

    public void addNeighborVertex(Vertex vertex) {
        this.neighboors.add(vertex);
    }

    @Override
    public String toString() {
        return Integer.toString(this.data);
    }
}


