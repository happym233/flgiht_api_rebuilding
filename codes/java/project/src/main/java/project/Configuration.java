package project;

import java.text.SimpleDateFormat;

public class Configuration {
    private static String databasePath = "D:/Documents/soen 6441/project_database/flights_test.db";
    private static SimpleDateFormat dateFormat;
    private static SimpleDateFormat timeFormat;

    private Configuration() {

    }

    public static String getDatabasePath() { return databasePath; }

    public static SimpleDateFormat getDateFormat() {
        if (dateFormat == null) {
            dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        }
        return dateFormat;
    }

    public static SimpleDateFormat getTimeFormat() {
        if (timeFormat == null) {
            timeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssX");
        }
        return timeFormat;
    }
}
