package test.project.Controllers;

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
public class ControllerFactoryTest {
    //test

    public static SqliteConnector sqliteConnector;

    @Before
    public void before() throws Exception {

        Connection connection = sqliteConnector.getConnection();
        System.out.println(connection);

    }

    @Test
    public void testCountryController() throws Exception{

        Controller c = ControllerFactory.create("country");

        assertNotNull(c);

        assertSame("project.Controllers.CountryController", c.getClass().getName());
    }

    @Test
    public void testCityController() throws Exception{

        Controller c = ControllerFactory.create("city");

        assertNotNull(c);

        assertSame("project.Controllers.CityController", c.getClass().getName());
    }


    @Test
    public void testAirlineController() throws Exception{

        Controller c = ControllerFactory.create("airline");

        assertNotNull(c);

        assertSame("project.Controllers.AirlineController", c.getClass().getName());
    }

/*
    @Test
    public void testFlightController() throws Exception{

        Controller c = ControllerFactory.create("flight");

        assertNotNull(c);

        assertSame("project.Controllers.FlightController", c.getClass().getName());
    }
*/
    @After
    public void after() throws Exception {
        //
        SqliteConnector.close();
    }


} 
