package week8EmployeeAppJpa.main;

import java.sql.SQLException;

import week8EmployeeAppJpa.entity.Department;
import week8EmployeeAppJpa.entity.Teacher;
import week8EmployeeAppJpa.entity.abstractEmp;

public class TeacherApp extends abstractEmp{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		testCreateDepartment();
		testTeacherDepartmentManytoOne();
	}

	private static void testTeacherDepartmentManytoOne() throws SQLException {
		// TODO Auto-generated method stub
		connect();
		Department department = em.find(Department.class, 1);
		em.getTransaction().begin();
		em.persist(new Teacher(2, "Sam", 1000.00, department));
		em.getTransaction().commit();
		disconnect();
		
	}

	private static void testCreateDepartment() throws SQLException {
		// TODO Auto-generated method stub
		
		connect();
		em.getTransaction().begin();
		em.persist(new Department(1, "Developer"));
		em.getTransaction().commit();
		disconnect();
	}

}
