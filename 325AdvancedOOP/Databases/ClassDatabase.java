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
        String productTable = "nborchelt_Product";
        String customerTable = "nborchelt_Customer";
        String invoiceTable = "nborchelt_Invoice";
        String lineItemTable = "nborchelt_LineItem";
        try {
            initDatabaseConnection();

            Statement stat = connection.createStatement();

            try{
                stat.execute("CREATE TABLE "+productTable+"(Product_Code CHAR(7), Description VARCHAR(40), Price DECIMAL(10, 2))");
                stat.execute("CREATE TABLE "+customerTable+"(Customer_Number INT, Name VARCHAR(40), Address VARCHAR(40), City VARCHAR(30), State CHAR(2), Zip CHAR(5))");
                stat.execute("CREATE TABLE "+invoiceTable+"(Invoice_Number INT, Customer_Number INT, Payment DECIMAL(10,2))");
                stat.execute("CREATE TABLE "+lineItemTable+"(Invoice_Number INT, Product_Code CHAR(7), Quantity INT)");
            }
            catch(Exception ex){

            }

            stat.execute("INSERT INTO "+productTable+" VALUES('116-064', 'Toaster', 24.95)");
            stat.execute("INSERT INTO "+productTable+" VALUES('257-535', 'Hair dryer', 29.95)");
            stat.execute("INSERT INTO "+productTable+" VALUES('643-119', 'Car vacuum', 19.99)");

            stat.execute("INSERT INTO "+invoiceTable+" VALUES(11731,3175,0");
            stat.execute("INSERT INTO "+invoiceTable+" VALUES(11732,3176,245.50");
            stat.execute("INSERT INTO "+invoiceTable+" VALUES(11733,3177,0");

            stat.execute("INSERT INTO "+lineItemTable+" VALUES(11731, '116-064', 3");
            stat.execute("INSERT INTO "+lineItemTable+" VALUES(11731, '257-535', 1");
            stat.execute("INSERT INTO "+lineItemTable+" VALUES(11731, '643-119', 2");
            stat.execute("INSERT INTO "+lineItemTable+" VALUES(11732, '116-064', 10");
            stat.execute("INSERT INTO "+lineItemTable+" VALUES(11733, '116-064', 2");
            stat.execute("INSERT INTO "+lineItemTable+" VALUES(11733, '643-119', 1");

            ResultSet result = stat.executeQuery("SELECT * FROM "+productTable);

            while(result.next())
                System.out.println(result.getString("Product_Code") + " " + result.getString("Description") + " " + result.getString("Price"));

            stat.execute("DROP TABLE "+productTable);
            /*
            String query = "SELECT * FROM nborchelt_Products";
            ResultSet result = stat.executeQuery(query);

            while (result.next())
            {
                System.out.println(result.getString(1));
            }
            */
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
