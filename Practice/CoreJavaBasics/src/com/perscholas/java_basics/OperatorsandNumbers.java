package com.perscholas.java_basics;

public class OperatorsandNumbers {

	public static void main(String[] args) {
		binaryNotation();
		part2();
		part3(9);
		part3(17);
		part3(88);
		part4(150);
		part4(225);
		part4(1555);
		part4(32456);
		part5();
		part6();
		part7();
		part8();
	}

	private static void binaryNotation( ) {
		//part1
		//hard coding integers to binary
		System.out.println("1 = 0001");
		System.out.println("8 = 1000");
		System.out.println("33 = 100001");
		System.out.println("78 = 1001110");
		System.out.println("787 = 1100010011");
		System.out.println("33987 = 1000010011000011");
		
		//process of converting integers to binary
		//if using the below process, add in 'int n' as a parameter in the the private static void binaryNotation(),
		//then in the main method, pass in what you want n to be however many times you want.
		//ex-binaryNotation(1); binaryNotation(8); etc
		
		//checking if hard coded binary conversion is correct:
/*		int n = 33987;
		String result = " ";
		while(n > 0) {
			result = n % 2 + result;
			n = n/2;
		}
		System.out.println("This is the result using a method: " + result);
*/		
	}
	
	//part 2
	private static void part2() {
		// converting binary to decimal
		System.out.println("0010 = 2");
		System.out.println("1001 = 9");
		System.out.println("0011 0100 = 52");
		System.out.println("0111 0010 = 114");
		System.out.println("0010 0001 1111 = 543");
		System.out.println("0010 1100 0110 0111 = 11367");
		
		//checking if the above is correct
		String binaryString = "1001";
		int result = Integer.parseInt(binaryString, 2);
		System.out.println("Converting binary to decimal using method: " + result);
		
	}

	//part3 left shift <<=
	private static void part3(int i) {
		int x = i;
		System.out.println(Integer.toBinaryString(x));
		x <<= 2;
		System.out.println(x + " " + Integer.toBinaryString(x) + "\n");
		
	}

	//part4 right shift >>=
	private static void part4(int i) {
		int x = i;
		System.out.println(Integer.toBinaryString(x));
		x >>= 2;
		System.out.println(x + " " + Integer.toBinaryString(x) + "\n");
		
	}

	//part 5 using bitwise & and |
	private static void part5() {
		int x = 7;
		int y = 17;
		int z = x & y;
		System.out.println(z + " " + Integer.toBinaryString(z) + "\n");
		z = x | y;
		System.out.println(z + " " + Integer.toBinaryString(z) + "\n");
		
	}
	
	//part6
	private static void part6() {
		int a = 1;
		System.out.println(a++);
		System.out.println("after postfix: " + a);
		
	}
	
	//part7
	private static void part7() {
		int b = 5;
		System.out.println("this is b: " + b);
		b++;
		System.out.println("this is b++: " + b);
		b = b + 1;
		System.out.println("this is b+1: " + b);
		b+= 1;
		System.out.println("this is b+=1: " + b);
	
	}
	
	//part8
	private static void part8() {
		int x = 5;
		int y = 8;
		int sum = ++x + y;
		System.out.println("prefix sum: " + sum);
		sum = x++ + y;
		System.out.println("postfix: " + sum);
	}

}
