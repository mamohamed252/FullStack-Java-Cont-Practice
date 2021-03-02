package bodyMassEx;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bodyMassIndex();
		switchCaseToIfElse();
	}

	public static void bodyMassIndex() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter BMI: ");
		double bmi = sc.nextDouble();

		if(bmi < 18.5) {
			System.out.println("Underweight");
		}else if(bmi <=  18.5 && bmi < 25.0) {
			System.out.println("Normal");
		}else if(bmi <= 25.0 && bmi < 30.0) {
			System.out.println("Overweight");
		}else{
			System.out.println("Obese");
		}
		sc.close();
	}

	public static String switchCaseToIfElse() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter single letter: ");
		
		String userInput = sc.nextLine().toLowerCase();
		
		
		if(userInput.equals("a")) {
			System.out.println(userInput + " result 1");
		}else if(userInput.equals("b")) {
			System.out.println(userInput + " result 2");
		}
		
		return userInput;
	}

}