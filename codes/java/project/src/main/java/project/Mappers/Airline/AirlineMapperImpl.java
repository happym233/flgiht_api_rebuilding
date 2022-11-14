package project.Mappers.Airline;

import project.Entities.Airline;
import project.Entities.Country;
import project.Gateway.Airline.AirlineGateway;
import project.Gateway.Airline.AirlineGatewayImpl;
import project.VO.AirlineVO;

import java.util.ArrayList;
import java.util.List;

public class AirlineMapperImpl implements AirlineMapper{
    private AirlineGateway airlineGateway;

    public AirlineMapperImpl() {
        this.airlineGateway = new AirlineGatewayImpl();
    }

    private List<Airline> parse(List<AirlineVO> airlineVOs) {
        List<Airline> res = new ArrayList<>();
        for (AirlineVO airlineVO: airlineVOs) {
            Country country = new Country();
            country.setCountryName(airlineVO.getCountryName());
            country.setCountryIso2(airlineVO.getCountryIso2());
            Airline airline = new Airline();
            airline.setCountry(country);
            airline.setAirlineName(airlineVO.getArlineName());
            airline.setIataCode(airlineVO.getIataCode());
            airline.setIataPrefixAccounting(airlineVO.getIataPrefixAccounting());
            airline.setIcaoCode(airlineVO.getIcaoCode());
            airline.setCallsign(airlineVO.getCallSign());
            airline.setType(airlineVO.getType());
            airline.setStatus(airlineVO.getStatus());
            airline.setFleetSize(airlineVO.getFleetSize());
            airline.setFleetAverageAge(airlineVO.getFleetAverageAge());
            airline.setDateFounded(airlineVO.getDateFounded());
            airline.setHubCode(airlineVO.getHubCode());
            res.add(airline);
        }
        return res;
    }

    @Override
    public List<Airline> getAllAirlines() {
        return parse(airlineGateway.search(null));
    }

    @Override
    public List<Airline> getAirlineByName(String name) {
        Airline airline = new Airline();
        airline.setAirlineName(name);
        return parse(airlineGateway.search(airline));
    }

    @Override
    public List<Airline> getAirlineByIataCode(String iata) {
        Airline airline = new Airline();
        airline.setIataCode(iata);
        return parse(airlineGateway.search(airline));
    }

    @Override
    public List<Airline> getAirlineByIcaoCOdes(String icao) {
        Airline airline = new Airline();
        airline.setIcaoCode(icao);
        return parse(airlineGateway.search(airline));
    }

    @Override
    public List<Airline> getAirlineByMultipleData(String name, String iata, String icao) {
        Airline airline = new Airline();
        airline.setAirlineName(name);
        airline.setIataCode(iata);
        airline.setIcaoCode(icao);
        return parse(airlineGateway.search(airline));
    }
}
