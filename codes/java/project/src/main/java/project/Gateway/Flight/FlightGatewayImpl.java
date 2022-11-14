package project.Gateway.Flight;

import project.Configuration;
import project.Entities.Airline;
import project.Entities.Flight;
import project.Gateway.SqliteConnector;
import project.VO.FlightVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightGatewayImpl implements FlightGateway{

    private Connection connection;
    private SimpleDateFormat dateFormat;
    private SimpleDateFormat timeFormat;

    public FlightGatewayImpl() {
        this.connection = SqliteConnector.getConnection();
        this.dateFormat = Configuration.getDateFormat();
        this.timeFormat = Configuration.getTimeFormat();
    }
    private String getSelectPartString() {
        return
                "select *\n" +
                "from\n" +
                "flight\n" +
                "left join \n" +
                "(\n" +
                "select\n" +
                "actualAirportId as departAirportId,\n" +
                "airportName as departureAirportName,\n" +
                "timezone as departureAirportTimeZone,\n" +
                "airport.iata as departureAirportIata,\n" +
                "airport.icao as departureAirportIcao,\n" +
                "terminal as departureAirportTerminal,\n" +
                "gate as departureAirportGate,\n" +
                "delay as departureAirportDelay,\n" +
                "scheduledAirport.scheduledTime as departureAirportScheduled,\n" +
                "estimateTime as departureAirportEstimated,\n" +
                "actualTime as departureAirportActual\n" +
                "from actualAirport left join scheduledAirport on actualAirport.scheduledAirportId = scheduledAirport.scheduledAirportId  \n" +
                "left join airport on scheduledAirport.airportId = airport.airportId \n" +
                "left join city on airport.cityId = city.cityId\n" +
                ")\n" +
                "as departAirport\n" +
                "on flight.departAirportId =  departAirport.departAirportId\n" +
                "left join\n" +
                "(\n" +
                "select\n" +
                "actualAirportId as arrivalAirportId,\n" +
                "airportName as arrivalAirportName,\n" +
                "timezone as arrivalAirportTimeZone,\n" +
                "airport.iata as arrivalAirportIata,\n" +
                "airport.icao as arrivalAirportIcao,\n" +
                "terminal as arrivalAirportTerminal,\n" +
                "gate as arrivalAirportGate,\n" +
                "baggage as arrivalAirportBaggage,\n" +
                "delay as arrivalAirportDelay,\n" +
                "scheduledAirport.scheduledTime as arrivalAirportScheduled,\n" +
                "estimateTime as arrivalAirportEstimated,\n" +
                "actualTime as arrivalAirportActual\n" +
                "from actualAirport left join scheduledAirport on actualAirport.scheduledAirportId = scheduledAirport.scheduledAirportId\n" +
                "left join airport on scheduledAirport.airportId = airport.airportId\n" +
                "left join city on airport.cityId = city.cityId\n" +
                ") as arrivalAirport\n" +
                "on flight.arriveAirportId = arrivalAirport.arrivalAirportId\n" +
                "left join\n" +
                "(\n" +
                "select routeId, airlineName, airline.iataCode as airlineIata, airline.icaoCode as airlineIcao from route left join airline on route.airlineId = airline.airlineId\n" +
                ") as routeAirline\n" +
                "on flight.routeId = routeAirline.routeId\n" +
                "left join aircraftType on flight.aircraftTypeId = aircraftType.aircraftTypeId\n" +
                "left join liveFlightData on flight.liveFlightDataId = liveFlightData.liveFlightDataId";
    }

    private String generateSql(Flight f) {
        Map<String, String> options = new HashMap<>();
        if (f != null) {
            if (f.getFlightStatus() != null) {
                options.put("flightStatus", f.getFlightStatus());
            }
            if (f.getNumber() != null) {
                options.put("flightNumber", String.valueOf(f.getNumber()));
            }
            if (f.getIata() != null) {
                options.put("iata", f.getIata());
            }
            if (f.getIcao() != null) {
                options.put("icao", f.getIcao());
            }

            if (f.getRoute() != null && f.getRoute().getAirline() != null) {
                Airline a = f.getRoute().getAirline();
                if (a.getAirlineName() != null) {
                    options.put("airlineName", a.getAirlineName());
                }
                if (a.getIataCode() != null) {
                    options.put("airlineIata", a.getIataCode());
                }
                if (a.getIcaoCode() != null) {
                    options.put("airlineIcao", a.getIcaoCode());
                }
            }
        }

        String selectPart = getSelectPartString();
        if (options.isEmpty()) return selectPart;
        selectPart += " where ";
        for (String option: options.keySet()) {
            selectPart += option + "=\"" + options.get(option) + "\" and ";
        }
        return selectPart.substring(0, selectPart.length() - 4);
    }

    public List<FlightVO> search(Flight f) {
        List<FlightVO> res = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(generateSql(f));
            while (resultSet.next()) {
                FlightVO fvo = new FlightVO();
                fvo.setFlightDate(dateFormat.parse(resultSet.getString("flightDate")));
                fvo.setFlightStates(resultSet.getString("flightStatus"));
                fvo.setDepartureAirportId(resultSet.getInt("departAirportId"));
                fvo.setDepartureAirportName(resultSet.getString("departureAirportName"));
                fvo.setDepartureAirportTimeZone(resultSet.getString("departureAirportTimeZone"));
                fvo.setDepartureAirportIata(resultSet.getString("departureAirportIata"));
                fvo.setDepartureAirportIcao(resultSet.getString("departureAirportIcao"));
                fvo.setDepartureAirportTerminal(resultSet.getString("departureAirportTerminal"));
                fvo.setDepartureAirportGate(resultSet.getString("departureAirportGate"));
                fvo.setDepartureAirportDelay(resultSet.getInt("departureAirportDelay"));
                String departureAirportScheduled = resultSet.getString("departureAirportScheduled");
                if (departureAirportScheduled != null) fvo.setDepartureAirportScheduled(timeFormat.parse(departureAirportScheduled));
                String departureAirportEstimated = resultSet.getString("departureAirportEstimated");
                if (departureAirportEstimated != null) fvo.setDepartureAirportEstimated(timeFormat.parse(departureAirportEstimated));
                String departureAirportActual = resultSet.getString("departureAirportActual");
                if (departureAirportActual != null) fvo.setDepartureAirportActual(timeFormat.parse(departureAirportActual));
                fvo.setArrivalAirportId(resultSet.getInt("arrivalAirportId"));
                fvo.setArrivalAirportName(resultSet.getString("arrivalAirportName"));
                fvo.setArrivalAirportTimezone(resultSet.getString("arrivalAirportTimeZone"));
                fvo.setArrivalAirportIata(resultSet.getString("arrivalAirportIata"));
                fvo.setArrivalAirportIcao(resultSet.getString("arrivalAirportIcao"));
                fvo.setArrivalAirportTerminal(resultSet.getString("arrivalAirportTerminal"));
                fvo.setArrivalAirportGate(resultSet.getString("arrivalAirportGate"));
                fvo.setArrivalAirportBaggage(resultSet.getString("arrivalAirportBaggage"));
                fvo.setArrivalAirportDelay(resultSet.getInt("arrivalAirportDelay"));
                String arrivalAirportScheduled = resultSet.getString("arrivalAirportScheduled");
                String arrivalAirportEstimated = resultSet.getString("arrivalAirportEstimated");
                String arrivalAirportActual = resultSet.getString("arrivalAirportActual");
                if (arrivalAirportScheduled != null) fvo.setArrivalAirportScheduled(timeFormat.parse(arrivalAirportScheduled));
                if (arrivalAirportEstimated != null) fvo.setArrivalAirportEstimated(timeFormat.parse(arrivalAirportEstimated));
                if (arrivalAirportActual != null) fvo.setArrivalAirportActual(timeFormat.parse(arrivalAirportActual));
                fvo.setAirlineName(resultSet.getString("airlineName"));
                fvo.setAirlineIata(resultSet.getString("airlineIata"));
                fvo.setAirlineIcao(resultSet.getString("airlineIcao"));
                fvo.setFlightNumber(resultSet.getString("flightNumber"));
                fvo.setFlightIata(resultSet.getString("iata"));
                fvo.setFlightIcao(resultSet.getString("icao"));
                fvo.setFlightCode(resultSet.getString("codeShared"));
                fvo.setAircraftTypeId(resultSet.getInt("aircraftTypeId"));
                fvo.setAircraftName(resultSet.getString("aircraftName"));
                fvo.setAircraftIata(resultSet.getString("iataCode"));
                fvo.setLiveFlightDataId(resultSet.getInt("liveFlightDataId"));
                if (fvo.getLiveFlightDataId() != 0) {
                    fvo.setLiveUpdated(dateFormat.parse(resultSet.getString("updated")));
                    fvo.setLiveLatitude(resultSet.getFloat("latitude"));
                    fvo.setLiveLongitude(resultSet.getFloat("longitude"));
                    fvo.setLiveAltitude(resultSet.getFloat("altitude"));
                    fvo.setLiveDirection(resultSet.getFloat("direction"));
                    fvo.setLiveSpeedHorizontal(resultSet.getFloat("speedHorizontal"));
                    fvo.setLiveSpeedVertical(resultSet.getFloat("speedVertical"));
                    fvo.setLiveIsGrounded(resultSet.getBoolean("isGround"));
                }
                res.add(fvo);
            }
            stmt.close();
            return res;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
