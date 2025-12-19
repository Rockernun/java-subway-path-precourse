package subway;

import java.util.List;
import subway.domain.Line;
import subway.domain.LineRepository;
import subway.domain.Station;
import subway.domain.StationRepository;

public class SubwayUtilities {
    public void createStation(String stationName) {
        StationRepository.addStation(new Station(stationName));
    }

    public List<Station> findAll() {
        return StationRepository.stations();
    }

    public Station findStation(String name) {
        return StationRepository.findStationByName(name);
    }

    public boolean removeStation(String stationName) {
        return StationRepository.deleteStation(stationName);
    }

    public void deleteAllStations() {
        StationRepository.deleteAll();
    }

    public void createLine(String lineName) {
        LineRepository.addLine(new Line(lineName));
    }

    public List<Line> findAllLines() {
        return LineRepository.lines();
    }

    public boolean removeLine(String lineName) {
        return LineRepository.deleteLineByName(lineName);
    }

    public void deleteAllLines() {
        LineRepository.deleteAll();
    }
}
