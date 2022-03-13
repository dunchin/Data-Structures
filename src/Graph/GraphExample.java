package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

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
        //graph.get(u).add(v);
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

    void dfs(int start){

        Vector<Boolean> visited = new Vector<Boolean>(V);
        for (int i = 0; i < V; i++){
            visited.add(false);}

        Stack<Integer> a = new Stack<>();
        a.push(start);

        while(!a.isEmpty()){
            start = a.peek();
            a.pop();
            if(visited.get(start) == false)
            {
                System.out.print(start + " ");
                visited.set(start, true);
            }
        }
        Iterator<Integer> itr = graph.get(start).iterator();

        while (itr.hasNext()) {
            int v = itr.next();

            if(!visited.get(v))
            {
                a.push(v);}
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
        graph1.dfs(0);

    }

}