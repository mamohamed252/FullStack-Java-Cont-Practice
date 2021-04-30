package examples;

import java.util.Scanner;

public class DataTypes {
	/*
	 * Complete the code in the editor below. The variables , , and are already
	 * declared and initialized for you. You must: Declare variables: one of type
	 * int, one of type double, and one of type String. Read lines of input from
	 * stdin (according to the sequence given in the Input Format section below) and
	 * initialize your variables. Use the operator to perform the following
	 * operations: Print the sum of plus your int variable on a new line. Print the
	 * sum of plus your double variable to a scale of one decimal place on a new
	 * line. Concatenate with the string you read as input and print the result on a
	 * new line.
	 */
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner sc = new Scanner(System.in);

		int in = Integer.parseInt(sc.nextLine());
		double dou = Double.parseDouble(sc.nextLine());
		String st = sc.nextLine();

		System.out.println(in + i);
		System.out.println(dou + d);
		System.out.println(s + st);
		 sc.close();

	}

}
