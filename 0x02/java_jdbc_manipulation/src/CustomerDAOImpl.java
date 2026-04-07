import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public Connection connect(String connectionUrl) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(connectionUrl);
            if (conn != null) {
                System.out.println("Connected to SQLite database.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    @Override
    public void createTable(String connectionUrl) {
        String sql = "CREATE TABLE IF NOT EXISTS customers (" +
                     "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                     "name TEXT NOT NULL, " +
                     "age INTEGER, " +
                     "cpf TEXT, " +
                     "rg TEXT);";

        try (Connection conn = connect(connectionUrl);
             Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insert(String connectionUrl, Customer customer) {
        String sql = "INSERT INTO customers(name, age, cpf, rg) VALUES(?, ?, ?, ?)";

        try (Connection conn = connect(connectionUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, customer.getName());
            pstmt.setInt(2, customer.getAge());
            pstmt.setString(3, customer.getCpf());
            pstmt.setString(4, customer.getRg());

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectAll(String connectionUrl) {
        String sql = "SELECT * FROM customers";

        try (Connection conn = connect(connectionUrl);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("cpf") + " | " +
                    rs.getString("rg")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(String connectionUrl, int id, String name, Integer age) {
        String sql = "UPDATE customers SET name = ?, age = ? WHERE id = ?";

        try (Connection conn = connect(connectionUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setInt(3, id);

            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(String connectionUrl, int id) {
        String sql = "DELETE FROM customers WHERE id = ?";

        try (Connection conn = connect(connectionUrl);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
