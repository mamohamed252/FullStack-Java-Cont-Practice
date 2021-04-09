package week8EmployeeAppJpa.main;

import java.sql.SQLException;

import week8EmployeeAppJpa.entity.NonTeachingStaff;
import week8EmployeeAppJpa.entity.Staff;
import week8EmployeeAppJpa.entity.TeachingStaff;
import week8EmployeeAppJpa.entity.abstractEmp;

public class StaffAppSingleTable extends abstractEmp{

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		testRegisterStaff();
	}

	private static void testRegisterStaff() throws SQLException {
		// TODO Auto-generated method stub
		//1. connect
		//2. Transaction
		//3. Disconnect
		connect();
		
		Staff staff = new Staff(1,"Mohamed");
		TeachingStaff teachingstaff = new TeachingStaff(5, "Kevin", "Dave", "PM");
		NonTeachingStaff nonTeach = new NonTeachingStaff(6, "test", "Testing");
		
		em.getTransaction().begin();
		em.persist(staff);
		em.persist(teachingstaff);
		em.persist(teachingstaff);
		em.getTransaction().commit();
		
		disconnect();
		
	}

}
