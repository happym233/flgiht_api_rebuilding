package project.Mappers.Flight;

import project.Entities.Flight;

import java.util.List;

public interface FlightMapper {
    public List<Flight> getAllFlights();

    public List<Flight> getFlightByStatus(String status);

    public List<Flight> getAirlineByCombination(String status, String airlineName, String airlineIata,
                                                String airlineIcao, String flightNumber,
                                                String flightIata, String flightIcao);
}