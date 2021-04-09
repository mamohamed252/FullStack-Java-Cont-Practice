package jpa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import jpa.entitymodels.Student;
import jpa.service.StudentService;

class StudentServiceTest {
	
	static StudentService studentService = new StudentService();

	@Test
	void testGetStudentByEmail() {
		Student expectedStudent = new Student("aiannitti7@is.gd", "Alexandra Iannitti", "TWP4hf5j", null);
		expectedStudent.setsCourses(studentService.getStudentByEmail("aiannitti7@is.gd").getsCourses());
		Student actualStudent = studentService.getStudentByEmail("aiannitti7@is.gd");
		assertEquals(expectedStudent, actualStudent);
	}

	@Test
	void testValidateStudent() {
		assertTrue(studentService.validateStudent("aiannitti7@is.gd", "TWP4hf5j"));
	}

}
