package project.Controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Controllers.Controller;
import project.Controllers.ControllerFactory;
import project.Gateway.SqliteConnector;

import java.sql.Connection;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

/**
 * SqliteConnector Tester.
 *
 * @author <Authors name>
 * @since <pre>11/13/2022</pre>
 * @version 1.0
 */
public class ControllerTest {
    //test

    public static SqliteConnector sqliteConnector;

    @Before
    public void before() throws Exception {

        Connection connection = sqliteConnector.getConnection();
        //System.out.println(connection);

    }

    @After
    public void after() throws Exception {
        //
        SqliteConnector.close();
    }

    @Test
    public void testControllerFactoryCountry() throws Exception{

        Controller c = ControllerFactory.create("countries");
        //System.out.println(c.handleParameter("country_name=New Zealand"));
        assertNotNull(c);
        assertSame("project.Controllers.CountryController", c.getClass().getName());
    }

    @Test
    public void testControllerFactoryCity() throws Exception{

        Controller c = ControllerFactory.create("cities");
        //System.out.println(c.handleParameter("city_name=Dalian"));
        assertNotNull(c);
        assertSame("project.Controllers.CityController", c.getClass().getName());
    }


    @Test
    public void testControllerFactoryAirline() throws Exception{

        Controller c = ControllerFactory.create("airlines");
        //System.out.println(c.handleParameter("airline_name=Sichuan Airlines"));
        assertNotNull(c);
        assertSame("project.Controllers.AirlineController", c.getClass().getName());


    }

    @Test
    public void testControllerFactoryFlight() throws Exception{

        Controller c = ControllerFactory.create("flights");

        assertNotNull(c);
        assertSame("project.Controllers.FlightController", c.getClass().getName());


    }




}
