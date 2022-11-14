package project.Mappers.Flight;

import project.Entities.*;
import project.Gateway.Flight.FlightGateway;
import project.Gateway.Flight.FlightGatewayImpl;
import project.VO.FlightVO;

import java.util.ArrayList;
import java.util.List;

public class FlightMapperImpl implements FlightMapper{
    private FlightGateway flightGateway;
    public FlightMapperImpl() {
        this.flightGateway = new FlightGatewayImpl();
    }

    private List<Flight> parse(List<FlightVO> flightVOs) {
        List<Flight> res = new ArrayList<>();
        for (FlightVO flightVO: flightVOs) {
            City departureCity = new City();
            City arrivalCity = new City();
            departureCity.setTimezone(flightVO.getDepartureAirportTimeZone());
            arrivalCity.setTimezone(flightVO.getArrivalAirportTimezone());
            ActualAirport departureAirport = new ActualAirport();
            departureAirport.setTime(flightVO.getDepartureAirportScheduled());
            departureAirport.setEstimateTime(flightVO.getDepartureAirportEstimated());
            departureAirport.setActualTime(flightVO.getDepartureAirportActual());
            departureAirport.setIata(flightVO.getDepartureAirportIata());
            departureAirport.setIcao(flightVO.getFlightIcao());
            departureAirport.setAirportName(flightVO.getDepartureAirportName());
            departureAirport.setTerminal(flightVO.getDepartureAirportTerminal());
            departureAirport.setGate(flightVO.getDepartureAirportGate());
            departureAirport.setCity(departureCity);
            ActualAirport arrivalAirport = new ActualAirport();
            arrivalAirport.setTime(flightVO.getArrivalAirportScheduled());
            arrivalAirport.setEstimateTime(flightVO.getArrivalAirportEstimated());
            arrivalAirport.setActualTime(flightVO.getArrivalAirportActual());
            arrivalAirport.setIata(flightVO.getArrivalAirportIata());
            arrivalAirport.setIcao(flightVO.getArrivalAirportIcao());
            arrivalAirport.setAirportName(flightVO.getArrivalAirportName());
            arrivalAirport.setTerminal(flightVO.getArrivalAirportTerminal());
            arrivalAirport.setGate(flightVO.getArrivalAirportGate());
            arrivalAirport.setBaggage(flightVO.getArrivalAirportBaggage());
            arrivalAirport.setCity(arrivalCity);
            Airline airline = new Airline();
            airline.setAirlineName(flightVO.getAirlineName());
            airline.setIataCode(flightVO.getAirlineIata());
            airline.setIcaoCode(flightVO.getAirlineIcao());
            Route route = new Route();
            route.setAirline(airline);
            AircraftType aircraftType = null;
            if (flightVO.getAircraftTypeId() != 0) {
                aircraftType = new AircraftType();
                aircraftType.setAircraftName(flightVO.getAircraftName());
                aircraftType.setIataCode(flightVO.getAircraftIata());
            }
            LiveFlightData liveFlightData = null;
            if (flightVO.getLiveFlightDataId() != 0) {
                liveFlightData = new LiveFlightData();
                liveFlightData.setUpdated(flightVO.getLiveUpdated());
                liveFlightData.setLatitude(flightVO.getLiveLatitude());
                liveFlightData.setLongitude(flightVO.getLiveLongitude());
                liveFlightData.setAltitude(flightVO.getLiveAltitude());
                liveFlightData.setDirection(flightVO.getLiveDirection());
                liveFlightData.setSpeedHorizontal(flightVO.getLiveSpeedHorizontal());
                liveFlightData.setSpeedVertical(flightVO.getLiveSpeedVertical());
                liveFlightData.setGround(flightVO.isLiveIsGrounded());
            }
            Flight flight = new Flight();
            flight.setFlightDate(flightVO.getFlightDate());
            flight.setFlightStatus(flightVO.getFlightStates());
            flight.setNumber(flightVO.getFlightNumber());
            flight.setIata(flightVO.getFlightIata());
            flight.setIcao(flightVO.getFlightIcao());
            flight.setRoute(route);
            flight.setArrivalAirport(arrivalAirport);
            flight.setDepartureAirport(departureAirport);
            flight.setAircraftType(aircraftType);
            flight.setLiveFlightData(liveFlightData);
            res.add(flight);
        }
        return res;
    }

    @Override
    public List<Flight> getAllFlights() {
        return parse(flightGateway.search(null));
    }

    @Override
    public List<Flight> getFlightByStatus(String status) {
        Flight flight = new Flight();
        flight.setFlightStatus(status);
        return parse(flightGateway.search(flight));
    }

    @Override
    public List<Flight> getAirlineByCombination(String status, String airlineName, String airlineIata, String airlineIcao, String flightNumber, String flightIata, String flightIcao) {
        Airline airline = new Airline();
        airline.setAirlineName(airlineName);
        airline.setIataCode(airlineIata);
        airline.setIcaoCode(airlineIcao);
        Route route = new Route();
        route.setAirline(airline);
        Flight flight = new Flight();
        flight.setRoute(route);
        flight.setFlightStatus(status);
        flight.setNumber(flightNumber);
        flight.setIata(flightIata);
        flight.setIcao(flightIcao);
        return parse(flightGateway.search(flight));
    }
}