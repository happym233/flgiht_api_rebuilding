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
public class ControllerTest {
    //test

    public static SqliteConnector sqliteConnector;

    @Before
    public void before() throws Exception {

        Connection connection = sqliteConnector.getConnection();
        System.out.println(connection);

    }

    @After
    public void after() throws Exception {
        //
        SqliteConnector.close();
    }

    @Test
    public void testControllerFactoryCountry() throws Exception{

        Controller c = ControllerFactory.create("country");
        System.out.println(c.handleParameter("country_name=New Zealand"));
        assertNotNull(c);
        assertSame("project.Controllers.CountryController", c.getClass().getName());
    }

    @Test
    public void testControllerFactoryCity() throws Exception{

        Controller c = ControllerFactory.create("city");
        System.out.println(c.handleParameter("city_name=Dalian"));
        assertNotNull(c);
        assertSame("project.Controllers.CityController", c.getClass().getName());
    }


    @Test
    public void testControllerFactory() throws Exception{

        Controller c = ControllerFactory.create("airline");
        System.out.println(c.handleParameter("airline_name=Sichuan Airlines"));
        System.out.println(c.handleParameter("icao=QTR"));
        System.out.println(c.handleParameter("iata=QF"));
        assertNotNull(c);
        assertSame("project.Controllers.AirlineController", c.getClass().getName());

    }





}
