package project.Entities;

import project.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ScheduledAirport extends Airport{
    private SimpleDateFormat timeFormat = Configuration.getTimeFormat();
    private String terminal;
    private Date time;

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public Date getTime() {
        return time;
    }

    public String getScheduledTimeStr() {
        if (time == null) return "";
        return timeFormat.format(time);
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
