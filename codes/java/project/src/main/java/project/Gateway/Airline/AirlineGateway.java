package project.Gateway.Airline;

import project.Entities.Airline;
import project.VO.AirlineVO;

import java.util.List;

public interface AirlineGateway {
    List<AirlineVO> search(Airline airline);
}
