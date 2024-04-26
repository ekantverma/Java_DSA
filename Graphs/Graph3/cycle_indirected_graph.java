package Graphs.Graph3;

import java.util.*;

public class cycle_indirected_graph {

    static void addEdge(ArrayList<Integer> graph[], int u, int v) {
        graph[u].add(v);
        graph[v].add(u);
    }

    public static boolean isCycle(ArrayList<Integer> graph[], int s, int V, boolean visited[]) {
        int par[] = new int[V];
        Arrays.fill(par, -1);

        Queue<Integer> q = new ArrayDeque<Integer>();

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int i = 0; i < graph[u].size(); i++) {
                int v = graph[u].get(i);
                if (!visited[v]) {
                    visited[v] = true;
                    q.add(v);
                    par[v] = u;
                } else if (par[u] != v) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCyclicDisconntected(ArrayList<Integer> adj[], int V) {
        boolean visited[] = new boolean[V];
        Arrays.fill(visited, false);
        for (int i = 0; i < V; i++) {
            if (!visited[i] && isCycle(adj, i, V, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Integer> graph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 0);
        addEdge(graph, 2, 3);

        if (isCyclicDisconntected(graph, V)) {
            System.out.println("Yes");
        } else {
            System.out.println("Nop");
        }
    }
}
