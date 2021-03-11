package com.perscholas.cafe;

import java.util.Scanner;

public class CaféApp {

	public static void main(String[] args) {
		
		Product coffee = new Product("Coffee", 4.29, "dark-roast coffee");
		Product espresso = new Product("espresso", 5.29, "espresso with high sugar");
		Product cappuccino = new Product("cappuccino", 4.69, "yummy w/ cream and foam");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many coffee you want, playa?");
		coffee.setQuantity(sc.nextInt());
		System.out.printf("%-20s|%-40s|%-10.2f%n", coffee.getName(), coffee.desc, coffee.calculateProductTotal() );
		System.out.println("How many espresso you want, boss?");
		espresso.setQuantity(sc.nextInt());
		System.out.printf("%-20s|%-40s|%-10.2f%n", espresso.getName(), espresso.getDesc(), espresso.calculateProductTotal());
		System.out.println("How many cappuccino you want, brah?");
		cappuccino.setQuantity(sc.nextInt());
		System.out.printf("%-20s|%-40s|%-10.2f%n", cappuccino.getName(), cappuccino.getDesc(), cappuccino.calculateProductTotal());
		
		/*sales subtotal 
		 *sales tax
		 *and sales total*/
		
		double pretaxSub, taxTotal, salesTotal;
		pretaxSub = coffee.calculateProductTotal() + espresso.calculateProductTotal() + cappuccino.calculateProductTotal();
		taxTotal = pretaxSub * .06;
		salesTotal = pretaxSub + taxTotal;
		System.out.printf("Sales Subtotal: %-10.2f%nSales Tax: %-10.2f%nSales Total: %-10.2f", pretaxSub, taxTotal, salesTotal);
	
	}

}
