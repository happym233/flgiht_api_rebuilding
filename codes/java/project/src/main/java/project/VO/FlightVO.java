package project.VO;

import java.util.Date;

public class FlightVO {
    private Date flightDate;
    private String flightStates;
    private int departureAirportId;
    private String departureAirportName;
    private String departureAirportTimeZone;
    private String departureAirportIata;
    private String departureAirportIcao;
    private String departureAirportTerminal;
    private String departureAirportGate;
    private int departureAirportDelay;
    private Date departureAirportScheduled;
    private Date departureAirportEstimated;
    private Date departureAirportActual;
    private int arrivalAirportId;
    private String arrivalAirportName;
    private String arrivalAirportTimezone;
    private String arrivalAirportIata;
    private String arrivalAirportIcao;
    private String arrivalAirportTerminal;
    private String arrivalAirportGate;
    private String arrivalAirportBaggage;
    private int arrivalAirportDelay;
    private Date arrivalAirportScheduled;
    private Date arrivalAirportEstimated;
    private Date arrivalAirportActual;
    private String airlineName;
    private String airlineIata;
    private String airlineIcao;
    private String flightNumber;
    private String flightIata;
    private String flightIcao;
    private String flightCode;
    private int aircraftTypeId;
    private String aircraftName;
    private String aircraftIata;
    private int liveFlightDataId;
    private Date liveUpdated;
    private float liveLatitude;
    private float liveLongitude;
    private float liveAltitude;
    private float liveDirection;
    private float liveSpeedHorizontal;
    private float liveSpeedVertical;
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

    public int getDepartureAirportId() {
        return departureAirportId;
    }

    public void setDepartureAirportId(int departureAirportId) {
        this.departureAirportId = departureAirportId;
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

    public Date getDepartureAirportScheduled() {
        return departureAirportScheduled;
    }

    public void setDepartureAirportScheduled(Date departureAirportScheduled) {
        this.departureAirportScheduled = departureAirportScheduled;
    }

    public Date getDepartureAirportEstimated() {
        return departureAirportEstimated;
    }

    public void setDepartureAirportEstimated(Date departureAirportEstimated) {
        this.departureAirportEstimated = departureAirportEstimated;
    }

    public Date getDepartureAirportActual() {
        return departureAirportActual;
    }

    public void setDepartureAirportActual(Date departureAirportActual) {
        this.departureAirportActual = departureAirportActual;
    }

    public int getArrivalAirportId() {
        return arrivalAirportId;
    }

    public void setArrivalAirportId(int arrivalAirportId) {
        this.arrivalAirportId = arrivalAirportId;
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

    public int getArrivalAirportDelay() {
        return arrivalAirportDelay;
    }

    public void setArrivalAirportDelay(int arrivalAirportDelay) {
        this.arrivalAirportDelay = arrivalAirportDelay;
    }

    public Date getArrivalAirportScheduled() {
        return arrivalAirportScheduled;
    }

    public void setArrivalAirportScheduled(Date arrivalAirportScheduled) {
        this.arrivalAirportScheduled = arrivalAirportScheduled;
    }

    public Date getArrivalAirportEstimated() {
        return arrivalAirportEstimated;
    }

    public void setArrivalAirportEstimated(Date arrivalAirportEstimated) {
        this.arrivalAirportEstimated = arrivalAirportEstimated;
    }

    public Date getArrivalAirportActual() {
        return arrivalAirportActual;
    }

    public void setArrivalAirportActual(Date arrivalAirportActual) {
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

    public int getAircraftTypeId() {
        return aircraftTypeId;
    }

    public void setAircraftTypeId(int aircraftTypeId) {
        this.aircraftTypeId = aircraftTypeId;
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

    public int getLiveFlightDataId() {
        return liveFlightDataId;
    }

    public void setLiveFlightDataId(int liveFlightDataId) {
        this.liveFlightDataId = liveFlightDataId;
    }

    public Date getLiveUpdated() {
        return liveUpdated;
    }

    public void setLiveUpdated(Date liveUpdated) {
        this.liveUpdated = liveUpdated;
    }

    public float getLiveLatitude() {
        return liveLatitude;
    }

    public void setLiveLatitude(float liveLatitude) {
        this.liveLatitude = liveLatitude;
    }

    public float getLiveLongitude() {
        return liveLongitude;
    }

    public void setLiveLongitude(float liveLongitude) {
        this.liveLongitude = liveLongitude;
    }

    public float getLiveAltitude() {
        return liveAltitude;
    }

    public void setLiveAltitude(float liveAltitude) {
        this.liveAltitude = liveAltitude;
    }

    public float getLiveDirection() {
        return liveDirection;
    }

    public void setLiveDirection(float liveDirection) {
        this.liveDirection = liveDirection;
    }

    public float getLiveSpeedHorizontal() {
        return liveSpeedHorizontal;
    }

    public void setLiveSpeedHorizontal(float liveSpeedHorizontal) {
        this.liveSpeedHorizontal = liveSpeedHorizontal;
    }

    public float getLiveSpeedVertical() {
        return liveSpeedVertical;
    }

    public void setLiveSpeedVertical(float liveSpeedVertical) {
        this.liveSpeedVertical = liveSpeedVertical;
    }

    public boolean isLiveIsGrounded() {
        return liveIsGrounded;
    }

    public void setLiveIsGrounded(boolean liveIsGrounded) {
        this.liveIsGrounded = liveIsGrounded;
    }

    @Override
    public String toString() {
        return "FlightVO{" +
                "flightDate=" + flightDate +
                ", flightStates='" + flightStates + '\'' +
                ", departureAirportId=" + departureAirportId +
                ", departureAirportName='" + departureAirportName + '\'' +
                ", departureAirportTimeZone='" + departureAirportTimeZone + '\'' +
                ", departureAirportIata='" + departureAirportIata + '\'' +
                ", departureAirportIcao='" + departureAirportIcao + '\'' +
                ", departureAirportTerminal='" + departureAirportTerminal + '\'' +
                ", departureAirportGate='" + departureAirportGate + '\'' +
                ", departureAirportDelay=" + departureAirportDelay +
                ", departureAirportScheduled=" + departureAirportScheduled +
                ", departureAirportEstimated=" + departureAirportEstimated +
                ", departureAirportActual=" + departureAirportActual +
                ", arrivalAirportId=" + arrivalAirportId +
                ", arrivalAirportName='" + arrivalAirportName + '\'' +
                ", arrivalAirportTimezone='" + arrivalAirportTimezone + '\'' +
                ", arrivalAirportIata='" + arrivalAirportIata + '\'' +
                ", arrivalAirportIcao='" + arrivalAirportIcao + '\'' +
                ", arrivalAirportTerminal='" + arrivalAirportTerminal + '\'' +
                ", arrivalAirportGate='" + arrivalAirportGate + '\'' +
                ", arrivalAirportBaggage='" + arrivalAirportBaggage + '\'' +
                ", arrivalAirportDelay=" + arrivalAirportDelay +
                ", arrivalAirportScheduled=" + arrivalAirportScheduled +
                ", arrivalAirportEstimated=" + arrivalAirportEstimated +
                ", arrivalAirportActual=" + arrivalAirportActual +
                ", airlineName='" + airlineName + '\'' +
                ", airlineIata='" + airlineIata + '\'' +
                ", airlineIcao='" + airlineIcao + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", flightIata='" + flightIata + '\'' +
                ", flightIcao='" + flightIcao + '\'' +
                ", flightCode='" + flightCode + '\'' +
                ", aircraftTypeId=" + aircraftTypeId +
                ", aircraftName='" + aircraftName + '\'' +
                ", aircraftIata='" + aircraftIata + '\'' +
                ", liveFlightDataId=" + liveFlightDataId +
                ", liveUpdated=" + liveUpdated +
                ", liveLatitude=" + liveLatitude +
                ", liveLongitude=" + liveLongitude +
                ", liveAltitude=" + liveAltitude +
                ", liveDirection=" + liveDirection +
                ", liveSpeedHorizontal=" + liveSpeedHorizontal +
                ", liveSpeedVertical=" + liveSpeedVertical +
                ", liveIsGrounded=" + liveIsGrounded +
                '}';
    }
}