package sw_dev.exceptionhandling.customexception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* Tester for Handled Exception */
public class MainClass {

    private static String DATABASE_EXCEPTION = "DATABASE_EXCEPTION";
    private static final Logger LOGGER = Logger.getLogger(MainClass.class.getName());

    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);
        //Math.sqrt(5);
        try {
            makeDatabaseConnection();
        } catch (HandledException e) {
            // Display custom message to the user
            System.out.println("Code: "+e.getCode()+" Exception Message : "+e.getMessage());

            LOGGER.severe("Exception: " + e.toString());
        }
    }

    static void makeDatabaseConnection() throws HandledException {
        String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
        String userName = "sa";
        String password = "secret";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbURL, userName, password);
        } catch (SQLException e) {
            throw new HandledException(DATABASE_EXCEPTION,"Failed to connect to database", e);
        }
    }
}