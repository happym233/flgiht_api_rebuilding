package project.Gateway.City;

import project.Entities.City;
import project.Gateway.SqliteConnector;
import project.VO.CityVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityGatewayImpl implements CityGateway{
    private Connection connection;

    public CityGatewayImpl() {
        this.connection =  SqliteConnector.getConnection();
    }

    private String generateSql(City c) {
        String selectPart = "select * from city left join country on city.countryId = country.countryId";
        if (c == null) return selectPart;
        else if (c.getCityName() != null) {
            String s =  selectPart + " where countryName=\"" + c.getCityName() + "\"";
            return s;
        } else return selectPart;
    }


    public List<CityVO> search(City c) {
        List<CityVO> res = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(generateSql(c));
            while (resultSet.next()) {
                CityVO cvo = new CityVO();
                cvo.setCityName(resultSet.getString("cityName"));
                cvo.setIataCode(resultSet.getString("iataCode"));
                cvo.setCountryIso2(resultSet.getString("countryIso2"));
                cvo.setLatitude(resultSet.getDouble("latitude"));
                cvo.setLongitude(resultSet.getDouble("longtitude"));
                cvo.setTimeZone(resultSet.getString("timezone"));
                cvo.setGmt(resultSet.getString("gmt"));
                cvo.setGeonameId(resultSet.getString("geonameId"));
                res.add(cvo);
            }
            return res;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
