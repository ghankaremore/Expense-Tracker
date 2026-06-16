import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/expense_tracker", "username", "password");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            return null;
        }
    }
}