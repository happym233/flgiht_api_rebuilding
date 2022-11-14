package project.Entities;

public class Airline {
    private String airlineName;
    private String iataCode;
    private String iataPrefixAccounting;
    private String icaoCode;
    private String callsign;
    private String type;
    private String status;
    private Integer fleetSize;
    private Float fleetAverageAge;
    private Integer dateFounded;
    private String hubCode;
    private Country country;

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void setIataCode(String iataCode) {
        this.iataCode = iataCode;
    }

    public String getIataPrefixAccounting() {
        return iataPrefixAccounting;
    }

    public void setIataPrefixAccounting(String iataPrefixAccounting) {
        this.iataPrefixAccounting = iataPrefixAccounting;
    }

    public String getIcaoCode() {
        return icaoCode;
    }

    public void setIcaoCode(String icaoCode) {
        this.icaoCode = icaoCode;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getFleetSize() {
        return fleetSize;
    }

    public void setFleetSize(Integer fleetSize) {
        this.fleetSize = fleetSize;
    }

    public Float getFleetAverageAge() {
        return fleetAverageAge;
    }

    public void setFleetAverageAge(Float fleetAverageAge) {
        this.fleetAverageAge = fleetAverageAge;
    }

    public Integer getDateFounded() {
        return dateFounded;
    }

    public void setDateFounded(Integer dateFounded) {
        this.dateFounded = dateFounded;
    }

    public String getHubCode() {
        return hubCode;
    }

    public void setHubCode(String hubCode) {
        this.hubCode = hubCode;
    }
    public Country getCountry() {
        return country;
    }
    public void setCountry(Country country) {
        this.country = country;
    }
}
