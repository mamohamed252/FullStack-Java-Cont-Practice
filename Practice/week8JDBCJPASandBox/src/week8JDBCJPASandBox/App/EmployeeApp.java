package week8JDBCJPASandBox.App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeApp {
	static Connection connection;

	public static void main(String[] args) throws SQLException {
		System.out.println("Welcome to employee App");
		// createEmployee();
		// showEmployeeById();
		// editEmployeeById();
		// removeEmployee();
		// showAllEmployees();
		showEmployeeByIdDynamic(3);

		System.out.println("\nDone");
	}

	private static void showEmployeeByIdDynamic(int empId) throws SQLException {
		// 1. connect
		connectionToMariaDb();

		// 2. prepare sql DML INSERT
		String sqlQuery = "SELECT * FROM employee WHERE id = ?";
		PreparedStatement pstm = connection.prepareStatement(sqlQuery);

		pstm.setInt(1, empId);
		// 3. execute sql

		ResultSet rs = pstm.executeQuery();

		// 4. use result

		if (rs.next()) {
			Integer id = rs.getInt(1); // id
			String firstName = rs.getString(2); // firstName
			String lastName = rs.getString(3); // lastName
			Double salary = rs.getDouble(4); // salary
			System.out.printf("%d %s %s %.2f\n", id, firstName, lastName, salary);
		} else {
			System.out.println("Could not find employee by id");
		}

		// 5. disconnect
		rs.close();
		pstm.close();
		closeConnectionMariaDb();

	}

	private static void showAllEmployees() throws SQLException {
		// 1. connect
		connectionToMariaDb();

		// 2. prepare sql DML INSERT
		String sqlQuery = "SELECT * FROM employee";
		Statement stm = connection.createStatement();

		// 3. execute sql

		ResultSet rs = stm.executeQuery(sqlQuery);

		// 4. use result
		System.out.println("id, firstName, lastName, salary");
		while (rs.next()) {
			Integer id = rs.getInt(1); // id
			String firstName = rs.getString(2); // firstName
			String lastName = rs.getString(3); // lastName
			Double salary = rs.getDouble(4); // salary
			System.out.printf("%d %s %s %.2f\n", id, firstName, lastName, salary);
		}
		System.out.println("End of list of employees");

		// 5. disconnect
		rs.close();
		stm.close();
		closeConnectionMariaDb();

	}

	private static void removeEmployee() throws SQLException {
		// 1. connect
		connectionToMariaDb();

		// 2. prepare sql DML INSERT
		String sqlQuery = "DELETE FROM employee WHERE id = 2";
		Statement stm = connection.createStatement();

		// 3. execute sql
		int rows = stm.executeUpdate(sqlQuery);

		// 4. use result
		if (rows == 1) {
			System.out.println("Employee deleted");
		} else {
		}

		// 5. disconnect
		stm.close();
		closeConnectionMariaDb();

	}

	private static void editEmployeeById() throws SQLException {
		// 1. connect
		connectionToMariaDb();

		// 2. prepare sql DML INSERT
		String sqlQuery = "Update employee SET firstname = 'zz' WHERE id = 2";
		Statement stm = connection.createStatement();

		// 3. execute sql
		int rows = stm.executeUpdate(sqlQuery);

		// 4. use result
		if (rows == 1) {
			System.out.println("Employee updated");
		} else {
			System.out.println("Employee not found");
		}

		// 5. disconnect
		stm.close();
		closeConnectionMariaDb();

	}

	private static void showEmployeeById() throws SQLException {
		// 1. connect
		connectionToMariaDb();

		// 2. prepare sql DML INSERT
		String sqlQuery = "SELECT * FROM employee WHERE id = 2";
		Statement stm = connection.createStatement();

		// 3. execute sql

		ResultSet rs = stm.executeQuery(sqlQuery);

		// 4. use result

		if (rs.next()) {
			Integer id = rs.getInt(1); // id
			String firstName = rs.getString(2); // firstName
			String lastName = rs.getString(3); // lastName
			Double salary = rs.getDouble(4); // salary
			System.out.printf("%d %s %s %.2f", id, firstName, lastName, salary);
		} else {
			System.out.println("Could not find employee by id");
		}

		// 5. disconnect
		rs.close();
		stm.close();
		closeConnectionMariaDb();

	}

	private static void createEmployee() throws SQLException {
		// 1. connect
		connectionToMariaDb();

		// 2. prepare sql statement - DML - INSERT

		String sqlQuery = "INSERT INTO employee VALUES (2, \"test\", \"Doee\", 100.00)";
		Statement stm = connection.prepareStatement(sqlQuery);
		// 3. execute sql

//		ResultSet rs = stm.executeQuery(sqlQuery); DQL
		int rs = stm.executeUpdate(sqlQuery);
		// 4. use result
		System.out.println(rs > 0 ? "1 or more rows affected" : "0 rows affected");
		// 5. disconnect
		stm.close();
		closeConnectionMariaDb();
		System.out.println("End of create employee");

	}

	private static void closeConnectionMariaDb() throws SQLException {
		connection.close();
	}

	private static void connectionToMariaDb() {

		String url, username, password;
		url = "jdbc:mariadb://localhost:3306/employeejdbcjpa";
		username = "root";
		password = "123456";

		try {
			connection = DriverManager.getConnection(url, username, password);
			if (connection.isValid(10)) {
				System.out.println("DataBase Connected!");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
