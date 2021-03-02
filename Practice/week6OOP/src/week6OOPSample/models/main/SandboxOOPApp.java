package week6OOPSample.models.main;

import week6OOPSample.models.Person;

public class SandboxOOPApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person mike = new Person();
//		mike.name = "Mike";
//		mike.age = 22;
//		mike.company = "Per Scholas";
//		mike.job = "Technical Instructor";
//		mike.hobby = "learn about Financial Engineering";
		
		mike.setName("Mike");
		mike.setAge(22);
		mike.setCompany("Per Scholas");
		mike.setJob("student");
		mike.setJob("learn about Financial Engineering");
		mike.talkAboutYourself(); // also i think these previews wont show up since theyre in different packages, could be wrong
	}

}
