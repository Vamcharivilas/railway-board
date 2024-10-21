package org.Railway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String jdbcUrl = "jdbc:mysql://localhost/railway";  // Update if using a different port
	        String username = "root";
	        String password = "Pass@123";  // Your MySQL password

	        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
	            System.out.println("Connection successful!");
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}

}
