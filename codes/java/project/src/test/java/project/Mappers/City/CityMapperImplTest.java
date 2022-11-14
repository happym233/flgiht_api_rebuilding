package project.Mappers.City;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Entities.City;
import project.Gateway.SqliteConnector;
import project.Mappers.City.CityMapperImpl;

import java.sql.Connection;

import static org.junit.Assert.assertEquals;


public class CityMapperImplTest {
    //test

    public static SqliteConnector sqliteConnector;

    @Before
    public void before() throws Exception {

        Connection connection = sqliteConnector.getConnection();
        System.out.println(connection);

    }

    @Test
    public void testCityMapper() throws Exception{

        CityMapperImpl a = new CityMapperImpl();
        //System.out.println(a.getAllCities( ));
        //System.out.println(a.getCityByName(""));
        String answer = "";
        for (City c: a.getCityByName("Dalian")){
            answer += c.getCityName();
        }
        assertEquals(answer, "Dalian");





    }

    @After
    public void after() throws Exception {
        //
        SqliteConnector.close();
    }


} 
