package project.Mappers.City;

import project.Entities.City;

import java.util.List;

public interface CityMapper {
    public List<City> getAllCities();

    public List<City> getCityByName(String cityName);
}
