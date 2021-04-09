package week7JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainRunner {

	public static void main(String[] args) {

	    try {
	        String url, username, password;
	        url = "jdbc:mariadb://localhost:3307/information_schema";
	        username = "root";
	        password = "123456";
	        Connection connection = DriverManager.getConnection(url, username, password);
	        
	        if(connection.isValid(10)) {
	            System.out.println("Connected!");
	        }
	    } catch (SQLException e) {
	        e.getMessage();
	        e.printStackTrace();
	    } 
	}

}
