package project.Entities;

import project.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Flight {

    private SimpleDateFormat dateFormat = Configuration.getDateFormat();
    private Date flightDate;
    private String flightStatus;
    private String number;
    private String iata;
    private String icao;
    private String codeShared;
    private Route route;
    private ActualAirport departureAirport;
    private ActualAirport arrivalAirport;
    private AircraftType aircraftType;
    private LiveFlightData liveFlightData;

    public String getFlightDateStr() {
        return dateFormat.format(flightDate);
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIata() {
        return iata;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public String getIcao() {
        return icao;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public String getCodeShared() {
        return codeShared;
    }

    public void setCodeShared(String codeShared) {
        this.codeShared = codeShared;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public ActualAirport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(ActualAirport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public ActualAirport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(ActualAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public AircraftType getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(AircraftType aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LiveFlightData getLiveFlightData() {
        return liveFlightData;
    }

    public void setLiveFlightData(LiveFlightData liveFlightData) {
        this.liveFlightData = liveFlightData;
    }
}