package jpa.mainrunner;

import java.util.Scanner;

import extra.DatabaseInitializer;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {
	
	static Scanner scanner = new Scanner(System.in);
	static CourseService courseService = new CourseService();
	static StudentService studentService = new StudentService();
	
	/**
	 * This method displays and prompt the user to select one of the following with
	 * the option: 
	 * 
	 * 1. Student: which allows the user to enter his/her email and
	 * password and check whether or not those credentials are valid, in order to
	 * log in. If the credentials are invalid the program should end with
	 * appropriate message to the student. If the credentials are valid, the student
	 * is logged in and all the classes the Student is registered to should be
	 * displayed. Displays and prompt the student to select one of the following two
	 * additional numeric (1 or 2) options that are available: 
	 * 
	 * • 1) Register to Class: Which displays all the courses in the database and allows the student
	 * to select a course in which the student wished to be registered to. If the
	 * Student is already registered in that course, display the message "You are
	 * already registered in that course!", otherwise, register the student to that
	 * course and save this result in your database. Also show the updated
	 * registered courses list for that student. After that end the program with
	 * appropriate message. 
	 * 
	 * • 2) Logout: Which ends the program with appropriate message. 
	 * 
	 * 2. quit: which ends the program with appropriate message.
	 */
	public static void main(String[] args) {
		DatabaseInitializer.checkDB(scanner); // optional line, please read DatabaseInitializer.java
		run();
		scanner.close();
	}
	
	// 1st menu: ask if student
	private static void run() {
		String input = "";
		int choice = -1;
		while (true) {
			System.out.print("Are you a(n)\n1. Student\n2. quit\nPlease, enter 1 or 2.\n");
			input = scanner.nextLine();
			if(!input.matches("\\d+")) {
				System.out.println("Not an option. Please, enter 1 or 2.");
				continue;
			}
			choice = Integer.parseInt(input.replaceAll("\\D+", ""));
			switch(choice) {
			case 1:
				loginStudent();
				break;
			case 2:
				System.out.println("Quitting...");
				return;
			default:
				System.out.println("Not an option. Please, enter 1 or 2.");
				break;
			}
		}
	}
	
	// verification checking
	private static void loginStudent() {
		System.out.println("Enter Your Email:");
		String email = scanner.nextLine();
		System.out.println("Enter Your Password");
		String pass = scanner.nextLine();
		if(studentService.validateStudent(email, pass)) {
			checkClasses(email, pass);
			return;
		} else {
			System.out.println("Your combination could not be verified, returning to main menu.\n");
		}
	}
	
	// 2nd menu: logged in as valid student
	private static void checkClasses(String email, String pass) {
		String input = "";
		int choice = -1;
		while(true) {
			printAllClasses(email);
			System.out.print("1. Register to Class\n2. Logout\n");
			input = scanner.nextLine();
			if(!input.matches("\\d+")) {
				System.out.println("Not an option. Please, enter 1 or 2.");
				continue;
			}
			choice = Integer.parseInt(input.replaceAll("\\D+", ""));
			switch(choice) {
			case 1:
				registerToClass(email, pass);
				break;
			case 2:
				System.out.println("You have been signed out.");
				return;
			default:
				System.out.println("Not an option. Please, enter 1 or 2.");
				break;
			}
			
		}
	}
	
	// 3rd menu: registering for classes
	private static void registerToClass(String email, String pass) {
		System.out.println("All courses:");
		System.out.printf("%-2s %-30s %30s%n", "ID", "COURSE NAME", "INSTRUCTOR NAME");
		courseService.getAllCourses().forEach(c -> System.out.printf("%-2d %-30s %30s%n", c.getCid(), c.getcName(), c.getcInstructorName()));
		String input = "";
		int choice = -1;
		while(true) {
			System.out.println("\nWhich Course?");
			input = scanner.nextLine();
			if(!input.matches("\\d+")) {
				System.out.println("Not an option. Please, enter an existing course.");
				continue;
			}
			choice = Integer.parseInt(input.replaceAll("\\D+", ""));
			break;
		}
		studentService.registerStudentToCourse(email, choice);
	}
	
	// helper method to print student classes
	private static void printAllClasses(String email) {
		System.out.println("My Classes:");
		System.out.printf("%-2s %-30s %30s%n", "#", "COURSE NAME", "INTRUCTOR NAME");
		studentService.getStudentCourses(email).forEach(c -> System.out.printf("%-2s %-30s %30s%n", c.getCid(), c.getcName(), c.getcInstructorName()));
		System.out.println();
	}
	
}
