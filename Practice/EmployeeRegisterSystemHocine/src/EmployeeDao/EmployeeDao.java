package EmployeeDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import EmployeeBean.Employee;
import EmployeeBean.abstractEmp;

public class EmployeeDao extends abstractEmp  implements EmployeeDAOint {
//	String url = "jdbc:mariadb://localhost:3306/users";
//	String user = "root";
//	String password = "root";
//	
//	public Connection connect() throws SQLException {
//		Connection connection = DriverManager.getConnection(url, user, password);
//		connection.setAutoCommit(true);
//		return connection;
//	}
	//queries 
//	enum SQL{
//		//create queries constants
//		INSERT_USER("insert into employees (name,email,country) values (?, ?, ?);"),
//		GET_ALL_USERS("select * from employees;"),
//		GET_USER_BY_ID("select * from employees where id  = ?;"),
//		UPDATE_USER("update employees set  name = ?,email = ?,country = ? where id = ?;"),
//		REMOVE_USER("delete from employees where id = ?;");
//		private final String query;
//		private SQL(String s) {
//			this.query = s;
//		}
//		public String getQuery() {
//			return query;
//		}
//	}
	

	@Override
	public boolean insertEmployee(Employee employee) {
		// INSERT EMPLOYEE TO TEH DATA BASE 
		try {
			this.connect();
			ps = con.prepareStatement(SQL.INSERT_USER.getQuery());
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getCountry());
			ps.executeUpdate();
			return true;
		}catch(Exception e) {
			return false;
		}finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public Employee getEmployeeById(int id) {
		// get employee using id
		
		try {
			this.connect();
			Employee employee = null;
			ps = con.prepareStatement(SQL.GET_USER_BY_ID.getQuery());
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				int idEmp = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				employee = new Employee(idEmp,name,email,country);
				
			}
			return employee;
		}catch(Exception e) {
			return null ;
		}finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		// get all employees 
		try {
			this.connect();
			List<Employee> employees = new ArrayList<Employee>();
			ps = con.prepareStatement(SQL.GET_ALL_USERS.getQuery());
			rs = ps.executeQuery();
			while(rs.next()) {
				int idEmp = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String country = rs.getString("country");
				Employee employee = new Employee(idEmp,name,email,country);
				employees.add(employee);
				
			}
			return employees;
			
		}
		catch(Exception e) {
			System.out.println("no employees");
			return null;
		}finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean updateEmployee(int id, Employee employee)  {
		// update employee
		try {
			this.connect();
			ps = con.prepareStatement(SQL.UPDATE_USER.getQuery());
			ps.setString(1, employee.getName());
			ps.setString(2, employee.getEmail());
			ps.setString(3, employee.getCountry());
			ps.setInt(4, id);
			ps.executeUpdate();
			return true;
		}
		
		catch(Exception e) {
			return false;
		}finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean removeEmployee(int id) {
		// delete employee
		try {
			this.connect();
			ps = con.prepareStatement(SQL.REMOVE_USER.getQuery());
			ps.setInt(1, id);
			ps.executeUpdate();
			return true;
		}
		
		catch(Exception e) {
			return false;
		}finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
