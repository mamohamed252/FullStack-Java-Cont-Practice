package extra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import jpa.dao.AbstractDAO;
import jpa.service.CourseService;
import jpa.service.StudentService;
/**
 * This class was not part of the original specs, but I figured it would be helpful to include.
 * This class simply adds a few more questions to ask the user if they would like to load the
 * given SQL files that I also included into this project. The prompts also ask for JDBC
 * credentials, as it generates a database named "sms" in your database program of choice.
 * If using this class, make sure to change the persistence.xml for your specifications.
 * Otherwise, you can simply comment/delete the first line in the main function in 
 * SMSRunner.java and the program will continue to work just fine.
 * 
 * @author Samuel Uganiza
 *
 */
public class DatabaseInitializer extends AbstractDAO {
	
	// initial prompt menu
	public static void checkDB(Scanner scanner) {
		System.out.println("Would you like to load the database using the given SQL files?");
		System.out.println("1. Yes, (re)create the database using fresh values.");
		System.out.println("2. No, continue to the program.");
		String input = "";
		int choice = -1;
		while(true) {
			input = scanner.nextLine();
			if(!input.matches("\\d+")) {
				System.out.println("Not an option. Please, enter 1 or 2.");
				continue;
			}
			choice = Integer.parseInt(input.replaceAll("\\D+", ""));
			switch(choice) {
			case 1:
				System.out.println("Loading database...");
				if(loadDB(scanner) && createTables() && loadTables()) {
					closeJDBC();
					System.out.println("Database loaded successfully, proceeding to program.");
					return;
				}
				System.out.println("There was an error in loading the database.");
			case 2:
				System.out.println("Proceeding to program without loading database.");
				return;
			default:
				System.out.println("Not an option. Please, enter 1 or 2.");
				break;
			}
		}
	}
	
	// attempts to create the database if it does not yet exist
	private static boolean loadDB(Scanner scanner) {
		while(true) {
			int databaseType = -1;
			while(true) {
				System.out.print("What database do you use?\n1. MariaDB\n2. MySQL\n");
				String input = scanner.nextLine();
				if(!input.matches("\\d+")) {
					System.out.println("Not an option. Please, enter 1 or 2.");
					continue;
				}
				databaseType = Integer.parseInt(input.replaceAll("\\D+", ""));
				if(databaseType == 1 || databaseType == 2) {
					break;
				} else {
					System.out.println("Not an option. Please, enter 1 or 2.");
				}
			}
			System.out.println("Please enter your database username.");
			String user = scanner.nextLine();
			System.out.println("Please enter your database password.");
			String pass = scanner.nextLine();
			if(startJDBC(databaseType, user, pass)) return true;
			while(true) {
				System.out.print("Continue trying?\n1. Yes\n2. No\n");
				String input = scanner.nextLine();
				if(!input.matches("\\d+")) {
					System.out.println("Not an option. Please, enter 1 or 2.");
					continue;
				}
				int choice = Integer.parseInt(input.replaceAll("\\D+", ""));
				if(choice == 1) break;
				return false;
			}
		}
	}
	
	// creates the tables using JDBC
	private static boolean createTables() {
		return (new CourseService().createTable() && new StudentService().createTable());
	}
	
	// reads each included .sql file and runs the SQL queries they contain
	private static boolean loadTables() {
		try {
			BufferedReader buffer = new BufferedReader(new FileReader("./resources/sql/Student.sql"));
			String query;
			while((query = buffer.readLine()) != null) runQuery(query);
			buffer.close();
			buffer = new BufferedReader(new FileReader("./resources/sql/Course.sql"));
			while((query = buffer.readLine()) != null) runQuery(query);
			buffer.close();
			return true;
		} catch(Exception e) {
			System.out.println("Unexpected error while reading in files.");
			e.printStackTrace();
		}
		return false;
	}
}
