package project.entity;

import java.sql.Time;

public class LiveFlightData {
    private Time updated;
    private Float latitude;
    private Float longitude;
    private Float altitude;
    private Float direction;
    private Float speedHorizontal;
    private Float speedVertical;
    private Boolean isGround;

    public Time getUpdated() {
        return updated;
    }

    public void setUpdated(Time updated) {
        this.updated = updated;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Float getAltitude() {
        return altitude;
    }

    public void setAltitude(Float altitude) {
        this.altitude = altitude;
    }

    public Float getDirection() {
        return direction;
    }

    public void setDirection(Float direction) {
        this.direction = direction;
    }

    public Float getSpeedHorizontal() {
        return speedHorizontal;
    }

    public void setSpeedHorizontal(Float speedHorizontal) {
        this.speedHorizontal = speedHorizontal;
    }

    public Float getSpeedVertical() {
        return speedVertical;
    }

    public void setSpeedVertical(Float speedVertical) {
        this.speedVertical = speedVertical;
    }

    public Boolean getGround() {
        return isGround;
    }

    public void setGround(Boolean ground) {
        isGround = ground;
    }
}
