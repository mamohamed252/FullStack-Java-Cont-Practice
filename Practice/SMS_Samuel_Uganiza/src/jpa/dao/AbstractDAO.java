package jpa.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractDAO {
	
	// JPA variables
	
	private final String PERSISTENCE_UNIT_NAME = "SMS_Samuel_Uganiza";
	protected EntityManagerFactory emf = null;
	protected EntityManager em = null;
	
	// JDBC variables
	
	private static Connection connection;
	private static Statement statement;
	
	// JPA connect methods
	
	public boolean connect() {
		try {
			emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
			em = emf.createEntityManager();
			return true;
		
		// moved all error checking to connect method to reduce lines in service implementations
		} catch(Exception e) {
			System.out.println("Please make sure you have configured the persistence.xml file with");
			System.out.println("your database details and that your database program is running.");
			//e.printStackTrace();
		}
		return false;
	}
	
	public void dispose() {
		if(em != null && em.isOpen()) em.close();
		if(emf != null && emf.isOpen()) emf.close();
	}
	
	// JDBC database initializer methods
	
	public static boolean startJDBC(int databaseType, String user, String pass) {
		try {
			// 1. mariadb
			// 2. mysql
			String dbUrl;
			if(databaseType == 1) {
				DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
				dbUrl =  "jdbc:mariadb://localhost:3306/";
			} else {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				dbUrl = "jdbc:mysql://localhost:3306/";
			}
			connection = DriverManager.getConnection(dbUrl, user, pass);
			statement = connection.createStatement();
			statement.execute("CREATE database IF NOT EXISTS sms");
			statement.execute("USE sms");
			return true;
		} catch(Exception e) {
			System.out.println("Please make sure you have configured the persistence.xml file with");
			System.out.println("your database details and that your database program is running.");
			//e.printStackTrace();
		}
		return false;
	}
	
	public static void closeJDBC() {
		try {
			if(statement != null) statement.close();
			if(connection != null) connection.close();
		} catch(Exception e) {
			System.out.println("Error found when attempting to close JDBC connections.");
			//e.printStackTrace();
		}
	}
	
	public static void runQuery(String query) {
		try {
			statement = connection.createStatement();
			statement.execute(query);
		} catch(Exception e) {
			System.out.println("Duplicate entry found, ignored query: " + query);
			//e.printStackTrace();
		}
	}
}