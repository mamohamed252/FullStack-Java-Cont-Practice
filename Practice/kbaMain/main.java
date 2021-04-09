package week8Review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
	
	/*
	 * KBA- JDBC/ORM/Unit Testing
JDBC Definition and  Requirements
JDBC Driver
JDBC Statement
JDBC Connection
JDBC ResultSet
JDBC vs JPA
Relationship between ORM, JPA, and EclipseLink
ExecuteQuery vs ExecuteUpdate
Statement vs PreparedStatement
JPA EntityManagerFactory
JPA EntityManager
JPA Entity
JPA Entity?
JUnit Definition 
Test protected methods
Parameterized tests
assertEquals() 

	 */

	public static void main(String[] args) {
		sample1();
		sample2();
	}
	private static void sample1() throws SQLException, ClassNotFoundException {

			 /* You can ignore this block and assuming the connection was successful*/ 
			Class.forName("org.mariadb.jdbc.Driver");
			Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/", "root", "password");
			 /*------------------------*/ 
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("show databases"); 
			//while (rs.next() == true) {
			 System.out.println(rs.getString(0)); 
			//}


	}
	public static class Driver {
		
		public static void main(String[] args) throws Exception {
			/* You can ignore this block and assume the connection was successful*/
			Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/mydatabase", "root", "password"); 
			Statement stmt = conn.createStatement();
			/*------------------------*/ 

			String createTable = "CREATE TABLE IF NOT EXISTS USERS(" + "ID INT NOT NULL," + "NAME VARCHAR(200))"; 
			stmt.executeUpdate(createTable); 
			String insertData = "INSERT INTO USERS VALUES " + "(0,Amy)," + "(1,Dustin)," + "(2,Connor)"; 
			System.out.println(stmt.executeUpdate(insertData) );
		}
		
	}
	public class main {
		private static EntityManagerFactory emf;
		public static void main(String[] args) { 
			emf= Persistence.createEntityManagerFactory("JPAExample"); 
			EntityManager em = emf.createEntityManager(); 
			em.getTransaction().begin();
			em.persist(new Employee("1","Derek"));
			em.persist(new Employee("1","Brandon"));
			em.persist(new Employee("1","Hocine"));
			em.getTransaction().commit();
			Query query = em.createQuery("select e from Employee e");
			List list= query .getResultList();
			for (Employee e : list) { 
				System.out.println(e.id+":"+e.name);
			}
			em.close();
		}
	}
	@Entity
	@Table(name = "Employee")
	public class Employee {
		@Id 
		@Column(name = "id") 
		String id; 
		@Column(name = "name") 
		String name;
		public Employee(String id, String name) { 
			this.id = id; 
			this.name = name;
		}
		public Employee() {}
	} 
class Addition {
	public int add(int x, int y) { return x + y;
	}
} 

public class AdditionTests {
	private final Addition addition = new Addition();

	@Test
	void additionTest() {
		System.out.println("Test started");
		assertEquals(60, addition.add(11, 11));
		System.out.println("Test completed");
	}
}
	class Addition {
		public int additionOfNumbers(int x, int y) {
			return x + y;
		}
	}

	public class additionTests {
		private final Addition addition = new Addition();
		// @BeforeAll is interchangeable with JUnit 4’s @BeforeClass

		@BeforeAll
		public void beforeAll() {
			System.out.println("beforeAll/beforeClass Finished");
		}

		@Test
		public void additionTest1() {
			assertEquals(4, addition.additionOfNumbers(2, 2));
			System.out.println("additionTest Finished");
		}
	}










