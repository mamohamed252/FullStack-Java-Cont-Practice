package jpa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import jpa.entitymodels.Course;
import jpa.service.CourseService;

class CourseServiceTest {

	static CourseService courseService = new CourseService();
	
	@Test
	void testGetAllCourses() {
		List<Course> expectedCourses = Arrays.asList(
			new Course(1, "English", "Anderea Scamaden"),
			new Course(2, "Mathematics", "Eustace Niemetz"),
			new Course(3, "Anatomy", "Reynolds Pastor"),
			new Course(4, "Organic Chemistry", "Odessa Belcher"),
			new Course(5, "Physics", "Dani Swallow"),
			new Course(6, "Digital Logic", "Glenden Reilingen"),
			new Course(7, "Object Oriented Programming", "Giselle Ardy"),
			new Course(8, "Data Structures", "Carolan Stoller"),
			new Course(9, "Politics", "Carmita De Maine"),
			new Course(10, "Art", "Kingsly Doxsey")
		);
		
		List<Course> actualCourses = courseService.getAllCourses();
		
		assertEquals(expectedCourses, actualCourses);
	}

}
