package jpa.service;

import java.util.List;

import jpa.dao.AbstractDAO;
import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService extends AbstractDAO implements CourseDAO {
	
	/**
	 * This method takes no parameter and returns every Course in the table.
	 */
	@Override
	public List<Course> getAllCourses() {
		List<Course> courses = null;
		if(connect()) {
			courses = em.createQuery("SELECT c FROM Course c", Course.class).getResultList();
		}
		dispose();
		return courses;
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
