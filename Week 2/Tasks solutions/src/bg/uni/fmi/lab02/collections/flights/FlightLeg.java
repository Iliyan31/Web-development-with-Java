package bg.uni.fmi.lab02.collections.flights;

import java.time.LocalDateTime;

public record FlightLeg(String fromAirport, String toAirport, LocalDateTime date) {
}
