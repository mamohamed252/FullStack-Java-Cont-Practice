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
	

	@Override
	public boolean insertEmployee(Employee employee) {
		// INSERT EMPLOYEE TO TEH DATA BASE 
		try {
			this.connect();
			ps = con.prepareStatement(SQL.INSERT_USER.getQuery());
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setDouble(3, employee.getSalary());
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
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				Double salary = rs.getDouble("salary");
				employee = new Employee(idEmp,firstName,lastName,salary);
				
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
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				Double salary = rs.getDouble("salary");
				Employee employee = new Employee(idEmp,firstName,lastName,salary);
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
			ps.setString(1, employee.getFirstName());
			ps.setString(2, employee.getLastName());
			ps.setDouble(3, employee.getSalary());
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
