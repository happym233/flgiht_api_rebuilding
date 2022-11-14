package project.Controllers;

import project.Entities.Airline;
import project.Exceptions.JsonException;
import project.Mappers.Airline.AirlineMapper;
import project.Mappers.Airline.AirlineMapperImpl;

import java.util.List;

public class AirlineController implements Controller{

    private AirlineMapper airlineMapper;

    public AirlineController() {
        airlineMapper = new AirlineMapperImpl();
    }

    private String toJsonString(List<Airline> aList) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("\t\"data\": [\n");
        for (int i = 0; i < aList.size(); i++) {
            Airline a = aList.get(i);
            sb.append("\t\t{\n");
            sb.append("\t\t\t\"airline_name\": \"" + a.getAirlineName() + "\",\n");
            sb.append("\t\t\t\"iata_code\": \"" + a.getIataCode() + "\",\n");
            sb.append("\t\t\t\"iata_prefix_accounting\": \"" + a.getIataPrefixAccounting() + "\",\n");
            sb.append("\t\t\t\"icao_code\": \"" + a.getIcaoCode() + "\",\n");
            sb.append("\t\t\t\"callsign\": \"" + a.getCallsign() + "\",\n");
            sb.append("\t\t\t\"type\": \"" + a.getType() + "\",\n");
            sb.append("\t\t\t\"status\": \"" + a.getStatus() + "\",\n");
            sb.append("\t\t\t\"fleet_size\": \"" + a.getFleetSize() + "\",\n");
            sb.append("\t\t\t\"fleet_average_age\": \"" + a.getFleetAverageAge() + "\",\n");
            sb.append("\t\t\t\"date_founded\": \"" + a.getDateFounded() + "\",\n");
            sb.append("\t\t\t\"hub_code\": \"" + a.getHubCode() + "\",\n");
            sb.append("\t\t\t\"country_name\": \"" + a.getCountry().getCountryName() + "\",\n");
            sb.append("\t\t\t\"country_iso2\": \"" + a.getCountry().getCountryIso2() + "\"\n");
            sb.append("\t\t}");
            if (i != aList.size() - 1) {
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
            return toJsonString(airlineMapper.getAllAirlines());
        } else {
            String[] parameters = parameter.split("&");
            String airlineName = null, iata = null, icao = null;
            for (String para: parameters) {
                String[] argu = para.split("=");
                if (argu[0].equalsIgnoreCase("airline_name")) {
                    airlineName = argu[1];
                } else if (argu[0].equalsIgnoreCase("iata")) {
                    iata = argu[1];
                } else if (argu[0].equalsIgnoreCase("icao")) {
                    icao = argu[1];
                } else {
                    return JsonException.getJsonParameterExceptionMessage();
                }
            }
            return toJsonString(airlineMapper.getAirlineByCombination(airlineName, iata, icao));
        }
    }
}
