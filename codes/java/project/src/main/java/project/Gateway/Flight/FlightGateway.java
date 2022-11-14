package project.Gateway.Flight;

import project.Entities.Flight;
import project.VO.FlightVO;

import java.util.List;

public interface FlightGateway {
    public List<FlightVO> search(Flight flight);
}