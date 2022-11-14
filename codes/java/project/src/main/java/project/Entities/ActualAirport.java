package project.Entities;

import project.Configuration;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ActualAirport extends ScheduledAirport{
     private String gate;
     private Integer delay;
     private String baggage;
     private Date estimateTime;
     private Date actualTime;

     private SimpleDateFormat timeFormat = Configuration.getTimeFormat();

     public String getGate() {
          return gate;
     }

     public void setGate(String gate) {
          this.gate = gate;
     }

     public Integer getDelay() {
          return delay;
     }

     public void setDelay(Integer delay) {
          this.delay = delay;
     }

     public String getBaggage() {
          return baggage;
     }

     public void setBaggage(String baggage) {
          this.baggage = baggage;
     }

     public Date getEstimateTime() {
          return estimateTime;
     }

     public String getEstimateTimeStr() {
          if (estimateTime == null) return "";
          return timeFormat.format(estimateTime);
     }

     public void setEstimateTime(Date estimateTime) {
          this.estimateTime = estimateTime;
     }

     public Date getActualTime() {
          return actualTime;
     }

     public String getActualTimeStr() {
          if (actualTime == null) return "";
          return timeFormat.format(actualTime);
     }

     public void setActualTime(Date actualTime) {
          this.actualTime = actualTime;
     }
}
