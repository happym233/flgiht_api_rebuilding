package test.project.Gateway.City;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Entities.City;
import project.Gateway.City.CityGatewayImpl;
import project.Gateway.SqliteConnector;

import java.sql.Connection;

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
        City test1 = new City();
        test1.setCityName("Dalian");
        System.out.println(c.search(  test1  ));

        City test2 = new City();
        test2.setCityName("Auckland");
        System.out.println(c.search(  test2  ));

        City test3 = new City();
        test3.setCityName("Hong Kong");
        System.out.println(c.search(  test3  ));




    }

    @After
    public void after() throws Exception {
        SqliteConnector.close();
    }


} 
