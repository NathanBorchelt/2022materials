import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassDatabase{

    private static Connection connection;

    /**
     * Entry point of the application. Opens and closes the database connection.
     *
     * @param args (not used)
     * @throws SQLException if an error occurs when interacting with the database
     */
    public static void main(String[] args) throws SQLException {
        try {
            initDatabaseConnection();

            Statement stat = connection.createStatement();

            try{
                stat.execute("CREATE TABLE nborchelt_Products (Name VARCHAR(20))");
            }
            catch(Exception ex){

            }
            stat.execute("INSERT INTO nborchelt_Products VALUES ('Romeo')");

            String query = "SELECT * FROM nborchelt_Products";
            ResultSet result = stat.executeQuery(query);

            while (result.next())
            {
                System.out.println(result.getString(1));
            }
            result.close();
            stat.close();

        }
        finally {
            if (connection != null) {
                closeDatabaseConnection();
            }
        }
    }

    private static void initDatabaseConnection() throws SQLException {
        System.out.println("Connecting to the database...");
        connection = DriverManager.getConnection("jdbc:mariadb://csclab.murraystate.edu:3306/CSC_325", "CSC_325","Java" );

        System.out.println("Connection valid: " + connection.isValid(5));
    }

    private static void closeDatabaseConnection() throws SQLException {
        System.out.println("Closing database connection...");
        connection.close();
        System.out.println("Connection valid: " + connection.isValid(5));
    }
}
