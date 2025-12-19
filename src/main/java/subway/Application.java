package subway;

import java.util.List;
import java.util.Scanner;
import subway.domain.Station;
import subway.service.ShortestDistanceRouteFinder;
import subway.service.ShortestTimeRouteFinder;
import subway.view.OutPutView;

public class Application {
    public static void main(String[] args) {

        OutPutView output = new OutPutView();
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            output.printMainDisplay();
            String firstInput = scanner.next();
            if (firstInput.equals("Q")) {
                break;
            }
            if (Integer.parseInt(firstInput) == 1) {
                output.printSelectRouteAlgorithm();

                int secondInput = scanner.nextInt();
                System.out.println("\n## 출발역을 입력하세요.");
                String startStation = scanner.next();
                System.out.println("\n## 도착역을 입력하세요.");
                String endStation = scanner.next();

                // 최단 거리
                if (secondInput == 1) {
                    ShortestDistanceRouteFinder routeFinder = new ShortestDistanceRouteFinder();
                    List<Station> route = routeFinder.findRoute(startStation, endStation);
                    System.out.println(route);
                }

                // 최소 시간
                if (secondInput == 2) {
                    ShortestTimeRouteFinder routeFinder = new ShortestTimeRouteFinder();
                    List<Station> route = routeFinder.findRoute(startStation, endStation);
                    System.out.println(route);
                }
            }
        }
    }
}
