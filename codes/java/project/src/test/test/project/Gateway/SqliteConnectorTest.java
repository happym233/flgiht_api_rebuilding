package test.project.Gateway;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import project.Configuration;
import project.Gateway.SqliteConnector;

import java.sql.Connection;

import static org.junit.Assert.assertEquals;

/**
* SqliteConnector Tester. 
* 
* @author <Authors name> 
* @since <pre>11/13/2022</pre> 
* @version 1.0 
*/ 
public class SqliteConnectorTest {
    //test
    private static String url = "jdbc:sqlite:" + Configuration.getDatabasePath();
    private Connection connection;
    private static SqliteConnector sqliteConnector = null;

@Before
public void before() throws Exception {
    //
    connection = SqliteConnector.getConnection();
} 

@After
public void after() throws Exception {
    //

} 

/** 
* 
* Method: getConnection() 
* 
*/ 
@Test
public void testGetConnection() throws Exception { 
//TODO: Test goes here...

    Connection connection = sqliteConnector.getConnection();
    //System.out.println("It is connect to: "+connection);

    assertEquals(connection.isClosed(), false);

    //assertEquals(connection != null, true);

    //FlightAPIApplication f = new FlightAPIApplication();
    //System.out.println(f.handleCommand("city"));


}


    /**
* 
* Method: close() 
* 
*/ 
@Test
public void testClose() throws Exception { 
//TODO: Test goes here...

    SqliteConnector.close();
    //System.out.print(sqliteConnector);
    assertEquals(sqliteConnector == null, true);

} 


} 
