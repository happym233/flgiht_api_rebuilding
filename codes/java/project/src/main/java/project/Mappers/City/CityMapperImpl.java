package project.Mappers.City;

import project.Entities.City;
import project.Entities.Country;
import project.Gateway.City.CityGateway;
import project.Gateway.City.CityGatewayImpl;
import project.VO.CityVO;

import java.util.ArrayList;
import java.util.List;

public class CityMapperImpl implements CityMapper {
   private CityGateway cityGateway;

   public CityMapperImpl() {
       cityGateway = new CityGatewayImpl();
   }

   private List<City> parse(List<CityVO> cityVOs) {
       List<City> res = new ArrayList<>();
       for (CityVO cityVO: cityVOs) {
           Country country = new Country();
           country.setCountryIso2(cityVO.getCountryIso2());
           City city = new City();
           city.setCountry(country);
           city.setCityName(cityVO.getCityName());
           city.setIataCode(cityVO.getIataCode());
           city.setLatitude(cityVO.getLatitude());
           city.setLongtitude(cityVO.getLongitude());
           city.setTimezone(cityVO.getTimeZone());
           city.setGmt(cityVO.getGmt());
           city.setGeonameId(cityVO.getGeonameId());
           res.add(city);
       }
       return res;
   }

    @Override
    public List<City> getAllCities() {
        return parse(cityGateway.search(null));
    }

    @Override
    public List<City> getCityByName(String cityName) {
        City toSearch = new City();
        toSearch.setCityName(cityName);
        return parse(cityGateway.search(toSearch));
    }

}
