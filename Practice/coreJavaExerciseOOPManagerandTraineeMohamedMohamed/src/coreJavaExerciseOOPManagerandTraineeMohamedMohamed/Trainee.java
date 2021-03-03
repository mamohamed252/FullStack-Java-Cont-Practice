package coreJavaExerciseOOPManagerandTraineeMohamedMohamed;

public class Trainee extends Employee{
	
		// default constructor
		public Trainee() {
		}
		
		//overloaded constructor
		public Trainee(long id, String name, String address, long phone, double salary) {
			this.employeeId = id;
			this.employeeName = name;
			this.employeeAddress = address;
			this.employeePhone = phone;
			this.basicSalary = salary;
		}
		

}
