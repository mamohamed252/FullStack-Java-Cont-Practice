package com.perscholas.java_basics;

public class main {

	public static void main(String[] args) {
		integerPractice();
		doublePractice();
		part3();
		part4();
		part5();
		part6();
		part7();
		part8();
	}

	//part 1
	private static void integerPractice() {
		int num1 = 10;
		int num2 = 5;
		
		int sum = num1 + num2;
		System.out.println(sum);
		
	}
	
	//part 2
	private static void doublePractice() {
		double num1 = 2;
		double num2 = 4;
		double sum = num1 + num2;
		System.out.println(sum);
	}
	
	//part3
	private static void part3() {
		int num1 = 20;
		double num2 = 5;
		double sum = num1 + num2;
		System.out.println(sum);
		
	}
	
	//part4
	private static void part4() {
		int num1 = 100;
		int num2 = 2;
		int output = num1/num2;
		System.out.println(output);
		
	}
	
	//part5
	private static void part5() {
		double num1 = 200;
		double num2 = 5;
		double output = num1/num2;
		System.out.println(output);
	}
	
	//part6
	private static void part6() {
		int x = 5;
		int y = 6;
		int q = x;
		System.out.println("this is q: " + q);
		double z = y;
//		q = z; //will throw an error since q is already an int.
		System.out.println("this is z as a double: " + z);
	}
	
	private static void part7() {
		final int NUM1 = 10;
		int output = NUM1 * 7;
		System.out.println(output);
		
	}
	
	//part8
	private static void part8() {
		double coffee = 4;
		double greenTea= 3;
		double espresso= 3.50;
		
		double subTotal= (coffee * 3) + (greenTea * 4) + (espresso * 2);
		//totalSale with salesTax;
		final double SALES_TAX= .055;
		double totalSale = subTotal + (SALES_TAX * subTotal);
		System.out.println("Total Order: " + totalSale);
		System.out.printf("Total Sale is = %.2f", totalSale);
		
	}


}
