package week8EmployeeAppJpa.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import week8EmployeeAppJpa.entity.Employee;
import week8EmployeeAppJpa.entity.abstractEmp;

public class EmployeeDaoServices extends abstractEmp implements EmployeeDAOint {
//	String url = "jdbc:mariadb://localhost:3306/users";
//	String user = "root";
//	String password = "root";
//	
//	public Connection connect() throws SQLException {
//		Connection connection = DriverManager.getConnection(url, user, password);
//		connection.setAutoCommit(true);
//		return connection;
//	}
	// queries
//	enum SQL{
//		//create queries constants
//		INSERT_USER("insert into employees (name,email,country) values (?, ?, ?);"),
//		GET_ALL_USERS("select * from employees;"),
//		GET_USER_BY_ID("select * from employees where id  = ?;"),
//		UPDATE_USER("update employees set  name = ?,email = ?,country = ? where id = ?;"),
//		REMOVE_USER("delete from employees where id = ?;");
//		private final String query;
//		private SQL(String s) {
//			this.query = s;
//		}
//		public String getQuery() {
//			return query;
//		}
//	}

	@Override
	public boolean insertEmployee(Employee employee) {
		// INSERT EMPLOYEE TO TEH DATA BASE
		try {
			this.connect();
//			ps = con.prepareStatement(SQL.INSERT_USER.getQuery());
//			ps.setString(1, employee.getName());
//			ps.setString(2, employee.getEmail());
//			ps.setString(3, employee.getCountry());
//			ps.executeUpdate();

			em.getTransaction().begin();
			em.persist(employee);
			em.getTransaction().commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			try {
				this.disconnect();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 1. connect - create entityManagerFactoy & entityManager
		// 2. execute
		// 3. close

	}

	@Override
	public Employee getEmployeeById(int id) {
		// get employee using id

		try {
			this.connect();
			Employee employee = null;
			employee = em.find(Employee.class, id);
			return employee;
		} catch (Exception e) {
			return null;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Employee> getAllEmployees() {
		// get all employees
		try {
			this.connect();
			List<Employee> employees = new ArrayList<Employee>();
			Query query = em.createQuery("SELECT e FROM Employee e");//JPQL
			employees = query.getResultList();
			return employees;

		} catch (Exception e) {
			System.out.println("no employees");
			return null;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean updateEmployee(int id, Employee employee) {
		// update employee
		try {
			this.connect();
			em.getTransaction().begin();
			Employee foundEmployee = em.find(Employee.class, id);
			foundEmployee.setName(employee.getName());
			foundEmployee.setEmail(employee.getEmail());
			foundEmployee.setCountry(employee.getCountry());
			em.persist(foundEmployee);
			em.getTransaction().commit();
			return true;
		}

		catch (Exception e) {
			return false;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean removeEmployee(int id) {
		// delete employee
		try {
			this.connect();
			em.getTransaction().begin();

			Employee removeSearch = em.find(Employee.class, id);
			em.remove(removeSearch);
			em.getTransaction().commit();
			return true;
		}

		catch (Exception e) {
			return false;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Employee> getAllEmployeesByNameQuery(String name) {
		try {
			this.connect();
			List<Employee> employees = new ArrayList<Employee>();
			Query query = em.createNamedQuery("getEmployeeByName");
			query.setParameter("empName", name);
			employees = query.getResultList();
			return employees;

		} catch (Exception e) {
			System.out.println("no employees");
			return null;
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
