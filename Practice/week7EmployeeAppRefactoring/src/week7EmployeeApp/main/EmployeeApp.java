package week7EmployeeApp.main;

import java.util.ArrayList;
import java.util.HashMap;
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
	static Scanner sc;
	static HashMap<Integer, Employee> employees = new HashMap<>();
	static EmployeeServices employeeServices;

	public static void main(String[] args) {
		employeeServices = new EmployeeServices(employees);

		sc = new Scanner(System.in);
		int choice = 0;
		do {
			showMenu();
			choice = getChoice();
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
			case 7:
//			Exit
				break;
			default:
				break;
			}
		} while (choice != 7);
		sc.close();
		System.out.println("bye bye");
	}

	private static void showEmployeeByFirstName() {
		sc.nextLine();
		System.out.println("Show Employee By Name");
		System.out.println("First Name: ");
		String firstName = sc.nextLine().toUpperCase();
		HashMap<Integer, Employee> employeesFound = employeeServices.getEmployeesByFirstname(firstName); // ricardo
		if (employeesFound != null) {
			// print the employeeFound
			printList(employeesFound);
		} else {
			// print error msg
			System.out.println("First Name: " + firstName + ", NOT found");
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
//		if(!employeeServices.getAllEmployees().isEmpty()) {
//			printList(employeeServices.getAllEmployees());
//		}else {
//			System.out.println("Employee list is empty");
//		}
				
		HashMap<Integer, Employee> employeelist = employeeServices.getAllEmployees();
		if(employeelist !=null) {
			printList(employeelist);
		} else {
			System.out.println("Employee list is empty");
		}
	}
	
	private static void printList(HashMap<Integer, Employee> employees) {
		for(Employee employee : employees.values()) {
			System.out.println(employee);
		}
	}
	/*
	 * update 	==> editEmployee()
		- input: employee id
		- output: updated or error msg: not found or not updated
		- process: update employee from the Employees List using updateEmployee(currentId, newEmployee) 
	 */
	private static void editEmployee() {
		System.out.println("Enter the ID of employee to be updated: ");
		Integer id = sc.nextInt();
		sc.nextLine();
		
		Employee employee = employeeServices.getEmployeeById(id);
		
		if (employee != null) {
			// Consume leftover new line
			
			Employee newInfo = inputNewEmployee(); // temp employee
			if (newInfo !=null) {
				boolean result = employeeServices.updateEmployee(employee, newInfo);
				System.out.println(result?"updated":"not updated");
			} else {
				System.out.println("Update - Input error msg");
			}
		} else {
			System.out.println("That employee ID does not exist");
		}
	}

	private static Employee inputNewEmployee() {
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
		} catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
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
		Employee employee = employeeServices.removeEmployee(id);
		if (employee != null) {
			System.out.println("Employee removed");
			System.out.println(employee);
		} else {
			System.out.println("Employee not removed");
		}

	}

	/*
	 * 4. get employee by id ==> showEmployeeById() - input: employee id - output:
	 * employee record or error msg: not found - process: get employee from the
	 * Employees List using getEmployeeById(id)
	 * 
	 */

	private static void showEmployeeById() {
		// employeeServices = new EmployeeServices(employeesList);
		System.out.println("Show Employee By Id");
		System.out.println("Enter ID: ");
		Integer id = sc.nextInt();
		Employee employeeFound = employeeServices.getEmployeeById(id); // ricardo
		if (employeeFound != null) {
			// print the employeeFound
			System.out.println(employeeFound.toString());
		} else {
			// print error msg
			System.out.println("Employee " + id + " NOT found");
		}

	}

	/*
	 * 1. Method: createEmployee() - input: employee record - output: saved or error
	 * msg: not saved - process: add employee to the Employees list using
	 * addEmployee(employee) : boolean
	 * 
	 */
	private static void createEmployee() {
//		employeesList = new ArrayList<>();		
//		employeeServices = new EmployeeServices(employeesList);
//		Employee employee = new Employee(1,"Ricardo", "Delahoz", 99999.99);

		Employee employee = inputEmployee();

		boolean result = employeeServices.addEmployee(employee);

		String msg = result ? "Employee created" : "Not Saved";
		System.out.println(msg);
	}

	private static Employee inputEmployee() {
		Employee employee = new Employee();
		try {
			System.out.println("Enter the employee...");
			System.out.println("Id: ");
			employee.setId(sc.nextInt()); // id: 99\n
			sc.nextLine();
			System.out.println("First Name: ");
			employee.setFirstName(sc.nextLine().toUpperCase());
			System.out.println("Last Name: ");
			employee.setLastName(sc.nextLine().toUpperCase());
			System.out.println("Salary: ");
			employee.setSalary(sc.nextDouble());
		} catch (Exception e) {
			employee = null;
			System.out.println(e.getMessage());
		}
		return employee;
	}

	private static int getChoice() {
		System.out.println("Enter a number bw 1 - 7: ");
		Integer input = sc.nextInt();
		return input;
	}

	private static void showMenu() {
		System.out.println("EMPLOYEE APP \n MAIN MENU");
		System.out.println("1. add");
		System.out.println("2. remove");
		System.out.println("3. update");
		System.out.println("4. get employee by id");
		System.out.println("5. getAllEmployees");
		System.out.println("6. getEmployeeByFirstName");
		System.out.println("7. exit");
	}

}
