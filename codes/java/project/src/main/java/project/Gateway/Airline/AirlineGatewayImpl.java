package project.Gateway.Airline;

import project.Entities.Airline;
import project.Gateway.SqliteConnector;
import project.VO.AirlineVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AirlineGatewayImpl implements AirlineGateway{
    private Connection connection;

    public AirlineGatewayImpl() {
        this.connection = SqliteConnector.getConnection();
    }

    private String generateSql(Airline airline) {
        String selectPart = "select * from airline left join country on airline.countryId = country.countryId";
        if (airline == null) return selectPart;
        else  {
            Map<String, String> options = new HashMap<>();
            if (airline.getAirlineName() != null) options.put("airlineName", airline.getAirlineName());
            if (airline.getIataCode() != null) options.put("iataCode", airline.getIataCode());
            if (airline.getIcaoCode() != null) options.put("icaoCode", airline.getIcaoCode());
            if (options.isEmpty()) return selectPart;
            else {
                selectPart += " where ";
                for (String option: options.keySet()) {
                    selectPart += option + "=\"" + options.get(option) + "\" and ";
                }
                // System.out.println(selectPart);
                return selectPart.substring(0, selectPart.length() - 4);
            }
        }
    }

    public List<AirlineVO> search(Airline airline) {
        List<AirlineVO> res = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(generateSql(airline));
            while (resultSet.next()) {
                AirlineVO avo = new AirlineVO();
                avo.setArlineName(resultSet.getString("airlineName"));
                avo.setIataCode(resultSet.getString("iataCode"));
                avo.setIataPrefixAccounting(resultSet.getString("iataPrefixAccounting"));
                avo.setIcaoCode(resultSet.getString("icaoCode"));
                avo.setCallSign(resultSet.getString("callsign"));
                avo.setType(resultSet.getString("airlineType"));
                avo.setStatus(resultSet.getString("status"));
                avo.setFleetSize(resultSet.getInt("fleetSize"));
                avo.setFleetAverageAge(resultSet.getFloat("fleetAverageAge"));
                avo.setDateFounded(resultSet.getInt("dateFounded"));
                avo.setHubCode(resultSet.getString("hubCode"));
                avo.setCountryName(resultSet.getString("countryName"));
                avo.setCountryIso2(resultSet.getString("countryIso2"));
                res.add(avo);
            }
            stmt.close();
            return res;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
