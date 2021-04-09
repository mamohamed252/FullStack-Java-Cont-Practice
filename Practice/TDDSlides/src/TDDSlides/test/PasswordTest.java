package TDDSlides.test;



import org.junit.Assert;
import org.junit.Test;

import TDDSlides.mainRunner.PasswordValidator;


public class PasswordTest {
	
	// password length check min = 5 and max = 10
	@Test
	public void passwordLength() {
		PasswordValidator pv = new PasswordValidator();
		Assert.assertEquals(true, pv.isValid("Bably"));
	}
	
	
}
