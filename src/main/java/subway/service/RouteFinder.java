package subway.service;

import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.WeightedMultigraph;
import subway.SubwayUtilities;
import subway.domain.Station;
import subway.domain.SubwayConfig;

public abstract class RouteFinder {

    public WeightedMultigraph<String, DefaultWeightedEdge> graph = new WeightedMultigraph(DefaultWeightedEdge.class);
    private final SubwayConfig config = new SubwayConfig(new SubwayUtilities());

    public RouteFinder() {
        config.initialize();
        addStation();
    }

    private void addStation() {
        for (Station station : config.findAll()) {
            graph.addVertex(station.getName());
        }
    }
}
