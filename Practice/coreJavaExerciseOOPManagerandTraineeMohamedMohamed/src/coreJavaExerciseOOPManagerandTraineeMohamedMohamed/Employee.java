package coreJavaExerciseOOPManagerandTraineeMohamedMohamed;

public class Employee {

	// properties
	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance;
	public double hra;

	// default constructor
	public Employee() {

	}

	// overloaded constructor
	public Employee(long id, String name, String address, long phone) {

		this.employeeId = id;
		this.employeeName = name;
		this.employeeAddress = address;
		this.employeePhone = phone;
	}


	public void calculateSalary() {
		// default value for hra
		double hra = 250.80;
		// default value for specialAllowance
		double specialAllowance = 1000.50;
		double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
		System.out.println("Id: " + employeeId + ", Name: "
				+ employeeName + ", Address: " + employeeAddress + ", Phone: " + employeePhone);
		System.out.println("Your salary is: $" + salary);
	}
	
	public void calculateTransportAllowance() { 	
		double transportAllowance = 0.1 * this.basicSalary;
		System.out.println("Your tranport allowance is: $" +  transportAllowance);
	}

	// getters and setters
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}




}
