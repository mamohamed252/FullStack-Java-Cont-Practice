package jpa.dao;

import java.sql.SQLException;
import java.util.List;

import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public interface StudentDAO {
	
	
	
	//get student using the id - email 
	public Student getStudentByEmail(String sEmail);
	//get all students
	public List<Student> getAllStudents();
	// register student to course
	public boolean validateStudent(String sEmail, String sPassword);
	
	public void registerStudentToCourse(String sEmail, int cId);
	
	// getStudentCourse
	public List<Course> getStudentCourses(String sEmail) throws SQLException;
}		
