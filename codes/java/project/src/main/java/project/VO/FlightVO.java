package project.VO;

import java.sql.Date;
import java.sql.Time;

public class FlightVO {
    private Date flightDate;
    private String flightStates;
    private String departureAirportName;
    private String departureAirportTimeZone;
    private String departureAirportIata;
    private String departureAirportIcao;
    private String departureAirportTerminal;
    private String departureAirportGate;
    private int departureAirportDelay;
    private Time departureAirportScheduled;
    private Time departureAirportEstimated;
    private Time departureAirportActual;
    private String arrivalAirportName;
    private String arrivalAirportTimezone;
    private String arrivalAirportIata;
    private String arrivalAirportIcao;
    private String arrivalAirportTerminal;
    private String arrivalAirportGate;
    private String arrivalAirportBaggage;
    private String arrivalAirportDelay;
    private String arrivalAirportScheduled;
    private String arrivalAirportEstimated;
    private String arrivalAirportActual;
    private String airlineName;
    private String airlineIata;
    private String airlineIcao;
    private String flightNumber;
    private String flightIata;
    private String flightIcao;
    private String flightCode;
    private String aircraftName;
    private String aircraftIata;
    private String liveUpdated;
    private double liveLatitude;
    private double liveLongitude;
    private double liveAltitude;
    private double liveDirection;
    private double liveSpeedHorizontal;
    private double liveSpeedVertical;
    private boolean liveIsGrounded;

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightStates() {
        return flightStates;
    }

    public void setFlightStates(String flightStates) {
        this.flightStates = flightStates;
    }

    public String getDepartureAirportName() {
        return departureAirportName;
    }

    public void setDepartureAirportName(String departureAirportName) {
        this.departureAirportName = departureAirportName;
    }

    public String getDepartureAirportTimeZone() {
        return departureAirportTimeZone;
    }

    public void setDepartureAirportTimeZone(String departureAirportTimeZone) {
        this.departureAirportTimeZone = departureAirportTimeZone;
    }

    public String getDepartureAirportIata() {
        return departureAirportIata;
    }

    public void setDepartureAirportIata(String departureAirportIata) {
        this.departureAirportIata = departureAirportIata;
    }

    public String getDepartureAirportIcao() {
        return departureAirportIcao;
    }

    public void setDepartureAirportIcao(String departureAirportIcao) {
        this.departureAirportIcao = departureAirportIcao;
    }

    public String getDepartureAirportTerminal() {
        return departureAirportTerminal;
    }

    public void setDepartureAirportTerminal(String departureAirportTerminal) {
        this.departureAirportTerminal = departureAirportTerminal;
    }

    public String getDepartureAirportGate() {
        return departureAirportGate;
    }

    public void setDepartureAirportGate(String departureAirportGate) {
        this.departureAirportGate = departureAirportGate;
    }

    public int getDepartureAirportDelay() {
        return departureAirportDelay;
    }

    public void setDepartureAirportDelay(int departureAirportDelay) {
        this.departureAirportDelay = departureAirportDelay;
    }

    public Time getDepartureAirportScheduled() {
        return departureAirportScheduled;
    }

    public void setDepartureAirportScheduled(Time departureAirportScheduled) {
        this.departureAirportScheduled = departureAirportScheduled;
    }

    public Time getDepartureAirportEstimated() {
        return departureAirportEstimated;
    }

    public void setDepartureAirportEstimated(Time departureAirportEstimated) {
        this.departureAirportEstimated = departureAirportEstimated;
    }

    public Time getDepartureAirportActual() {
        return departureAirportActual;
    }

    public void setDepartureAirportActual(Time departureAirportActual) {
        this.departureAirportActual = departureAirportActual;
    }

    public String getArrivalAirportName() {
        return arrivalAirportName;
    }

    public void setArrivalAirportName(String arrivalAirportName) {
        this.arrivalAirportName = arrivalAirportName;
    }

    public String getArrivalAirportTimezone() {
        return arrivalAirportTimezone;
    }

    public void setArrivalAirportTimezone(String arrivalAirportTimezone) {
        this.arrivalAirportTimezone = arrivalAirportTimezone;
    }

    public String getArrivalAirportIata() {
        return arrivalAirportIata;
    }

    public void setArrivalAirportIata(String arrivalAirportIata) {
        this.arrivalAirportIata = arrivalAirportIata;
    }

    public String getArrivalAirportIcao() {
        return arrivalAirportIcao;
    }

    public void setArrivalAirportIcao(String arrivalAirportIcao) {
        this.arrivalAirportIcao = arrivalAirportIcao;
    }

    public String getArrivalAirportTerminal() {
        return arrivalAirportTerminal;
    }

    public void setArrivalAirportTerminal(String arrivalAirportTerminal) {
        this.arrivalAirportTerminal = arrivalAirportTerminal;
    }

    public String getArrivalAirportGate() {
        return arrivalAirportGate;
    }

    public void setArrivalAirportGate(String arrivalAirportGate) {
        this.arrivalAirportGate = arrivalAirportGate;
    }

    public String getArrivalAirportBaggage() {
        return arrivalAirportBaggage;
    }

    public void setArrivalAirportBaggage(String arrivalAirportBaggage) {
        this.arrivalAirportBaggage = arrivalAirportBaggage;
    }

    public String getArrivalAirportDelay() {
        return arrivalAirportDelay;
    }

    public void setArrivalAirportDelay(String arrivalAirportDelay) {
        this.arrivalAirportDelay = arrivalAirportDelay;
    }

    public String getArrivalAirportScheduled() {
        return arrivalAirportScheduled;
    }

    public void setArrivalAirportScheduled(String arrivalAirportScheduled) {
        this.arrivalAirportScheduled = arrivalAirportScheduled;
    }

    public String getArrivalAirportEstimated() {
        return arrivalAirportEstimated;
    }

    public void setArrivalAirportEstimated(String arrivalAirportEstimated) {
        this.arrivalAirportEstimated = arrivalAirportEstimated;
    }

    public String getArrivalAirportActual() {
        return arrivalAirportActual;
    }

    public void setArrivalAirportActual(String arrivalAirportActual) {
        this.arrivalAirportActual = arrivalAirportActual;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getAirlineIata() {
        return airlineIata;
    }

    public void setAirlineIata(String airlineIata) {
        this.airlineIata = airlineIata;
    }

    public String getAirlineIcao() {
        return airlineIcao;
    }

    public void setAirlineIcao(String airlineIcao) {
        this.airlineIcao = airlineIcao;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightIata() {
        return flightIata;
    }

    public void setFlightIata(String flightIata) {
        this.flightIata = flightIata;
    }

    public String getFlightIcao() {
        return flightIcao;
    }

    public void setFlightIcao(String flightIcao) {
        this.flightIcao = flightIcao;
    }

    public String getFlightCode() {
        return flightCode;
    }

    public void setFlightCode(String flightCode) {
        this.flightCode = flightCode;
    }

    public String getAircraftName() {
        return aircraftName;
    }

    public void setAircraftName(String aircraftName) {
        this.aircraftName = aircraftName;
    }

    public String getAircraftIata() {
        return aircraftIata;
    }

    public void setAircraftIata(String aircraftIata) {
        this.aircraftIata = aircraftIata;
    }

    public String getLiveUpdated() {
        return liveUpdated;
    }

    public void setLiveUpdated(String liveUpdated) {
        this.liveUpdated = liveUpdated;
    }

    public double getLiveLatitude() {
        return liveLatitude;
    }

    public void setLiveLatitude(double liveLatitude) {
        this.liveLatitude = liveLatitude;
    }

    public double getLiveLongitude() {
        return liveLongitude;
    }

    public void setLiveLongitude(double liveLongitude) {
        this.liveLongitude = liveLongitude;
    }

    public double getLiveAltitude() {
        return liveAltitude;
    }

    public void setLiveAltitude(double liveAltitude) {
        this.liveAltitude = liveAltitude;
    }

    public double getLiveDirection() {
        return liveDirection;
    }

    public void setLiveDirection(double liveDirection) {
        this.liveDirection = liveDirection;
    }

    public double getLiveSpeedHorizontal() {
        return liveSpeedHorizontal;
    }

    public void setLiveSpeedHorizontal(double liveSpeedHorizontal) {
        this.liveSpeedHorizontal = liveSpeedHorizontal;
    }

    public double getLiveSpeedVertical() {
        return liveSpeedVertical;
    }

    public void setLiveSpeedVertical(double liveSpeedVertical) {
        this.liveSpeedVertical = liveSpeedVertical;
    }

    public boolean isLiveIsGrounded() {
        return liveIsGrounded;
    }

    public void setLiveIsGrounded(boolean liveIsGrounded) {
        this.liveIsGrounded = liveIsGrounded;
    }
}
