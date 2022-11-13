package project.Gateway.Country;

import project.Entities.Country;
import project.VO.CountryVO;

import java.util.List;

public interface CountryGateway {
    public List<CountryVO> search(Country c);
}
