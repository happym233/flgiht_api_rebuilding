package project.Controllers;

import project.Entities.City;
import project.Exceptions.JsonException;
import project.Mappers.City.CityMapper;
import project.Mappers.City.CityMapperImpl;

import java.util.List;

public class CityController implements Controller{

    private CityMapper cityMapper;

    public CityController() {
        cityMapper = new CityMapperImpl();
    }


    private String toJsonString(List<City> cList) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("\t\"data\": [\n");
        for (int i = 0; i < cList.size(); i++) {
            City c = cList.get(i);
            sb.append("\t\t{\n");
            sb.append("\t\t\t\"city_name\": \"" + c.getCityName() + "\",\n");
             sb.append("\t\t\t\"iata_code\": \"" + c.getIataCode() + "\",\n");
             sb.append("\t\t\t\"country_iso2\": \"" + c.getCountry().getCountryIso2() + "\",\n");
             sb.append("\t\t\t\"latitude\": \"" + c.getLatitude() + "\",\n");
             sb.append("\t\t\t\"longitude\": \"" + c.getLongtitude() + "\",\n");
             sb.append("\t\t\t\"timezone\": \"" + c.getTimezone() + "\",\n");
             sb.append("\t\t\t\"gmt\": \"" + c.getGmt() + "\",\n");
             sb.append("\t\t\t\"geoname_id\": \"" + c.getGeonameId() + "\"\n");
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
            return toJsonString(cityMapper.getAllCities());
        } else {
            String[] parameters = parameter.split("&");
            for (String para: parameters) {
                String[] argu = para.split("=");
                if (argu[0].equalsIgnoreCase("city_name")) {
                    return toJsonString(cityMapper.getCityByName(argu[1]));
                } else {
                    return JsonException.getJsonParameterExceptionMessage();
                }
            }
            return JsonException.getJsonParameterExceptionMessage();
        }
    }
}
