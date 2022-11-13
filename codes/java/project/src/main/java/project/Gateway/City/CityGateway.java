package project.Gateway.City;

import project.Entities.City;
import project.VO.CityVO;

import java.util.List;

public interface CityGateway {
    List<CityVO> search(City city);
}
