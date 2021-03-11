package week5SandboxBrandonSample.deck2;

import java.util.Scanner;


public class SampleSlide10 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);  // Token
		
		System.out.print("Enter a double value: ");

		double d = input.nextDouble();  // is used to input doubles
	
		System.out.print("Enter a int value: ");
		int n = input.nextInt();      //  55  (enter)
		String x = input.nextLine();
		
		//int number = // convert n to an number 
		
		input.nextLine();
		
		System.out.print("Enter a your name:: ");
		
		String name = input.nextLine();
		
		System.out.println("this is the value entered");
		System.out.println(d);
		
		System.out.println("this is the second value entered");
		System.out.println(n);

		System.out.println("this is name entered");
		System.out.println(name);
		
		
		
	}

}
