package project.Gateway.Country;

import project.Entities.Country;
import project.Gateway.SqliteConnector;
import project.VO.CountryVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryGatewayImpl implements CountryGateway{
    private Connection connection;

    public CountryGatewayImpl() {
        this.connection = SqliteConnector.getConnection();
    }

    private String generateSql(Country c) {
        String selectPart = "select * from country";
        if (c == null) return selectPart;
        else if (c.getCountryName() != null) {
            String s =  selectPart + " where countryName=\"" + c.getCountryName() + "\"";
            return s;
        } else return selectPart;
    }

    public List<CountryVO> search(Country c) {
        List<CountryVO> res = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(generateSql(c));
            while (resultSet.next()) {
                CountryVO cvo = new CountryVO();
                cvo.setCountryName(resultSet.getString("countryName"));
                cvo.setCountryIso2(resultSet.getString("countryIso2"));
                cvo.setCountryIso3(resultSet.getString("countryIso3"));
                cvo.setCountryIsoNumeric(resultSet.getInt("countryIsoNumeric"));
                cvo.setPopulation(resultSet.getInt("population"));
                cvo.setCapital(resultSet.getString("capital"));
                cvo.setContinent(resultSet.getString("continent"));
                cvo.setCurrencyName(resultSet.getString("currencyName"));
                cvo.setCurrencyCode(resultSet.getString("currencyCode"));
                cvo.setFipsCode(resultSet.getString("fipsCode"));
                cvo.setPhonePrefix(resultSet.getString("phonePrefix"));
                res.add(cvo);
            }
            stmt.close();
            return res;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
