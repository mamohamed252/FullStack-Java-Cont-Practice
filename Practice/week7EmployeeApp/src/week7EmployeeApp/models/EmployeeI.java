package week7EmployeeApp.models;

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

	boolean addEmployee(Employee employee);
	Employee removeEmployee(Integer id);
	boolean updateEmployee(Employee currentEmployee, Employee newEmployee);
	Employee getEmployeeById(Integer id);
	List<Employee> getEmployees();
	List<Employee> getEmployeesByFirstname(String firstName);

	void printEmployees();
	void printEmployees(List<Employee> employees);
}
