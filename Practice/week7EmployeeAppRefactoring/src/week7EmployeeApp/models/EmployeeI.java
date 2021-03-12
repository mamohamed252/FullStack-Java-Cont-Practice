package week7EmployeeApp.models;

import java.util.HashMap;
import java.util.List;


/* 
 * REQUIREMENTS:
 * 2. Define an Employee Interface
	
	Including the "CRUD" operations
	
	Operations:
	- addEmployee(employee) 				 	: boolean
	- removeEmployee(id) 					 	: Employee or null (current employee record)
	- updateEmployee(currentId, newEmployee) 	: Employee or null (current employee record)
	- getEmployeeById(id) 						: Employee or null (current employee record)
	- getAllEmployees() 						: List<Employees> or null
	- getEmployeeByFirstName(firstName) 		: List<Employee> or null (current employee record)
	- existById(id) 							: boolean
 */
public interface EmployeeI {
	public boolean addEmployee(Employee employee);
	public Employee removeEmployee(Integer id);
	public boolean updateEmployee(Employee currentEmployee, Employee newEmployee);
	public Employee getEmployeeById(Integer id);
	public HashMap<Integer, Employee> getAllEmployees();
	public HashMap<Integer, Employee> getEmployeesByFirstname(String firstName);
	public boolean existById(Integer id);

}
