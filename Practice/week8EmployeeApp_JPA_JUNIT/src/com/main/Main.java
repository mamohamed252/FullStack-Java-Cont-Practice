package com.main;

import java.util.List;

import com.dao.EmployeeServices;
import com.entities.Employee;

public class Main {
	static EmployeeServices es;

	public static void main(String[] args) {
		es = new EmployeeServices();

		System.out.println("EMPLOYEE MANAGEMENT SYSTEM");
		
		int operation = 1;
		Employee employee = new Employee(4, "Connor", "Trader", 20000.00);
		
		switch(operation) {
			case 1:
				registerEmployee(employee);
				break;
			case 2:
				showEmployeeById(6);
				break;
			case 3:
				editEmployeeById(5);
				break;
			case 4:
				removeEmployeeById(4);
				break;
			case 5:
				showAllEmployees();
				break;
			case 6:
				exitApp();
				break;
		}
	}

	private static void registerEmployee(Employee newEmployee) {
		int result = es.addEmployee(newEmployee);
		System.out.println(result == 1 ? "Employee registered":"Employee Registration failed!");
		
	}

	private static void showEmployeeById(int id) {
		Employee emp = es.getEmployeeById(id);
		System.out.println(emp);
		
	}

	private static void editEmployeeById(int id) {
		Employee emp = new Employee(5, "Samuel", "Uganiza", 10000.00);
		int result = es.updateEmployeeById(id, emp);
		System.out.println(result == 1 ? "Employee updated":"Employee update failed!");
	}

	private static void removeEmployeeById(int id) {

		Employee result = es.deleteEmployeeById(id);
		System.out.println(result != null ? "Employee # "+ id + " has been removed from the system" : "Failed to remove employee # " + id + " from the system.");
		
	}

	private static void showAllEmployees() {
		List<?> empList = es.getAllEmployees();
		if(empList !=null ) {
			empList.forEach(x -> System.out.println(x+"\n"));
		} else {
			System.out.println("No employees found");
		}
		
	}

	private static void exitApp() {
		System.out.println("Logging off!");
	}

}
