package breadthFirstSearch;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public void run(Vertex vertex) {
        Queue<Vertex> queue = new LinkedList<Vertex>();
        queue.add(vertex);
        vertex.setVisited(true);

        while (!queue.isEmpty()) {
            Vertex current = queue.remove();

            System.out.println(current + " ");

            for(Vertex v: current.getNeighboors()) {
                if(!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
