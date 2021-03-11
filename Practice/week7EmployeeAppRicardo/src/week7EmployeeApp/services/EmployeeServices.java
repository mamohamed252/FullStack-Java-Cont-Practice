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
	private List<Employee> employees;

	public EmployeeServices() {
		this.employees = new ArrayList<>();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	/*
	 * method: addEmployee(employee) return: boolean
	 */

	@Override
	public boolean addEmployee(Employee employee) {
		boolean result = false;
		try {
			result = employees.add(employee);
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

		// business logic;
		try {
			int index = 0;
			index = employees.indexOf(getEmployeeById(id));
			employee = employees.remove(index);
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

	// Retrieve employee by id
	@Override
	public Employee getEmployeeById(Integer id) {
		// loop through employees
		for (Employee employee : this.employees) {
			if (employee.getId().equals(id)) {
				return employee;
			}
		}
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

		// REFACTORED
		return foundEmployees; // null == firstName not found
	}

	public void printEmployees() {
		System.out.printf("%-10s %-20s %-20s %-10s%n", "ID", "FIRST NAME", "LAST NAME", "SALARY");
		for (Employee employee : this.employees) {
			System.out.println(employee.toString());
		}
	}

	// Overloaded Method to print specified employee list
	public void printEmployees(List<Employee> employees) {
		System.out.printf("%-10s %-20s %-20s %-10s%n", "ID", "FIRST NAME", "LAST NAME", "SALARY");
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}
}
