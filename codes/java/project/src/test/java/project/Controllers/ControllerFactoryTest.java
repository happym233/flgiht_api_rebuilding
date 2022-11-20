package project.Controllers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Controllers.Controller;
import project.Controllers.ControllerFactory;
import project.Gateway.SqliteConnector;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * SqliteConnector Tester.
 *
 * @author <Authors name>
 * @since <pre>11/13/2022</pre>
 * @version 1.0
 */
public class ControllerFactoryTest {
    //test

    public static SqliteConnector sqliteConnector;

    @Before
    public void before() throws Exception {

        Connection connection = sqliteConnector.getConnection();
        //System.out.println(connection);

    }

    @Test
    public void testCountryController() throws Exception{

        Controller c = ControllerFactory.create("countries");

        assertNotNull(c);

        assertEquals("project.Controllers.CountryController", c.getClass().getName());
    }

    @Test
    public void testCityController() throws Exception{

        Controller c = ControllerFactory.create("cities");

        assertNotNull(c);

        assertEquals("project.Controllers.CityController", c.getClass().getName());
    }


    @Test
    public void testAirlineController() throws Exception{

        Controller c = ControllerFactory.create("airlines");

        assertNotNull(c);
        System.out.println(c.getClass().getName());

        assertEquals("project.Controllers.AirlineController", c.getClass().getName());
    }


    @Test
    public void testFlightController() throws Exception{

        Controller c = ControllerFactory.create("flights");

        assertNotNull(c);

        assertEquals("project.Controllers.FlightController", c.getClass().getName());
    }

    @After
    public void after() throws Exception {
        //
        SqliteConnector.close();
    }


} 
