package jpa.service;

import java.util.List;

import jpa.dao.AbstractDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService extends AbstractDAO implements StudentDAO {

	/**
	 * This method reads the student table in your database and returns the data as
	 * a List<Student>
	 */
	@Override
	public List<Student> getAllStudents() {
		List<Student> students = null;
		if(connect()) {
			students = em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
		}
		dispose();
		return students;
	}

	/**
	 * This method takes a Student’s email as a String and parses the student list
	 * for a Student with that email and returns a Student Object.
	 */
	@Override
	public Student getStudentByEmail(String sEmail) {
		if(sEmail == null) return null;
		Student student = null;
		if(connect()) {
			student = em.find(Student.class, sEmail);
		}
		dispose();
		return student;
	}

	/**
	 * This method takes two parameters: the first one is the user email and the
	 * second one is the password from the user input. Return whether or not student
	 * was found.
	 */
	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		if(sEmail == null || sPassword == null) return false;
		if(connect()) {
			Student student = em.find(Student.class, sEmail);
			if(student == null) return false;
			if(student.getsPass().equals(sPassword)) return true;
		}
		dispose();
		return false;
	}

	/**
	 * After a successful student validation, this method takes a Student’s email
	 * and a Course ID. It checks in the join table (i.e. Student_Course) generated
	 * by JPA to find if a Student with that Email is currently attending a Course
	 * with that ID. If the Student is not attending that Course, register the
	 * student to that course; otherwise not.
	 */
	@Override
	public void registerStudentToCourse(String sEmail, int cid) {
		if(connect()) {
			String query = "SELECT * FROM sms.student_course sc WHERE Student_email = ? AND sCourses_id = ?";
			if(em.createNativeQuery(query).setParameter(1, sEmail).setParameter(2, cid).getResultList().isEmpty()) {
				em.getTransaction().begin();
				Course course = em.find(Course.class, cid);
				Student student = em.find(Student.class, sEmail);
				if(course != null && student != null) student.getsCourses().add(course);
				em.getTransaction().commit();
			}
		}
		dispose();
		return;
	}

	/**
	 * This method takes a Student’s Email as a parameter and would find all the
	 * courses a student is registered.
	 */
	@Override
	public List<Course> getStudentCourses(String sEmail) {
		if(sEmail == null) return null;
		if(connect()) {
			Student student = em.find(Student.class, sEmail);
			dispose();
			return student.getsCourses();
		}
		return null;
	}
	
	// extra method to instantiate the tables, not called anywhere outside of DatabaseInitializer
	public boolean createTable() {
		if(connect()) {
			em.getTransaction().begin();
			em.getTransaction().commit();
			dispose();
			return true;
		}
		return false;
	}
}
