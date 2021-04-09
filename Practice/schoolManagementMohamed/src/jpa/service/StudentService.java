package jpa.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import jpa.dao.StudentDAO;
import jpa.dao.abstractConnecetionMDB;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService extends abstractConnecetionMDB implements StudentDAO {

	@Override
	public Student getStudentByEmail(String sEmail) {
		try {
			connect();
			Student student = null;
			student = em.find(Student.class, sEmail);
			return student;
		} catch (Exception e) {
			return null;
		} finally {
			this.disconnect();
		}
	}

	@Override
	public List<Student> getAllStudents() {
		try {
			connect();
			List<Student> allStudents = new ArrayList<Student>();
			Query query = em.createQuery("SELECT s FROM Student s");// JPQL
			allStudents = query.getResultList();
			return allStudents;

		} catch (Exception e) {
			System.out.println("no students");
			return null;
		} finally {
			this.disconnect();
		}
	}

	@Override
	public boolean validateStudent(String sEmail, String sPassword) {
		connect();
		List<Student> students = new ArrayList<Student>();
		Query query = em.createNamedQuery("checkStudent");
		query.setParameter("sEmail", sEmail);
		query.setParameter("sPass", sPassword);
		students = query.getResultList();

		if (students.isEmpty()) {
			disconnect();
			return false;
		} else {
			disconnect();
		}
		return true;
	}

	@Override
	public void registerStudentToCourse(String sEmail, int cId) {
		// TODO Auto-generated method stub
		// Get student object
		// get student course list
		// add courses to list
		// if you can't connect return null

		Student getStudent = null;
		Course addCourse = null;
		connect();
		try {
			
			String query = "SELECT * FROM schoolmanagement.student_course WHERE Student_email =? AND sCourses_id =?";
			em.createNativeQuery(query).setParameter(1, sEmail);
			em.createNativeQuery(query).setParameter(2, cId);
			boolean check = em.createNativeQuery(query).getResultList().isEmpty();
			getStudent = em.find(Student.class, sEmail);
			
			if (getStudent != null) {
				addCourse = em.find(Course.class, cId);
				if (!check) {
					disconnect();
				return;
				}
				em.getTransaction().begin();
				getStudent.getsCourses().add(addCourse);
				em.getTransaction().commit();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}

	}

	@Override
	public List<Course> getStudentCourses(String sEmail) {
		Student student = null;
		List<Course> foundStudents = null;
		connect();
		try {
			student = em.find(Student.class, sEmail);
			foundStudents = student.getsCourses();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			disconnect();
		}
		return foundStudents;
	}
}
