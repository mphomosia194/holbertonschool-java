import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSQLite {

    public static void main(String[] args) {
        initConnection();
    }

    public static void initConnection() {
        String url = "jdbc:sqlite:sqlite_database_2022.db";

        try {
            Class.forName("org.sqlite.JDBC"); 

            Connection conn = DriverManager.getConnection(url);

            if (conn != null) {
                System.out.println("Connection to SQLite has been established.");
                conn.close();
            }

        } catch (ClassNotFoundException e) {
            System.out.println("SQLite JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
