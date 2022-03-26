package graph;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

class Graph_practice {
    int V ;
    ArrayList<ArrayList<Integer>> g;

    Graph_practice(int nodes){
        V = nodes;
        g = new ArrayList<ArrayList<Integer>>();
        for (int i = 0 ; i < V ; i++){
            g.add(new ArrayList<>());
        }

    }
    void addEdge(int u , int v){
        //Directed Graph
        g.get(u).add(v);
        //Undirected Graph - add both of the statements
        //g.get(v).add(u);
    }

    void printGraph(){
        for(int i = 0 ; i<V ; i++ ){
            System.out.print("Node:" + i);
            for(int j=0 ; j<g.get(i).size(); j++){
                System.out.print( "  -> " + g.get(i).get(j));
            }
            System.out.println();
        }

    }

    void DFS(int start){
        // Stack
        //
        Vector<Boolean> visited = new Vector<Boolean>(V);

        for (int i = 0; i < V; i++){
        visited.add(false);}

        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        //

        while (stack.empty()==false) {
            start = stack.peek();
            stack.pop();

            if (visited.get(start) == false) {
                System.out.print(start + " ");
                visited.set(start, true);
            }


            Iterator<Integer> itr = g.get(start).iterator();

            while (itr.hasNext()) {
                int v = itr.next();

                if (!visited.get(v)) {
                    stack.push(v);
                }

            }
        }



    }

    void DFSUtilRecursion(int start, boolean nodes[]) {

        nodes[start] = true;                         //mark the node as explored
        System.out.print(start+ " ");
        int a = 0;

        for (int i = 0; i < g.get(start).size(); i++)  //iterate through the linked list and then propagate to the next few nodes
        {
            a = g.get(start).get(i);
            if (!nodes[a])                    //only propagate to next nodes which haven't been explored
            {
                DFSUtilRecursion(a, nodes);
            }
        }
    }
    void dfsWithRecursion(int start){
        boolean already[] = new boolean[V];             //initialize a new boolean array to store the details of explored nodes
        DFSUtilRecursion(start, already);
    }


    boolean hasPath(int src, int des , boolean nodes[] ){
        nodes[src] = true;
        if(src == des){
            return true;
        }
        for (int i=0 ; i<g.get(src).size(); i++){

            int a = g.get(src).get(i);
            if(!nodes[a]) {
                if(hasPath(a, des, nodes)==true){
                    return true;
                }

            }
        }

        return false;
    }

}

public class Practice {

    public static void main(String[] args) {
        Graph_practice graph_practice = new Graph_practice(5);
        /*graph_practice.addEdge(0,1);
        graph_practice.addEdge(1,3);
        graph_practice.addEdge(3,2);
        graph_practice.addEdge(2,4);
        graph_practice.addEdge(4,1);
*/
        //-----------Graph 2-----------------\\
        /*graph_practice.addEdge(1, 0);
        graph_practice.addEdge(0, 2);
        graph_practice.addEdge(2, 1);
        graph_practice.addEdge(0, 3);
        graph_practice.addEdge(1, 4);*/

        //-----------Graph 2-----------------\\
        graph_practice.addEdge(0, 1);
        graph_practice.addEdge(1, 2);
        graph_practice.addEdge(1, 3);
        graph_practice.addEdge(3, 4);
        //graph_practice.addEdge(1, 4);

        graph_practice.printGraph();
        graph_practice.DFS(0);
        System.out.println();
        graph_practice.dfsWithRecursion(0);

        System.out.println();
        boolean already[] = new boolean[5];
        System.out.println(graph_practice.hasPath(3,1,already));

    }
}
