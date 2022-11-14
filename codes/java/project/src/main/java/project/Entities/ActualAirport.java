package project.Entities;

import java.sql.Time;

public class ActualAirport {
     private String gate;
     private Integer delay;
     private String baggage;
     private Time estimateTime;
     private Time actualTime;

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

     public Time getEstimateTime() {
          return estimateTime;
     }

     public void setEstimateTime(Time estimateTime) {
          this.estimateTime = estimateTime;
     }

     public Time getActualTime() {
          return actualTime;
     }

     public void setActualTime(Time actualTime) {
          this.actualTime = actualTime;
     }
}
