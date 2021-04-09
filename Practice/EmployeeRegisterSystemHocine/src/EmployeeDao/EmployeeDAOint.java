package EmployeeDao;


import java.sql.SQLException;
import java.util.List;

import EmployeeBean.Employee;

public interface EmployeeDAOint {
	
	enum SQL{
		//create queries constants
		INSERT_USER("insert into employees (name,email,country) values (?, ?, ?);"),
		GET_ALL_USERS("select * from employees;"),
		GET_USER_BY_ID("select * from employees where id  = ?;"),
		UPDATE_USER("update employees set  name = ?,email = ?,country = ? where id = ?;"),
		REMOVE_USER("delete from employees where id = ?;");
		private final String query;
		private SQL(String s) {
			this.query = s;
		}
		public String getQuery() {
			return query;
		}
	}
	//insert Employee to the data base
	public boolean insertEmployee(Employee employee);
	//get employee using the id 
	public Employee getEmployeeById(int id);
	//get all employees
	public List<Employee> getAllEmployees();
	//update Employee
	public boolean updateEmployee(int id, Employee employee);
	//remove Employee 
	public boolean removeEmployee(int id);
}
