package jgraphtTest;

import org.jgrapht.Graph;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;
import org.jgrapht.GraphPath;

public class TestDijkstraShortestPath {
    public static GraphPath<Integer, DefaultWeightedEdge> testDijkstra(Graph<Integer, DefaultWeightedEdge> graph, int source, int target) {
        DijkstraShortestPath<Integer, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(graph);
        return dijkstra.getPath(source, target);
    }

    public static void main(String[] args) {
        Graph<Integer, DefaultWeightedEdge> graph = new SimpleDirectedWeightedGraph<>(DefaultWeightedEdge.class);

        int n = 6;

        // 添加节点
        for (int i = 0; i < n; i++) {
            graph.addVertex(i);
        }

        // 边信息：[源节点, 目标节点, 权重]
        int[][] edges = {
                // 正常路径
                { 0, 1, 10 },
                { 0, 2, 5 },
                { 1, 3, 1 },
                { 2, 1, 3 },
                { 2, 3, 9 },
                { 3, 4, 4 },
                { 4, 5, 2 },
        };

        // 添加边
        for (int[] edge : edges) {
            int source = edge[0];
            int target = edge[1];
            int weight = edge[2];
            DefaultWeightedEdge e = graph.addEdge(source, target);
            graph.setEdgeWeight(e, weight);
        }

        // 执行算法
        DijkstraShortestPath<Integer, DefaultWeightedEdge> dijkstra = new DijkstraShortestPath<>(graph);
        GraphPath<Integer, DefaultWeightedEdge> path = dijkstra.getPath(0, n - 1);
        System.out.println("----------------Shortest path from 0 to " + (n - 1) + ":");
        path.getVertexList().forEach(v -> System.out.print(v + " "));
        System.out.println("\nTotal weight: " + path.getWeight());
        System.out.println("Number of edges: " + path.getEdgeList().size());
        System.out.println("Edges in the path:");
        path.getEdgeList().forEach(e -> {
            System.out.println(e + " (weight: " + graph.getEdgeWeight(e) + ")");
        });
        System.out.println("Graph: " + graph);
        System.out.println("--------------------------------------------------------------");
    }
}
