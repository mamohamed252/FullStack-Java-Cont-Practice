package week6OOPSample.models;

public class Person {

		// properties
		
		private String name;
		private int age;
		private String company;
		private String job;
		private String hobby;
		
		// constructor
		public Person() {
			
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getCompany() {
			return company;
		}

		public void setCompany(String company) {
			this.company = company;
		}

		public String getJob() {
			return job;
		}

		public void setJob(String job) {
			this.job = job;
		}

		public String getHobby() {
			return hobby;
		}

		public void setHobby(String hobby) {
			this.hobby = hobby;
		}

		//methods
		public void talkAboutYourself() {
			System.out.println("Hi, I'm " + name + ".");
			System.out.println("I'm " + age + " years old");
			System.out.println("I work at " + company + " as a " + job + ".");
			System.out.println("When I get some free time. I like to " + hobby + ".");
			
		}
	}


