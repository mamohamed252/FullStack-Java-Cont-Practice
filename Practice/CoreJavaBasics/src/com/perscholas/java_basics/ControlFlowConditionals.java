package com.perscholas.java_basics;

import java.util.Scanner;

public class ControlFlowConditionals {

	public static void main(String[] args) {
		part1();
		part2();
		part3();
		part4();
		part5();
		part6();
	}

	//part1
	private static void part1() {
		int x = 7;
		if (x < 10) {
			System.out.println("Less than 10");
		} 
		x = 15;
		if ( x < 10) {
			System.out.println("Less than 10");
		};
		
	}
	
	//part2
	private static void part2() {
		int x = 7;
		//x = 15;
		if (x < 10) {
			System.out.println("part 2: Less than 10");
		} else {
			System.out.println("Part 2: Greater than 10");
		}
	}
	
	//part3
	private static void part3() {
		int x = 15;
		if (x < 10) {
			System.out.println("Part 3: Less than 10");
		}else if (x > 10 && x < 20){
			System.out.println("Part 3: Between 10 and 20");
		}else {
			System.out.println("Part 3: Greater than 20");
		}
	}
	
	//part4
	private static void part4() {
		int x = 10;
		if (x < 10 || x > 20) {
			System.out.println("Part 4: Out of Range");
		}else if (x >= 10 && x <= 20){
			System.out.println("Part 4: In Range");
		}
	}
	
	//part5
	private static void part5() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter in Grade number: ");
		int grade = scn.nextInt();
		if (grade >= 90 && grade <=100) {
			System.out.println("Grade:A " + grade);
		} else if (grade >= 80 && grade <=89) {
			System.out.println("Grade:B " + grade);
		} else if (grade >= 70 && grade <=79) {
			System.out.println("Grade:C " + grade);
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("Grade:D " + grade);
		} else if (grade < 60) {
			System.out.println("Grade:F: " + grade);
		} else if (grade < 0 || grade > 100) {
			System.out.println("Out of Range");
		}
//		scn.close();
		
	}
	
	//part6
	private static void part6() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in an Integer: ");
		int n = input.nextInt();
		switch(n) {
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thursday");
				break;
			case 5: 
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			case 7: 
				System.out.println("Sunday");
				break;
			default: 
				System.out.println("Out of Range");
				break;
		}
		input.close();
		
		
	}
	
}
