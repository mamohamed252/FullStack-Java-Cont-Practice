package jpa.mainrunner;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	private static StudentService studentService = new StudentService();

	private static CourseService courseService = new CourseService();
	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {

		int option = 0;
		while (true) {
			menu();
			System.out.println("select menu:");
			try {
				option = reader.nextInt();
				if (option > 2 || option <1) {
					// catching numbers greater than 2 or less than 1
					System.out.println("Please enter an integer 1 or 2");	
				}
			} catch (InputMismatchException e) {
				// catching letters and other characters not an integer
				System.out.println("Please enter an integer 1 or 2");
				reader.nextLine();
				continue;
			}
			reader.nextLine();
			switch (option) {
			case 1:
				getStudentByEmail();
				break;
			case 2:
				// closing scanner to stop a memory leak
				reader.close();
				Quit();
				return;
			}
		}
	
	}

	private static boolean registerStudent(String email) {
		

		Integer op = 0;
		while (true) {
			registerMenu();
			try {
				op = reader.nextInt();
				reader.nextLine();
				if (op == 1 || op == 2) {
					break;
				} else {
					// catching all number that are not 1 or 2
					System.out.println("Please enter a enter a valid integer 1 or 2");
				}
			} catch (InputMismatchException e) {
				// catching letters and other characters not an integer
				reader.nextLine();
				System.out.println("Please enter a enter a valid integer 1 or 2");
			}
		}
		switch (op) {
		case 1:
			System.out.printf("All Courses:\n%-10s %-40s %-20s\n", "ID", "Course Name", "Instructor Name");
			courseService.getAllCourses().forEach(courses -> System.out.printf("%-10d %-40s %-20s\n", courses.getcId(),
					courses.getcName(), courses.getcInstructorName()));
			System.out.println("Which Course?");
			Integer courseOption = -1;
			while (true) {
				try {
					courseOption = reader.nextInt();
					reader.nextLine();
					if (courseOption > 0 && courseOption < 11) {
						break;
					} else {
						// catching numbers greater than 11 or less than 0
						System.out.println("Please enter a valid integer 1 - 10 to register for course");
					}
				} catch (InputMismatchException e) {
					// catching letters and other characters not an integer
					reader.nextLine();
					System.out.println("Please enter a valid integer 1 - 10");
				}
			}
			studentService.registerStudentToCourse(email, courseOption);
			return true;
		case 2:
		default:
			// will go to return false on switch case and trigger logout == false
			return false;
		}
	}

	private static void Quit() {
		System.out.println("Thank you. Application Quit");

	}

	private static void getStudentByEmail() {
		boolean flag = false;
		System.out.println("Enter Student Email:");
		// sets email all to lower-case to avoid case mismatch
		String email = reader.nextLine().toLowerCase();

		System.out.println("Enter Student Password");
		// sets password to all lower-case for db to read better
		String password = reader.nextLine().toLowerCase();
		flag = studentService.validateStudent(email, password);
		if (flag) {
			while (true) {
				System.out.printf("My class:\n%-10s %-40s %-20s\n", "#", "Course Name", "Instructor Name");
				studentService.getStudentCourses(email).forEach(courses -> System.out.printf("%-10d %-40s %-20s\n",
						courses.getcId(), courses.getcName(), courses.getcInstructorName()));
				boolean logout = registerStudent(email);
				if (logout == false) {
					System.out.println("You have been signed out.");
					break;
				} else {
					continue;
				}

			}

		} else {
			System.out.println("Wrong Credentials");
		}

	}

	public static void registerMenu() {
		System.out.println("1. Register to class");
		System.out.println("2. Logout");

	}

	public static void menu() {
		System.out.println("Are you a(n):");
		System.out.println("1. Student");
		System.out.println("2. Quit");

	}

}
