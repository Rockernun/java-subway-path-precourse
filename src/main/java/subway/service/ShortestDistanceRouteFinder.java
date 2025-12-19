package subway.service;

public class ShortestDistanceRouteFinder extends RouteFinder {

    public ShortestDistanceRouteFinder() {
        graph.setEdgeWeight(graph.addEdge("교대역", "강남역"), 2);
        graph.setEdgeWeight(graph.addEdge("교대역", "남부터미널역"), 6);
        graph.setEdgeWeight(graph.addEdge("강남역", "역삼역"), 2);
        graph.setEdgeWeight(graph.addEdge("강남역", "양재역"), 2);
        graph.setEdgeWeight(graph.addEdge("남부터미널역", "양재역"), 6);
        graph.setEdgeWeight(graph.addEdge("양재역", "양재시민의숲역"), 10);
        graph.setEdgeWeight(graph.addEdge("양재역", "매봉역"), 1);
    }
}
