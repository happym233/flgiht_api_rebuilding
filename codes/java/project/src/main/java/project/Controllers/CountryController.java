package project.Controllers;

import project.Entities.Country;
import project.Exceptions.JsonException;
import project.Mappers.Country.CountryMapper;
import project.Mappers.Country.CountryMapperImpl;

import java.util.List;

public class CountryController implements Controller{
    private CountryMapper countryMapper;

    public CountryController() {
        countryMapper = new CountryMapperImpl();
    }

    private String toJsonString(List<Country> cList) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("\t\"data\": [\n");
        for (int i = 0; i < cList.size(); i++) {
            Country c = cList.get(i);
            sb.append("\t\t{\n");
            sb.append("\t\t\t\"country_name\": \"" + c.getCountryName() +"\",\n");
            sb.append("\t\t\t\"country_iso2\": \"" + c.getCountryIso2() + "\",\n");
            sb.append("\t\t\t\"country_iso3\": \"" + c.getCountryIso3() + "\",\n");
            sb.append("\t\t\t\"country_iso_numeric\": \"" + c.getCountryIsoNumeric() + "\",\n");
            sb.append("\t\t\t\"population\": \"" + c.getPopulation() + "\",\n");
            sb.append("\t\t\t\"capital\": \"" + c.getCapital() + "\",\n");
            sb.append("\t\t\t\"continent\": \"" + c.getContinent() + "\",\n");
            sb.append("\t\t\t\"currency_name\": \"" + c.getCurrencyName() + "\",\n");
            sb.append("\t\t\t\"currency_code\": \"" + c.getCurrencyCode() + "\",\n");
            sb.append("\t\t\t\"fips_code\": \"" + c.getFipsCode() + "\",\n");
            sb.append("\t\t\t\"phone_prefix\": \"" + c.getPhonePrefix() + "\"\n");
            sb.append("\t\t}");
            if (i != cList.size() - 1) {
                sb.append(",\n");
            }
            else sb.append("\n");
        }
        sb.append("\t]\n");
        sb.append("}\n");
        return sb.toString();
    }

    @Override
    public String handleParameter(String parameter) {
        if (parameter == null || parameter.length() == 0) {
            return toJsonString(countryMapper.getAllCountries());
        } else {
            String[] parameters = parameter.split("&");
            for (String para: parameters) {
                String[] argu = para.split("=");
                if (argu[0].equalsIgnoreCase("country_name")) {
                    return toJsonString(countryMapper.getCountryByName(argu[1]));
                } else {
                    return JsonException.getJsonParameterExceptionMessage();
                }
            }
            return JsonException.getJsonParameterExceptionMessage();
        }
    }
}