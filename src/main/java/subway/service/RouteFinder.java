package subway.service;

import java.util.List;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;
import subway.SubwayUtilities;
import subway.domain.Station;
import subway.domain.SubwayConfig;

public abstract class RouteFinder {

    public WeightedMultigraph<String, DefaultWeightedEdge> graph = new WeightedMultigraph(DefaultWeightedEdge.class);
    private final SubwayConfig config = new SubwayConfig(new SubwayUtilities());
    private final DijkstraShortestPath dijkstraShortestPath = new DijkstraShortestPath(graph);

    public RouteFinder() {
        config.initialize();
        addStation();
    }

    public List<Station> findRoute(String startStation, String endStation) {
        return dijkstraShortestPath.getPath(startStation, endStation).getVertexList();
    }

    private void addStation() {
        for (Station station : config.findAll()) {
            graph.addVertex(station.getName());
        }
    }
}
