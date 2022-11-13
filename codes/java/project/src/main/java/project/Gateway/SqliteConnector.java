package project.Gateway;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnector {
   private String url;
   private Connection connection;

   public SqliteConnector(String url) {
      try {
         this.url = url;
         this.connection = DriverManager.getConnection(url);
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public Connection getConnection() {
      return connection;
   }

   public void close() {
      try {
          if (connection != null) {
              connection.close();
          }
      } catch (SQLException ex) {
          System.out.println(ex.getMessage());
      }
   }

   public static void main(String[] args) {
      SqliteConnector sqliteConnector = new SqliteConnector("jdbc:sqlite:D:/Documents/soen 6441/project_database/flights_test.db");
   }
}
