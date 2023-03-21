package bg.uni.fmi.lab02.collections.flights;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Flights {
    public static List<FlightLeg> getFlightsByAirport(Map<String, List<FlightLeg>> map, String airport) {
        return map.entrySet().stream()
            .flatMap(f -> f.getValue().stream())
            .filter(l -> l.fromAirport().equals(airport))
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Map<String, List<FlightLeg>> map = new HashMap<>();
//        map.put("9H-VCA", new FlightLeg("Sofia", "Beograd", LocalDateTime.now()));
//        map.put("9H-VCB", new FlightLeg("Brussels", "Sofia", LocalDateTime.now()));
//        map.put("9H-VCC", new FlightLeg("New York", "London", LocalDateTime.now()));
//        System.out.println(getFlightsByAirport(map, "Sofia"));
    }
}
