package project.Mappers.Airline;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Entities.Airline;
import project.Gateway.SqliteConnector;
import project.Mappers.Airline.AirlineMapperImpl;

import java.sql.Connection;

import static org.junit.Assert.assertEquals;

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
    //System.out.println(a.getAllAirlines( ));

    //System.out.println(a.getAirlineByName("Silkair"));

    String answer = "";
    for (Airline c: a.getAirlineByName("Silkair")){
        answer += c.getAirlineName();
    }
    assertEquals(answer, "Silkair");

   // System.out.println(a.getAirlineByIataCode("3U"));
    String answer2 = "";
    for (Airline c: a.getAirlineByIataCode("3U")){
        answer2 += c.getIataCode();
    }
    assertEquals(answer2, "3U");

    //System.out.println(a.getAirlineByIcaoCOdes("ANZ"));
    String answer3 = "";
    for (Airline c: a.getAirlineByIcaoCOdes("ANZ")){
        answer3 += c.getIcaoCode();
    }
    assertEquals(answer3, "ANZ");


} 



} 
