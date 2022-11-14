package project.Mappers.Country;

import project.Entities.Country;
import project.Gateway.Country.CountryGateway;
import project.Gateway.Country.CountryGatewayImpl;
import project.VO.CountryVO;

import java.util.ArrayList;
import java.util.List;

public class CountryMapperImpl implements CountryMapper{

    private CountryGateway countryGateway;

    public CountryMapperImpl() {
        this.countryGateway = new CountryGatewayImpl();
    }

    private List<Country> parse(List<CountryVO> countryVOs) {
        List<Country> res = new ArrayList<>();
        for (CountryVO cvo: countryVOs) {
            Country country = new Country();
            country.setCountryName(cvo.getCountryName());
            country.setCountryIso2(cvo.getCountryIso2());
            country.setCountryIso3(cvo.getCountryIso3());
            country.setCountryIsoNumeric(cvo.getCountryIsoNumeric());
            country.setPopulation(cvo.getPopulation());
            country.setCapital(cvo.getCapital());
            country.setContinent(cvo.getContinent());
            country.setCurrencyName(cvo.getCurrencyName());
            country.setCurrencyCode(cvo.getCurrencyCode());
            country.setFipsCode(cvo.getFipsCode());
            country.setPhonePrefix(cvo.getPhonePrefix());
            res.add(country);
        }
        return res;
    }

    @Override
    public List<Country> getAllCountries() {
        return parse(countryGateway.search(null));
    }

    @Override
    public List<Country> getCountryByName(String countryName) {
        Country c = new Country();
        c.setCountryName(countryName);
        return parse(countryGateway.search(c));
    }
}
