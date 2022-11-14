package test.project.Mappers.City;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Gateway.SqliteConnector;
import project.Mappers.City.CityMapperImpl;

import java.sql.Connection;


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
        System.out.println(a.getAllCities( ));

        System.out.println(a.getCityByName("Auckland"));
        System.out.println(a.getCityByName(""));


    }

    @After
    public void after() throws Exception {
        //
        SqliteConnector.close();
    }


} 
