package project.Mappers.Airline;

import project.Entities.Airline;

import java.util.List;

public interface AirlineMapper {
    public List<Airline> getAllAirlines();

    public List<Airline> getAirlineByName(String name);

    public List<Airline> getAirlineByIataCode(String iata);

    public List<Airline> getAirlineByIcaoCOdes(String icao);

    public List<Airline> getAirlineByMultipleData(String name, String iata, String icao);
}
