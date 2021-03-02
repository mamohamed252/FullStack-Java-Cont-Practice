package com.perscholas.java_basics;

import java.util.Iterator;

public class Loops {

	public static void main(String[] args) {
		part1();
		part2();
		part3();
		part4();
		part5();
		part6();

	}

	//part1 for loop
	private static void part1() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("Part 1: " + i);
		}
		
	}
	
	//part2 while loop
	private static void part2() {
		int i = 0;
		while(i<=100) {
			System.out.println("Part 2 " + i);
			i = i + 10;
		}
	}
	
	//part3 do while loop
	private static void part3() {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		
	}
	
	//part4 for loop with extra conditions
	private static void part4() {
		for(int i = 0; i <=100; i++) {
			if(i >= 25 && i <= 75) {
				continue;
			}if (i % 5 ==0) {
			System.out.println("Part 4: " + i);
			}
		}
	}
	
	//part5
	private static void part5() {
		for(int i = 0; i <=100; i++) {
			if(i > 50) {
				break;
			}if (i % 5 ==0) {
			System.out.println("Part 5: " + i);
			}
		}
		
	}
	
	//part6 nested loops
	private static void part6() {
		for (int i = 1; i <= 2; i++) {
			System.out.println("Week " + i);
			for(int j = 1; j <= 5; j++) {
				System.out.println("Part 6: Day " + j);
			}	
		}		
	}

}
