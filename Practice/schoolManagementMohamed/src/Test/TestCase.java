package Test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import jpa.service.StudentService;

class TestCase {


	@Test
	void testValidateStudent() {
		// testing if email and pass are in database, expected true if email and pass are stored
		String email = "cjaulme9@bing.com";
		String pass = "FnVklVgC6r6";
		assertTrue(new StudentService().validateStudent(email, pass));
	}

}
