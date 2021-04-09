package week8EmployeeAppJpa.entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class abstractEmp {
//	private final String url = "jdbc:mariadb://localhost:3306/users";
//	private final String user = "root";
//	private final String password = "root";
	
	final String PERSISTENCEUNITNAME = "JPAExample";
	protected EntityManagerFactory emf = null;
	protected EntityManager em = null;
	
//	protected Connection con = null;
//	protected PreparedStatement ps = null;
//	protected ResultSet rs = null;
	public void connect() throws SQLException {
		emf = Persistence.createEntityManagerFactory(PERSISTENCEUNITNAME);
		em = emf.createEntityManager();
		System.out.println("you are connected");
	}
	
	
	public void disconnect() throws SQLException {
		if(em != null) {
			em.close();
		}
		if(emf != null) {
			emf.close();
		}	
	}
}
