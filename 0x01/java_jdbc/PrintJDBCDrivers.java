import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class PrintJDBCDrivers {

    public static void main(String[] args) {

        Enumeration<Driver> drivers = DriverManager.getDrivers();

        if (!drivers.hasMoreElements()) {
            System.out.println("No JDBC drivers found.");
        }

        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            System.out.println("Driver Name: " + driver.getClass().getName());
            System.out.println("Version: " + driver.getMajorVersion() + "." + driver.getMinorVersion());
            System.out.println("---------------------------");
        }
    }
}
