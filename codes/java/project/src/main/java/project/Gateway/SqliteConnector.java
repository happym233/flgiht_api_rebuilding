package project.Gateway;


import project.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnector {
   private static String url = "jdbc:sqlite:" + Configuration.getDatabasePath();
   private Connection connection;
   private static SqliteConnector sqliteConnector = null;

   private SqliteConnector() {
      try {
         this.url = url;
         this.connection = DriverManager.getConnection(url);
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public static Connection getConnection() {
      if (sqliteConnector == null) {
         sqliteConnector = new SqliteConnector();
      }
      return sqliteConnector.connection;
   }

   public static void close() {
      try {
         if (sqliteConnector.connection != null) {
            sqliteConnector.connection.close();
         }
         sqliteConnector = null;
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
