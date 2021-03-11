package week7EmployeeApp.services;

import java.util.ArrayList;
import java.util.List;

import week7EmployeeApp.models.Employee;
import week7EmployeeApp.models.EmployeeI;

/*
 * Requirements:
 * 
 * 3. Implement the Employee Interface with the class Employees
	- addEmployee(employee) 				 	: boolean
	- removeEmployee(id) 					 	: Employee or null (current employee record)
	- updateEmployee(currentId, newEmployee) 	: Employee or null (current employee record)
	- getEmployeeById(id) 						: Employee or null (current employee record)
	- getAllEmployees() 						: List<Employees> or null
	- getEmployeeByFirstName(firstName) 		: List<Employee> or null (current employee record)
	- existById(id) 							: boolean
	
 */
public class EmployeeServices implements EmployeeI {
	List<Employee> employees;

	public EmployeeServices(List<Employee> employees) {
		super();
		this.employees = employees;
	}

	/*
	 * method: addEmployee(employee) return: boolean
	 */

	@Override
	public boolean addEmployee(Employee employee) {
		boolean result = false;
		try {
			result = this.employees.add(employee);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}

	/*
	 * method: removeEmployee(id) return: Employee or null (current employee record)
	 */
	@Override
	public Employee removeEmployee(Integer id) {
		Employee employee = null;
		int index = 0;

		// business logic;
		try {
			index = this.employees.indexOf(getEmployeeById(id));
			employee = this.employees.remove(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return employee;
	}

	@Override
	public boolean updateEmployee(Employee currentEmployee, Employee newEmployee) {
		boolean result = false;
		if (currentEmployee != null) {
			currentEmployee.setId(newEmployee.getId());
			currentEmployee.setFirstName(newEmployee.getFirstName());
			currentEmployee.setLastName(newEmployee.getLastName());
			currentEmployee.setSalary(newEmployee.getSalary());
			result = true;
		}
		return result;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		// loop through employees
		for (Employee employee : this.employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null; // null == id not found
	}

	@Override
	public List<Employee> getAllEmployees() {
		// business logic
		if (!this.employees.isEmpty())
			return this.employees;
		return null;
	}

	@Override
	public List<Employee> getEmployeesByFirstname(String firstName) {
		// loop through employees
		List<Employee> foundEmployees = new ArrayList<>();

		for (Employee employee : this.employees) {
			if (employee.getFirstName().equals(firstName)) {
				foundEmployees.add(employee);
			}
		}
		if (foundEmployees.isEmpty())
			return null;
		return foundEmployees; // null == firstName not found
	}

	@Override
	public boolean existById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
