package subway.service;

public class ShortestTimeRouteFinder extends RouteFinder {

    public ShortestTimeRouteFinder() {
        graph.setEdgeWeight(graph.addEdge("교대역", "강남역"), 3);
        graph.setEdgeWeight(graph.addEdge("교대역", "남부터미널역"), 2);
        graph.setEdgeWeight(graph.addEdge("강남역", "역삼역"), 3);
        graph.setEdgeWeight(graph.addEdge("강남역", "양재역"), 8);
        graph.setEdgeWeight(graph.addEdge("남부터미널역", "양재역"), 5);
        graph.setEdgeWeight(graph.addEdge("양재역", "양재시민의숲역"), 3);
        graph.setEdgeWeight(graph.addEdge("양재역", "매봉역"), 1);
    }
}
