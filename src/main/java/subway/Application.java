package subway;

import java.util.List;
import java.util.Scanner;
import subway.domain.Station;
import subway.service.ShortestDistanceRouteFinder;
import subway.service.ShortestTimeRouteFinder;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("## 메인 화면");
            System.out.println("1. 경로 조회");
            System.out.println("Q. 종료\n");
            System.out.println("## 원하는 기능을 선택하세요.");
            String firstInput = scanner.next();
            if (firstInput.equals("Q")) {
                break;
            }
            if (Integer.parseInt(firstInput) == 1) {
                System.out.println("\n## 경로 기준");
                System.out.println("1. 최단 거리");
                System.out.println("2. 최소 시간");
                System.out.println("B. 돌아가기\n");
                System.out.println("## 원하는 기능을 선택하세요.");

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
