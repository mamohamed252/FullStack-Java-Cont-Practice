package week8EmployeeAppJpaJunitDynamicWeb.dao;


import java.sql.SQLException;
import java.util.List;

import week8EmployeeAppJpaJunitDynamicWeb.entity.Employee;







public interface EmployeeDAOint {
	
	//insert Employee to the data base
	public boolean insertEmployee(Employee employee);
	//get employee using the id 
	public Employee getEmployeeById(int id);
	//get all employees
	public List<Employee> getAllEmployees();
	//getQuery
	public List<Employee> getAllEmployeesByNameQuery(String Name);
	//update Employee
	public boolean updateEmployee(int id, Employee employee);
	//remove Employee 
	public boolean removeEmployee(int id);
}
