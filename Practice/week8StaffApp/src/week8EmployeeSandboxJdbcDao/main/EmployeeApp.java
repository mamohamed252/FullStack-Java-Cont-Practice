package week8EmployeeSandboxJdbcDao.main;

import week8EmployeeSandboxJdbcDao.dao.EmployeeServices;
import week8EmployeeSandboxJdbcDao.models.Employee;

public class EmployeeApp {
	static EmployeeServices employeeServices = new EmployeeServices();
	
	public static void main(String[] args) {
		//invoke the transactions

		System.out.println("Welcome Employee App");

		int operation = 1;

		Employee employee = new Employee(100,"Corey", "Barr", 1000.00);


		switch(operation) {
		case 1:
			registerEmployee(employee); // Create
			break;
		case 2:
			showEmployeeById(); // Retrieve - DQL
			break;
		case 3:
			editEmployeeById(); // Update - DML
			break;
		case 4:
			removeEmployeeById(); // Delete - DML
			break;
		case 5:
			showAllEmployees(); // Retrieve
			break;
		case 6:
			exitApp();
			break;			
		default:
			break;
		}

	}

	private static void exitApp() {
		System.out.println("bye bye");
	}

	private static void showAllEmployees() {
		// TODO Auto-generated method stub

	}

	private static void editEmployeeById() {
		// TODO Auto-generated method stub

	}

	private static void showEmployeeById() {
		// TODO Auto-generated method stub

	}

	private static void removeEmployeeById() {
		// TODO Auto-generated method stub

	}
	

	private static void registerEmployee(Employee newEmployee) {
		
		// business logic
		// employee input verification and computations
		int result = employeeServices.addEmployee(newEmployee);
		// business logic
		System.out.println(result==1?"Employee registered":"Employee not registered");
		
		
	}


}
