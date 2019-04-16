package depthFirstSearch.topoloticalOrder;

import vertex.Vertex;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class App {
    public static void main(String[] args) {
        TopologicalOrdering to = new TopologicalOrdering();
        List<Vertex> graph = new ArrayList<Vertex>();

        graph.add(new Vertex("0"));
        graph.add(new Vertex("1"));
        graph.add(new Vertex("2"));
        graph.add(new Vertex("3"));
        graph.add(new Vertex("4"));
        graph.add(new Vertex("5"));

        graph.get(2).addNeighborVertex(graph.get(3));
        graph.get(3).addNeighborVertex(graph.get(1));
        graph.get(4).addNeighborVertex(graph.get(0));
        graph.get(4).addNeighborVertex(graph.get(1));
        graph.get(5).addNeighborVertex(graph.get(0));
        graph.get(5).addNeighborVertex(graph.get(2));

        for(int i = 0; i < graph.size(); i++) {
            if( !graph.get(i).isVisited() ) {
                to.dfs(graph.get(i));
            }
        }

        Stack<Vertex> stack = to.getStack();

        for (int i = 0; i < graph.size(); i++) {
            Vertex vertex = stack.pop();
            System.out.println(vertex + " -> ");
        }
    }
}
