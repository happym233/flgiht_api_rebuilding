package project.Entities;

public class Flight {
     private String flightDate;
     private String flightStatus;
     private Integer number;
     private String iata;
     private String icao;
     private String codeShared;

    public String getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(String flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightStatus() {
        return flightStatus;
    }

    public void setFlightStatus(String flightStatus) {
        this.flightStatus = flightStatus;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
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
}
