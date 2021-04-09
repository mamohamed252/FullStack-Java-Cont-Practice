package employeeApp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EmployeeBean.Employee;
import EmployeeDao.EmployeeDao;

public class employeeApp {
	
		static EmployeeDao empDao = new EmployeeDao();
		List<Employee> list = new ArrayList<Employee>();
		static Scanner reader = new Scanner(System.in);
		public static void main(String[] args) {
			
			int option = 0;
			while(option!=7) {
				menu();
				System.out.println("select menu:");
				option = reader.nextInt();
				switch(option) {
				case 1:
					createEmp();
					
					break;
				case 2:
					getEmployeeById();
					break;
				case 3:
					getAllEmployees();
					break;
				case 4:
					
					updateEmployee();
					break;
				case 5:
					removeEmployee();
					break;
				case 6:
					
					getEmployeeByName();
					break;
				case 7:
					break;
				}
			}
			
		}
		// trying to fix this method
		
		private static void getEmployeeById() {
			// TODO Auto-generated method stub
			System.out.println("Enter Id:");
			int id = reader.nextInt();
			Employee emp = empDao.getEmployeeById(id);
			System.out.printf("%s %s %s %10s", "id", "first name", "last name","salary" );
			System.out.printf("%-10d %-20s %-20s %.2f\n",emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getSalary());
		}
		private static void getEmployeeByName() {
			// TODO Auto-generated method stub
			reader.nextLine();
			System.out.println("Enter name:");
			String name = reader.nextLine();
			empDao.getAllEmployees()
				.stream()
				.filter(emp -> emp.getFirstName().contentEquals(name))
				.forEach(emp -> System.out.printf("%-10d %-20s %-20s %.2f\n",emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getSalary()));
			
		}
		private static void removeEmployee() {
			// TODO Auto-generated method stub
			System.out.println("Enter Id:");
			int idDelete = reader.nextInt();
			if(empDao.removeEmployee(idDelete)) {
				System.out.println("Employee Updated Successafully");
			}else {
				System.out.println("try again");
			}
		}
		private static void updateEmployee() {
			// TODO Auto-generated method stub
			System.out.println("Enter Id:");
			int idToUpdate = reader.nextInt();
			Employee empUpdate = new Employee();
			empUpdate.setId(idToUpdate);
			reader.nextLine();
			System.out.print("\nEnter  First Name:\n");
			empUpdate.setFirstName(reader.nextLine());
			System.out.print("\nEnter  Last Name:\n");
			empUpdate.setLastName(reader.nextLine());
			System.out.print("\nEnter salary:\n");
			empUpdate.setSalary(reader.nextDouble());
			if(empDao.updateEmployee(idToUpdate, empUpdate)) {
				System.out.println("Employee Updated Successafully");
			}else {
				System.out.println("try again");
			}
			
		}
		private static void getAllEmployees() {
			// TODO Auto-generated method stub
			System.out.printf("%-10s %-20s %-20s %-10s\n","id","fName","lName","Salary");
			for(Employee emp : empDao.getAllEmployees()) {
				System.out.printf("%-10d %-20s %-20s %.2f\n",emp.getId(),emp.getFirstName(),emp.getLastName(),emp.getSalary());
			}
		}
		private static void createEmp() {
			// TODO Auto-generated method stub
			Employee employee = new Employee();
			reader.nextLine();
			System.out.println("Enter First Name:");
			employee.setFirstName(reader.nextLine());
			System.out.println("Enter Last Name:");
			employee.setLastName(reader.nextLine());
			System.out.println("Enter Salary:");
			employee.setSalary(reader.nextDouble());
			if(empDao.insertEmployee(employee)) {
				System.out.println("Employee added successafully");
			}else {
				System.out.println("try again!!");
			}
		}
		public static void menu() {
			System.out.println("Choose an action:");
			System.out.println("1. Add Employee to System");
			System.out.println("2. Get Employee By Id");
			System.out.println("3. Get All Employee");
			System.out.println("4. Update Employee");
			System.out.println("5. Remove Employee");
			System.out.println("6. Show By Name");
			System.out.println("7. Quit");
		}
		
}
