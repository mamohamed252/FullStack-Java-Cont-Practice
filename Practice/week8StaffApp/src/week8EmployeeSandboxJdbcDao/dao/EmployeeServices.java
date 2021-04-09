package week8EmployeeSandboxJdbcDao.dao;

import java.sql.SQLException;
import java.util.List;

import week8EmployeeSandboxJdbcDao.models.Employee;

public class EmployeeServices extends AbstractDao implements EmployeeI   {

	@Override
	public int addEmployee(Employee employee) {
		int row = 0;
		
		//1.Connect
		//2.prepare query
		//3.execute
		//4.process
		//5.disconnect
		
		try {
			connect();
			preparedStatement = connection.prepareStatement(SQL.INSERT_EMPLOYEE.getQuery());
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2,employee.getFirstName());
			preparedStatement.setString(3,employee.getLastName());
			preparedStatement.setDouble(4,employee.getSalary());
			row = preparedStatement.executeUpdate();	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployeeById(Integer id, Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee deleteEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
