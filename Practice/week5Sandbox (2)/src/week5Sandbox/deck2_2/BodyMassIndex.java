package week5Sandbox.deck2_2;

import java.util.Scanner;

/*
PROBLEM: Calculate Body Mass Index:
Body Mass Index (BMI) is a measure of health on weight.
It is calculated by taking an individual’s weight in kilograms and dividing by the square of their height in meters. 
The interpretation of BMI for people 16 years or older is as follows:
  
  BMI < 18.5         ==> Underweight
  18.5 <= BMI < 25.0 ==> Normal
  25.0 <= BMI < 30.0 ==> Overweight
  30.0 <= BMI        ==> Obese 

 */

/* SOLUTION:
 * 
 * 1. OUTPUT
 * 		- Print the interpretation base on the input: BMI 
 * 2. INPUT
 * 		- Input: BMI (double)
 * 3. PROCESS
 * 		- Compute the interpretation based on on the BMI table
 * 
 *  
 */


public class BodyMassIndex {

	public static void main(String[] args) {
		
		String message = "";
		
		// input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter BMI: ");
		double bmi = keyboard.nextDouble();
		
		// process
		
		// solution #1
		if (bmi < 18.5) {
			message = "Underweight";
		} else if (bmi < 25.0) {    //(18.5 <= bmi) && (bmi < 25.0)
			message = "Normal";
			
		} else if (bmi < 30.0) {   //(25.0 <= bmi) && (bmi < 30.0) 
			message = "Overweight";
		} else {
			message = "Obese";
		}
		
/*		
		// solution #2
		message = "Underweight";
		
		if ((18.5 <= bmi) && (bmi < 25.0)) {    //(18.5 <= bmi) && (bmi < 25.0)
			message = "Normal";
			
		} else if (bmi < 30.0) {   //(25.0 <= bmi) && (bmi < 30.0) 
			message = "Overweight";
		} else {
			message = "Obese";
		}
		
*/		
		
		
		
		
		// output
		System.out.println(message);
		
		keyboard.close();
		
	}

}
