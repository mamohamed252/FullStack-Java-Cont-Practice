package week7EmployeeApp.main;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import week7EmployeeApp.models.Employee;
import week7EmployeeApp.services.EmployeeServices;

/*
 * 4. Main application: EmployeeApp class

	Requirements:
	
	1. Declare an ArrayList of Employee: employees
	
	2. Menu: include the options for each crud operation
		Display the following menu:
		1. add
		2. remove
		3. update
		4. get employee by id
		5. getAllEmployees
		6. getEmployeeByFirstName
		7. exit
		
	3. Implement each operation or options (crud operations)
		- get input from user when needed.
		
		1. add 						==> createEmployee()
			- input: employee record
			- output: saved or error msg: not saved
			- process: add employee to the Employees list using addEmployee(employee) 				 	: boolean
			
		2. remove 					==> deleteEmployee()
			- input: employee id
			- output: removed or error msg: not found
			- process: delete employee from the Employees List using removeEmployee(id)
			
		3. update 					==> editEmployee()
			- input: employee id
			- output: updated or error msg: not found or not updated
			- process: update employee from the Employees List using updateEmployee(currentId, newEmployee) 
			
			
		4. get employee by id		==> showEmployeeById()
			- input: employee id
			- output: employee record or error msg: not found 
			- process: get employee from the Employees List using getEmployeeById(id)  

		5. getAllEmployees			==> showAllEmployees()
			- input: n/a
			- output: all employee records or error msg: not found 
			- process: get all employees from the Employees List using getAllEmployees() 
			
			 
		6. getEmployeeByFirstName	==> showEmployeeByFirstName()
			- input: employee first name
			- output: employee record or error msg: not found 
			- process: get employee from the Employees List using getEmployeeByFirstName(firstName) 
	
 */
public class EmployeeApp {
	static Scanner sc = new Scanner(System.in);
	static EmployeeServices employeeList = new EmployeeServices();

	public static void main(String[] args) {
		inputSampleData();

		int choice = 0;
		while (choice != 7) {
			try {
				showMenu();
				System.out.println("Enter a number between 1 - 7: ");
				choice = sc.nextInt();
				sc.nextLine();
				switch (choice) {
					case 1:
						createEmployee();
						break;
					case 2:
						deleteEmployee();
						break;
					case 3:
						editEmployee();
						break;
					case 4:
						showEmployeeById();
						break;
					case 5:
						showAllEmployees();
						break;
					case 6:
						showEmployeeByFirstName();
						break;
					default:
						break;
				}
			} catch (Exception e) { // if the user enters something that is not a number print error. try again
				sc.nextLine();
				System.out.println("\n-----------Invalid Input! Try Again.-----------");
			}
		}
		sc.close();
		System.out.println("bye bye");
	}


	// Creates employee object for Addition or Update
	private static Employee inputEmployee() {
		try {
			System.out.println("Enter the employee's new first name: ");
			String newFirst = sc.nextLine().toUpperCase();
			System.out.println("Enter the employee's new last name: ");
			String newLast = sc.nextLine().toUpperCase();
			System.out.println("Enter the employee's new salary: ");
			Double newSalary = Double.parseDouble(sc.nextLine());
			System.out.println("Enter the employee's new ID: ");
			Integer newID = Integer.parseInt(sc.nextLine());
			return new Employee(newID, newFirst, newLast, newSalary);
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	/*
	 * 1. Method: createEmployee() - input: employee record - output: saved or error
	 * msg: not saved - process: add employee to the Employees list using
	 * addEmployee(employee) : boolean
	 *
	 */
	private static void createEmployee() {
		Employee employee = inputEmployee();

		boolean result = employeeList.addEmployee(employee);

		String msg = result ? "Employee created" : "Not Saved";
		System.out.println(msg);
	}

	/*
	 * 2. remove ==> deleteEmployee() - input: employee id - output: removed or
	 * error msg: not found - process: delete employee from the Employees List using
	 * removeEmployee(id)
	 *
	 */
	private static void deleteEmployee() {
		// input id
		// find employee by id
		// if found ==> delete employee found & print the employee deleted
		// else print error msg

		System.out.println("Enter the ID of employee to be removed: ");
		Integer id = sc.nextInt();
		Employee employee = employeeList.removeEmployee(id);
		if (employee != null) {
			System.out.println("Employee removed");
			System.out.println(employee);
		} else {
			System.out.println("Employee not removed");
		}
		System.out.println();
	}


	/*
 	 	update 	==> editEmployee()
			- input: employee id
			- output: updated or error msg: not found or not updated
			- process: update employee from the Employees List using updateEmployee(currentId, newEmployee)
 	*/
	private static void editEmployee() {
		System.out.println("Enter the ID of employee to be updated: ");
		Integer id = sc.nextInt();
		sc.nextLine();

		Employee employee = employeeList.getEmployeeById(id);

		if (employee != null) {
			Employee modifiedEmployee = inputEmployee(); // temp employee
			if (modifiedEmployee != null) {
				boolean result = employeeList.updateEmployee(employee, modifiedEmployee);
				System.out.println(result ? "updated" : "not updated");
			} else {
				System.out.println("Update - Input error msg");
			}
		} else {
			System.out.println("That employee ID does not exist");
		}
	}

	/*
	 * 4. get employee by id ==> showEmployeeById() - input: employee id - output:
	 * employee record or error msg: not found - process: get employee from the
	 * Employees List using getEmployeeById(id)
	 *
	 */
	private static void showEmployeeById() {
		System.out.println("Show Employee By Id");
		System.out.println("Enter ID: ");
		Integer id = sc.nextInt();
		Employee employeeFound = employeeList.getEmployeeById(id); // ricardo
		if (employeeFound != null) {
			// print the employeeFound
			System.out.println(employeeFound.toString());
		} else {
			// print error msg
			System.out.println("Employee " + id + " NOT found");
		}

	}

	/*
	 * 	5. getAllEmployees			==> showAllEmployees()
	 *	- input: n/a
	 *	- output: all employee records or error msg: not found
	 *	- process: get all employees from the Employees List using getAllEmployees()
	 */
	private static void showAllEmployees() {
		// get all employees using services
		if (employeeList.getEmployees().isEmpty()) {
			System.out.println("Employee list is empty");
		} else {
			employeeList.printEmployees();
		}
	}

	private static void showEmployeeByFirstName() {
		System.out.println("Show Employee By Name");
		System.out.println("First Name: ");
		String firstName = sc.nextLine().toUpperCase();
		List<Employee> employeesFound = employeeList.getEmployeesByFirstname(firstName); // ricardo
		if (employeesFound.isEmpty()) {
			// print error msg
			System.out.println("First Name: " + firstName + ", NOT found");
		} else {
			// print the employeeFound list
			employeeList.printEmployees(employeesFound);
		}
	}

	private static void inputSampleData() {
		employeeList.addEmployee(new Employee(1, "HOMER", "SIMPSON", 50000.00));
		employeeList.addEmployee(new Employee(2, "CLARK", "KENT", 50000.00));
		employeeList.addEmployee(new Employee(3, "BRUCE", "WAYNE", 50000.00));
		employeeList.addEmployee(new Employee(4, "PETER", "PARKER", 50000.00));
		employeeList.addEmployee(new Employee(5, "MILES", "MORALES", 50000.00));
		employeeList.addEmployee(new Employee(6, "MANGO", "AVOCADO", 50000.00));
		employeeList.addEmployee(new Employee(7, "TACO", "CAT", 50000.00));
		employeeList.addEmployee(new Employee(8, "FRIDAY", "YET?", 50000.00));
		employeeList.addEmployee(new Employee(22, "PETER", "PORKER", 50000.00));
	}


	private static void showMenu() {
		System.out.println("EMPLOYEE APP \nMAIN MENU");
		System.out.println("1. CREATE EMPLOYEE");
		System.out.println("2. REMOVE EMPLOYEE");
		System.out.println("3. EDIT EMPLOYEE");
		System.out.println("4. SHOW EMPLOYEE BY ID");
		System.out.println("5. PRINT ALL EMPLOYEES");
		System.out.println("6. SHOW EMPLOYEE(S) BY FIRST NAME");
		System.out.println("7. EXIT");
	}

}
