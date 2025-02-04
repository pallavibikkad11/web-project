package webproject1;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class DbConnection {
	    private static final String URL = "jdbc:mysql://localhost:3306/internship";
	    private static final String USER = "root";  // Replace with your MySQL username
	    private static final String PASSWORD = "Network@123";  // Replace with your MySQL password
    
	    public static Connection getConnection() throws SQLException {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            return DriverManager.getConnection(URL, USER, PASSWORD);
	        } catch (ClassNotFoundException e) {
	            throw new SQLException("JDBC Driver not found.", e);
	        }
	    }
}