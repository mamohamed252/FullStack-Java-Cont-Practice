package week8EmployeeSandboxJdbcDao.dao;

import java.util.List;

import week8EmployeeSandboxJdbcDao.models.Employee;

public interface EmployeeI {
	enum SQL {
		GET_ALL_EMPLOYEES("SELECT * FROM employee"),
		GET_EMPLOYEE_BY_ID("SELECT * FROM employee WHERE id = ?"),
		UPDATE_EMPLOYEE("UPDATE employee SET firstName=?, lastName=?, salary=? WHERE id=?"),
		INSERT_EMPLOYEE("INSERT INTO employee (id, firstName, lastName, salary) VALUES (?,?,?,?)");
			
		private final String query;
		
		private SQL(String s) {
			this.query = s;
		}
		
		public String getQuery() {
			return query;
		}
	}
	
	public int addEmployee(Employee employee);
	public Employee getEmployeeById(Integer id);
	public int updateEmployeeById(Integer id, Employee employee);
	public Employee deleteEmployeeById(Integer id);
	public List<Employee> getAllEmployees();	
}
