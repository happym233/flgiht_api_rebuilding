package project.Mappers.Country;

import project.Entities.Country;

import java.util.List;

public interface CountryMapper {

    public List<Country> getAllCountries();

    public List<Country> getCountryByName(String countryName);

}
