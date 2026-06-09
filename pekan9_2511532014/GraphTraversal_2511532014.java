package pekan9_2511532014;

import java.util.*;

public class GraphTraversal_2511532014 {
	private Map<String, List<String>> graph_2014 = new HashMap<>();

	// Menambahkan edge (graf tak berarah)
	public void addEdge_2014(String node1_2014, String node2_2014) {
		graph_2014.putIfAbsent(node1_2014, new ArrayList<>());
		graph_2014.putIfAbsent(node2_2014, new ArrayList<>());
		graph_2014.get(node1_2014).add(node2_2014);
		graph_2014.get(node2_2014).add(node1_2014);
	}

	// Menampilkan graf awal
	public void printGraph_2014() {
		System.out.println("Graf Awal (Adjacency List): ");
		for (String node_2014 : graph_2014.keySet()) {
			System.out.print(node_2014 + " -> ");
			List<String> neighbors_2014 = graph_2014.get(node_2014);
			System.out.println(String.join(", ", neighbors_2014));
		}
		System.out.println();
	}

    // DFS rekursif
    public void dfs_2014(String start_2014) {
        Set<String> visited_2014 = new HashSet<>();
        System.out.println("Penelusuran DFS: ");
        dfsHelper_2014(start_2014, visited_2014);
        System.out.println();
    }

    private void dfsHelper_2014(String current_2014, Set<String> visited_2014) {
        if (visited_2014.contains(current_2014)) return;
        visited_2014.add(current_2014);
        System.out.print(current_2014 + " ");
        for (String neighbor_2014 : graph_2014.getOrDefault(current_2014, new ArrayList<>())) {
            dfsHelper_2014(neighbor_2014, visited_2014);
        }
    }
    
    // BFS iteratif
    public void bfs_2014(String start_2014) {
        Set<String> visited_2014 = new HashSet<>();
        Queue<String> queue_2014 = new LinkedList<>();
        queue_2014.add(start_2014);
        visited_2014.add(start_2014);
        System.out.println("Penelusuran BFS:");
        while (!queue_2014.isEmpty()) {
            String current_2014 = queue_2014.poll();
            System.out.print(current_2014 + " ");
            for (String neighbor_2014 : graph_2014.getOrDefault(current_2014, new ArrayList<>())) {
                if (!visited_2014.contains(neighbor_2014)) {
                    queue_2014.add(neighbor_2014);
                    visited_2014.add(neighbor_2014);
                }
            }
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        GraphTraversal_2511532014 graph_2014 = new GraphTraversal_2511532014();

        // Contoh graf: A-B, A-C, B-D, B-E
        graph_2014.addEdge_2014("A", "B");
        graph_2014.addEdge_2014("A", "C");
        graph_2014.addEdge_2014("B", "D");
        graph_2014.addEdge_2014("B", "E");

        // Cetak graf awal
        System.out.println("Graf Awal adalah: ");
        graph_2014.printGraph_2014();

        // Lakukan penelusuran
        graph_2014.dfs_2014("A");
        graph_2014.bfs_2014("A");
    }
}
