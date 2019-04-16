package depthFirstSearch;

import breadthFirstSearch.Vertex;

import java.util.Stack;

public class DFS {
    public void dfs(Vertex vertex) {
        Stack<Vertex> stack = new Stack<Vertex>();
        stack.push(vertex);
        vertex.setVisited(true);

        while (!stack.empty()) {
            Vertex current = stack.pop();
            System.out.println("Visited " + current);

            for(Vertex v: current.getNeighboors()) {
                if(!v.isVisited()) {
                    stack.push(v);
                }
            }
        }

    }
}
