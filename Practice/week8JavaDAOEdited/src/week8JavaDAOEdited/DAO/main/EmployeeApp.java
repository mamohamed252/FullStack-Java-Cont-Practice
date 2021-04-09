package week8JavaDAOEdited.DAO.main;

import week8JavaDAOEdited.DAO.entity.Employee;

public class EmployeeApp {
	public static void main(String[] args) {
		// invoke the transactions

		System.out.println("Welcome Employee App");

		int operation = 1;

		Employee employee = new Employee(1, "Corey", "Barr", 100.00);

		switch (operation) {
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

	}

}
