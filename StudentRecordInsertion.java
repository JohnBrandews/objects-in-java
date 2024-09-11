import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentRecordInsertion {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/StudentDB"; // Replace with your database URL
        String username = "your_username"; // Replace with your database username
        String password = "your_password"; // Replace with your database password

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Prepare the SQL statement for insertion
            String insertSql = "INSERT INTO student (regno, firstname, lastname, programmes, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertSql);

            // Set the values for the student record
            preparedStatement.setInt(1, 12345); // Example regno
            preparedStatement.setString(2, "John");
            preparedStatement.setString(3, "Doe");
            preparedStatement.setString(4, "Computer Science");
            preparedStatement.setString(5, "Active");

            // Execute the insertion
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Student record inserted successfully!");
            } else {
                System.out.println("Error: Student record insertion failed.");
            }

            // Close resources
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
}
