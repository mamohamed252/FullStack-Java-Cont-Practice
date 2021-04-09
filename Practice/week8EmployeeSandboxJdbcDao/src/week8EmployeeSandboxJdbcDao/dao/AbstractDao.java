package week8EmployeeSandboxJdbcDao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AbstractDao {

	// connection string
	private final String URL = "jdbc:mariadb://localhost:3306/employeesandboxjdbcjpa";
	private final String USER = "root";
	private final String PASSWORD = "admin";
		
	protected Connection connection = null;
	protected PreparedStatement preparedStatement = null;
	protected ResultSet resultSet = null;
	
	public void connect() throws SQLException {
		
		connection = DriverManager.getConnection(URL, USER, PASSWORD);
	
	}
	
	public void dispose() throws SQLException {
		if (resultSet != null) resultSet.close();
		if (preparedStatement != null) preparedStatement.close();
		if (connection != null) connection.close();
	}
}
