package project.Gateway.City;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Entities.City;
import project.Gateway.City.CityGatewayImpl;
import project.Gateway.SqliteConnector;

import java.sql.Connection;

import static org.junit.Assert.assertEquals;

/**
 * SqliteConnector Tester.
 *
 * @author <Authors name>
 * @since <pre>11/13/2022</pre>
 * @version 1.0
 */
public class CityGatewayImplTest {
    //test

    public static SqliteConnector sqliteConnector;

    @Before
    public void before() throws Exception {

        Connection connection = sqliteConnector.getConnection();
        System.out.println(connection);

    }

    @Test
    public void testSearch() throws Exception{
        CityGatewayImpl c = new CityGatewayImpl();
        /*
        City test1 = new City();
        test1.setCityName("Dalian");
        System.out.println(c.search(  test1  ));

        City test2 = new City();
        test2.setCityName("Auckland");
        System.out.println(c.search(  test2  ));

         */
        City test3 = new City();
        test3.setCityName("Hong Kong");
        System.out.println(c.search(test3).toString());

        String answer = "[CityVO{cityName='Hong Kong', iataCode='HKG', countryIso2='HK', latitude=22.24786, longitude=114.203384, timeZone='Asia\\/Hong_Kong', gmt='8', geonameId='1819729'}]";


        assertEquals(c.search(test3).toString(), answer);
//        assertEquals(s1,s2);




    }

    @After
    public void after() throws Exception {
        SqliteConnector.close();
    }


} 
