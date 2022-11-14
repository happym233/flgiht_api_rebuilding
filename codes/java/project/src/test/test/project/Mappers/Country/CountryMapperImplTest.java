package test.project.Mappers.Country;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Gateway.SqliteConnector;
import project.Mappers.Country.CountryMapperImpl;

import java.sql.Connection;

/** 
* CountryMapperImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>11/13/2022</pre> 
* @version 1.0 
*/ 
public class CountryMapperImplTest {
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
* Method: getAllCountries() 
* 
*/ 
@Test
public void testGetAllCountries() throws Exception { 
//TODO: Test goes here...
    CountryMapperImpl a = new CountryMapperImpl();
    System.out.println(a.getAllCountries( ));
}

/** 
* 
* Method: getCountryByName(String countryName) 
* 
*/ 
@Test
public void testGetCountryByName() throws Exception { 
//TODO: Test goes here...
    CountryMapperImpl a = new CountryMapperImpl();
    System.out.println(a.getCountryByName("Austria"));
} 

} 
