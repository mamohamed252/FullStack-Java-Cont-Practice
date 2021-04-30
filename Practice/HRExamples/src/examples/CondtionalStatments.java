package examples;

import java.util.Scanner;

public class CondtionalStatments {
/*
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
 */
	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("enter number");
		   int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        if (N % 2 != 0) {
	        	System.out.println("Weird");
			}else if (N%2!=1 && N > 20) {
				System.out.println("Not weird");
			}else if (N%2!=1 && N<20 && N > 5) {
				System.out.println("Weird");
			}else {
				System.out.println("Not weird");
			}
	        scanner.close();
	}

}
