package test.project.Gateway.Country;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Entities.Country;
import project.Gateway.Country.CountryGatewayImpl;
import project.Gateway.SqliteConnector;

import java.sql.Connection;

import static org.junit.Assert.assertEquals;

/** 
* CountryGatewayImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>11/13/2022</pre> 
* @version 1.0 
*/ 
public class CountryGatewayImplTest {

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
* Method: search(Country c) 
* 
*/ 
@Test
public void testSearch() throws Exception { 
//TODO: Test goes here...

    CountryGatewayImpl c = new CountryGatewayImpl();
      /*
    Country test1 = new Country();
    test1.setCountryName("Austria");
    System.out.println(c.search(  test1  ));

    Country test2 = new Country();
    test2.setCountryName("New Zealand");
    System.out.println(c.search(  test2  ));


     */
    Country test3 = new Country();
    test3.setCountryName("China");
    //System.out.println(c.search(  test3  ));

    String answer ="[CountryVO{countryName='China', countryIso2='CN', countryIso3='CHN', countryIsoNumeric=156, population=1330044000, capital='Beijing', continent='AS', currencyName='Yuan Renminbi', currencyCode='CNY', fipsCode='CH', phonePrefix='86'}]";
    assertEquals(c.search(test3).toString(), answer);


} 


/** 
* 
* Method: generateSql(Country c) 
* 
*/ 


} 
