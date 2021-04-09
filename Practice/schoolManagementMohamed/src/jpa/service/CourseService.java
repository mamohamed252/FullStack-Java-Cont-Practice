package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import jpa.dao.CourseDAO;
import jpa.dao.abstractConnecetionMDB;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class CourseService extends abstractConnecetionMDB implements CourseDAO{

	@Override
	public List<Course> getAllCourses() {
		try {
			connect();
			List<Course> getallCourses = new ArrayList<Course>();
			Query query = em.createQuery("SELECT c FROM Course c");// JPQL
			getallCourses = query.getResultList();
			return getallCourses;

		} catch (Exception e) {
			System.out.println("no courses");
			return null;
		} finally {
			disconnect();
		}
	}
}
