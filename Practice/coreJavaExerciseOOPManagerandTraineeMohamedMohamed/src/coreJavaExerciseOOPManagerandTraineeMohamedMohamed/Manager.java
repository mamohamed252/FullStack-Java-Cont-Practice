package coreJavaExerciseOOPManagerandTraineeMohamedMohamed;

public class Manager extends Employee{

	// default constructor
	public Manager() {	
	}

	//overloaded constructor
	public Manager(long id, String name, String address, long phone, double salary) {
		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
		this.basicSalary = salary;
	}

	@Override
	public void calculateTransportAllowance() {
		double transportAllowance = (15 * this.basicSalary) / 100;
		System.out.println("Your tranport allowance is: $" +  transportAllowance);
	}
}
