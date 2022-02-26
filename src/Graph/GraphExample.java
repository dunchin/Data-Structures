package Graph;

import java.util.ArrayList;

class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int V;

    Graph(int nodes) {
        V = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<Integer>());
        }

    }

    void addEdge(int v, int u) {
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph() {
        for (int i = 0; i < V; i++) {
           /* System.out.print("NODE " + i);
            for(int x: graph.get(i))System.out.print("->" + x);
            System.out.println();*/

            System.out.print("Node " + i);
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print("-> " + graph.get(i).get(j));

            }
            System.out.println();
        }
    }


}

public class GraphExample {

    public static void main(String[] args) {
        Graph graph1 = new Graph(5);
        graph1.addEdge(0, 1);
        graph1.addEdge(1, 2);
        graph1.addEdge(1, 3);
        graph1.addEdge(3, 4);
        graph1.printGraph();

    }

}
