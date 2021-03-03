package coreJavaExerciseOOPManagerandTraineeMohamedMohamed;

public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager firstManager = new Manager();
		firstManager.employeeId = 126534;
		firstManager.employeeName = "Peter";
		firstManager.employeeAddress = "Chennai India";
		firstManager.employeePhone = 237844;
		firstManager.basicSalary = 65000;
		firstManager.calculateSalary();
		firstManager.calculateTransportAllowance();
		

		Trainee firstTrainee = new Trainee();
		firstTrainee.employeeId = 29846;
		firstTrainee.employeeName = "Jack";
		firstTrainee.employeeAddress = "Mumbai India";
		firstTrainee.employeePhone = 442085;
		firstTrainee.basicSalary = 45000;
		firstTrainee.calculateSalary();
		firstTrainee.calculateTransportAllowance();
		
	}

}
