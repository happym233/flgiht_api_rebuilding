package test.project.Mappers.Airline;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Gateway.SqliteConnector;
import project.Mappers.Airline.AirlineMapperImpl;

import java.sql.Connection;

/** 
* AirlineMapperImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>11/13/2022</pre> 
* @version 1.0 
*/ 
public class AirlineMapperImplTest {
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
* Method: getAllAirlines() 
* 
*/ 
@Test
public void testGetAllAirlines() throws Exception { 
//TODO: Test goes here...
    AirlineMapperImpl a = new AirlineMapperImpl();
    System.out.println(a.getAllAirlines( ));

    System.out.println(a.getAirlineByName("Silkair"));

    System.out.println(a.getAirlineByIataCode("3U"));

    System.out.println(a.getAirlineByIcaoCOdes("ANZ"));

    System.out.println(a.getAirlineByMultipleData("Air New Zealand","NZ","ANZ"));

} 



} 
