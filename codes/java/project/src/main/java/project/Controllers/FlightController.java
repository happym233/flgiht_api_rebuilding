package project.Controllers;

import project.Entities.*;
import project.Exceptions.JsonException;
import project.Mappers.Flight.FlightMapper;
import project.Mappers.Flight.FlightMapperImpl;

import java.util.List;

public class FlightController implements Controller{
    private FlightMapper flightMapper;

    public FlightController() {
        flightMapper = new FlightMapperImpl();
    }

    private String toJsonStringDeparture(ActualAirport airport, String offset) {
        StringBuilder sb = new StringBuilder();
        sb.append(offset + "\"departure\": {\n");
        sb.append(offset + "\t\"airport\": \"" + airport.getAirportName() + "\",\n");
        sb.append(offset + "\t\"timezone\": \"" + airport.getCity().getTimezone() + "\",\n");
        sb.append(offset + "\t\"iata\": \"" + airport.getIata() + "\",\n");
        sb.append(offset + "\t\"icao\": \"" + airport.getIcao() + "\",\n");
        sb.append(offset + "\t\"terminal\": \"" + airport.getTerminal() + "\",\n");
        sb.append(offset + "\t\"gate\": \"" + airport.getGate() + "\",\n");
        sb.append(offset + "\t\"delay\": " + airport.getDelay() + ",\n");
        sb.append(offset + "\t\"scheduled\": \"" + airport.getScheduledTimeStr() + "\",\n");
        sb.append(offset + "\t\"estimated\": \"" + airport.getEstimateTimeStr() + "\",\n");
        sb.append(offset + "\t\"actual\": \"" + airport.getActualTimeStr() + "\",\n");
        sb.append(offset + "},\n");
        return sb.toString();
    }

    private String toJsonStringArrival(ActualAirport airport, String offset) {
        StringBuilder sb = new StringBuilder();
        sb.append(offset + "\"arrival\": {\n");
        sb.append(offset + "\t\"airport\": \"" + airport.getAirportName() + "\",\n");
        sb.append(offset + "\t\"timezone\": \"" + airport.getCity().getTimezone() + "\",\n");
        sb.append(offset + "\t\"iata\": \"" + airport.getIata() + "\",\n");
        sb.append(offset + "\t\"icao\": \"" + airport.getIcao() + "\",\n");
        sb.append(offset + "\t\"terminal\": \"" + airport.getTerminal() + "\",\n");
        sb.append(offset + "\t\"gate\": \"" + airport.getGate() + "\",\n");
        sb.append(offset + "\t\"baggage\": \"" + airport.getBaggage() + "\",\n");
        sb.append(offset + "\t\"delay\": " + airport.getDelay() + ",\n");
        sb.append(offset + "\t\"scheduled\": \"" + airport.getScheduledTimeStr() + "\",\n");
        sb.append(offset + "\t\"estimated\": \"" + airport.getEstimateTimeStr() + "\",\n");
        sb.append(offset + "\t\"actual\": \"" + airport.getActualTimeStr() + "\",\n");
        sb.append(offset + "},\n");
        return sb.toString();
    }

    private String toJsonStringAirline(Airline airline, String offset) {
        StringBuilder sb = new StringBuilder();
        sb.append(offset + "\"airline\": {\n");
        sb.append(offset + "\t\"name\": \"" + airline.getAirlineName() + "\",\n");
        sb.append(offset + "\t\"iata\": \"" + airline.getIataCode() + "\",\n");
        sb.append(offset + "\t\"icao\": \"" + airline.getIcaoCode() + "\"\n");
        sb.append(offset + "},\n");
        return sb.toString();
    }

    private String toJsonStringFlight(Flight flight, String offset) {
        StringBuilder sb = new StringBuilder();
        sb.append(offset + "\"flight\": {\n");
        sb.append(offset + "\t\"number\": \"" + flight.getNumber() + "\",\n");
        sb.append(offset + "\t\"iata\": \"" + flight.getIata() + "\",\n");
        sb.append(offset + "\t\"icao\": \"" + flight.getIcao() + "\",\n");
        sb.append(offset + "},\n");
        return sb.toString();
    }

    private String toJsonStringAircraft(AircraftType aircraftType, String offset) {
        if (aircraftType == null) return offset + "\"aircraft\": null,\n";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(offset + "\"aircraft\": {\n");
            sb.append(offset + "\t\"registration\": \"" + aircraftType.getAircraftName() + "\",\n");
            sb.append(offset + "\t\"iata\": \"" + aircraftType.getIataCode() + "\"\n");
            sb.append(offset + "},\n");
            return sb.toString();
        }
    }

    private String toJsonStringLiveData(LiveFlightData liveFlightData, String offset) {
        if (liveFlightData == null) return offset + "\"live\": null\n";
        else {
            StringBuilder sb = new StringBuilder();
            sb.append(offset + "\"live\": {\n");
            sb.append(offset + "\t\"updated\": \"" + liveFlightData.getUpdatedStr() + "\",\n");
            sb.append(offset + "\t\"latitude\": " + liveFlightData.getLatitude() + ",\n");
            sb.append(offset + "\t\"longitude\": " + liveFlightData.getLongitude() + ",\n");
            sb.append(offset + "\t\"altitude\": " + liveFlightData.getAltitude() + ",\n");
            sb.append(offset + "\t\"direction\": " + liveFlightData.getDirection() + ",\n");
            sb.append(offset + "\t\"speed_horizontal\": " + liveFlightData.getSpeedHorizontal() + ",\n");
            sb.append(offset + "\t\"speed_vertical\": " + liveFlightData.getSpeedVertical() + ",\n");
            sb.append(offset + "\t\"is_ground\": " + liveFlightData.getGround() + "\n");
            sb.append(offset + "}\n");
            return sb.toString();
        }
    }

    private String toJsonString(List<Flight> fList) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("\t\"data\": [\n");
        for (int i = 0; i < fList.size(); i++) {
            Flight f = fList.get(i);
            sb.append("\t\t{\n");
            sb.append("\t\t\t\"flight_date\": \"" + f.getFlightDateStr() + "\",\n");
            sb.append("\t\t\t\"flight_status\": \"" + f.getFlightStatus() + "\",\n");
            sb.append(toJsonStringDeparture(f.getDepartureAirport(), "\t\t\t"));
            sb.append(toJsonStringArrival(f.getArrivalAirport(), "\t\t\t"));
            sb.append(toJsonStringAirline(f.getRoute().getAirline(), "\t\t\t"));
            sb.append(toJsonStringFlight(f, "\t\t\t"));
            sb.append(toJsonStringAircraft(f.getAircraftType(), "\t\t\t"));
            sb.append(toJsonStringLiveData(f.getLiveFlightData(), "\t\t\t"));
            sb.append("\t\t}");
            if (i != fList.size() - 1) {
                sb.append(",\n");
            }
            else sb.append("\n");
        }
        sb.append("\t]\n");
        sb.append("}\n");
        return sb.toString();
    }


    @Override
    public String handleParameter(String parameter) {
        if (parameter == null || parameter.length() == 0) {
            return toJsonString(flightMapper.getAllFlights());
        } else {
            String[] parameters = parameter.split("&");
            String flightStatus = null, airlineName = null, airlineIata = null, airlineIcao = null,
                    flightNumber = null, flightIata = null, flightIcao = null;
            for (String para: parameters) {
                String[] argu = para.split("=");
                if (argu[0].equalsIgnoreCase("flight_status")) {
                    flightStatus = argu[1];
                } else if (argu[0].equalsIgnoreCase("airline_name")) {
                    airlineName = argu[1];
                } else if (argu[0].equalsIgnoreCase("airline_iata")) {
                    airlineIata = argu[1];
                } else if (argu[0].equalsIgnoreCase("airline_icao")) {
                    airlineIcao = argu[1];
                } else if (argu[0].equalsIgnoreCase("flight_number")) {
                    flightNumber = argu[1];
                } else if (argu[0].equalsIgnoreCase("flight_iata")) {
                    flightIata = argu[1];
                } else if (argu[0].equalsIgnoreCase("flight_icao")) {
                    flightIcao = argu[1];
                } else {
                    return JsonException.getJsonParameterExceptionMessage();
                }
            }
            return toJsonString(flightMapper.getAirlineByCombination(flightStatus, airlineName, airlineIata,
                    airlineIcao, flightNumber, flightIata, flightIcao));
        }
    }
}
