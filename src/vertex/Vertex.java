package vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * Vertex class.
 */
public class Vertex {
    private String data;
    private boolean visited;
    private boolean beingVisited;
    private List<Vertex> neighboors;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public boolean isBeingVisited() {
        return beingVisited;
    }

    public void setBeingVisited(boolean beingVisited) {
        this.beingVisited = beingVisited;
    }

    public List<Vertex> getNeighboors() {
        return neighboors;
    }

    public void setNeighboors(List<Vertex> neighboors) {
        this.neighboors = neighboors;
    }

    public Vertex(String data) {
        this.data = data;
        this.neighboors = new ArrayList<Vertex>();
    }

    public void addNeighborVertex(Vertex vertex) {
        this.neighboors.add(vertex);
    }

    @Override
    public String toString() {
        return this.data;
    }
}


