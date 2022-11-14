package test.project.Gateway.Airline;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Entities.Airline;
import project.Gateway.Airline.AirlineGatewayImpl;
import project.Gateway.SqliteConnector;

import java.sql.Connection;

/** 
* AirlineGatewayImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>11/13/2022</pre> 
* @version 1.0 
*/ 
public class AirlineGatewayImplTest {
    public static SqliteConnector sqliteConnector;
@Before
public void before() throws Exception {

    Connection connection = sqliteConnector.getConnection();
    System.out.println(connection);
} 

@After
public void after() throws Exception {
    SqliteConnector.close();
} 

/** 
* 
* Method: search(Airline airline) 
* 
*/ 
@Test
public void testSearch() throws Exception { 
//TODO: Test goes here...
    AirlineGatewayImpl c = new AirlineGatewayImpl();
    Airline test1 = new Airline();
    test1.setIataCode("3U");
    System.out.println(c.search(  test1  ));

    Airline test2 = new Airline();
    test2.setAirlineName("Air New Zealand");
    System.out.println(c.search(  test2  ));

    Airline test3 = new Airline();
    test3.setAirlineName("Sichuan Airlines");
    System.out.println(c.search(  test3  ));

    Airline test4 = new Airline();
    test4.setIcaoCode("CSC");
    System.out.println(c.search(  test4  ));

    //assertEquals(test1.equals(test3) &&  test3.equals(test4), true);


}


} 
