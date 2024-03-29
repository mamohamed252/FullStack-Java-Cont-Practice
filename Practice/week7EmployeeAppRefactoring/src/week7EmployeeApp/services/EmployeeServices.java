package week7EmployeeApp.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
//	List<Employee> employees;

	private HashMap<Integer, Employee> employees = new HashMap<>();

	public EmployeeServices(HashMap<Integer, Employee> employees) {
		super();
		this.employees = employees;
	}

	public HashMap<Integer, Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(HashMap<Integer, Employee> employees) {
		this.employees = employees;
	}

	/*
	 * method: addEmployee(employee) return: boolean
	 */

	@Override
	public boolean addEmployee(Employee employee) {

		boolean result = false;
		try {
			if (employee != null) {
				this.employees.put(employee.getId(), employee);
				result = true;
			}
		} catch (Exception e) {
			System.out.println("could not add employee");
		}
		return result;

	}

	/*
	 * method: removeEmployee(id) return: Employee or null (current employee record)
	 */
	@Override
	public Employee removeEmployee(Integer id) {
		// the remove and add employee methods were refactored with ricardo
		Employee result = this.employees.remove(id);
		return result;
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
		for (Employee employee : this.employees.values()) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null; // null == id not found
	}

	@Override
	public HashMap<Integer, Employee> getAllEmployees() {
		// business logic
		return this.employees;
	}

	@Override
	public HashMap<Integer, Employee> getEmployeesByFirstname(String firstName) {
		// loop through employees
		HashMap<Integer, Employee> foundEmployees = new HashMap<>();
		for (Employee employee : this.employees.values()) {
			if (employee.getFirstName().equals(firstName)) {
				foundEmployees.put(employee.getId(), employee);
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
