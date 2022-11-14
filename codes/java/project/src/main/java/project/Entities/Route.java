package project.Entities;

public class Route {
    private ScheduledAirport departureAirport;
    private ScheduledAirport arrivalAirport;
    private Airline airline;

    public ScheduledAirport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(ScheduledAirport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public ScheduledAirport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(ScheduledAirport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }
}