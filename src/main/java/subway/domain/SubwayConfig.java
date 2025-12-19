package subway.domain;

import java.util.List;
import subway.SubwayUtilities;

public class SubwayConfig {

    private final SubwayUtilities subwayUtilities;

    public SubwayConfig(SubwayUtilities subwayUtilities) {
        this.subwayUtilities = subwayUtilities;
    }

    public void initialize() {
        initializeStations();
        initializeLines();
    }

    public List<Station> findAll() {
        return subwayUtilities.findAll();
    }

    private void initializeStations() {
        subwayUtilities.deleteAllStations();
        subwayUtilities.createStation("교대역");
        subwayUtilities.createStation("강남역");
        subwayUtilities.createStation("역삼역");
        subwayUtilities.createStation("남부터미널역");
        subwayUtilities.createStation("양재역");
        subwayUtilities.createStation("양재시민의숲역");
        subwayUtilities.createStation("매봉역");
    }

    private void initializeLines() {
        subwayUtilities.deleteAllLines();
        subwayUtilities.createLine("2호선");
        subwayUtilities.createLine("3호선");
        subwayUtilities.createLine("신분당선");
    }
}
