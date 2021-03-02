package com.perscholas.cafe;

import java.util.Scanner;

public class CafeApp {
	private static final double SALES_TAX = 0.07;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double coffeeSubtotal = 0;
		double espressoSubtotal = 0;
		double cappuccinoSubtotal = 0;
		double subtotal = 0;
		
		String milkString;
		String sugarString;
		boolean wantMilk = false;
		boolean wantSugar = false;
		
		String extraShotString;
		String macchiatoString;
		boolean wantExtraShot = false;
		boolean wantMacchiato = false;
		
		String peppermintString;
		String whippedCreamString;
		boolean wantPeppermint = false;
		boolean wantWhippedCream = false;
		
		System.out.println("Welcome to our cafe. May I take your order please?");
		
		System.out.println("How many coffees would you like?");
		int numCoffee = sc.nextInt();
		
		//Only ask if they want coffee
		if (numCoffee > 0) {
			System.out.println("Would you like milk in your coffee? enter y for yes, n for no");
			milkString = sc.next();
			
			if(milkString.equals("y")) {
				wantMilk = true;
			}
			
			System.out.println("Would you like sugar in your coffee? enter y for yes, n for no");
			sugarString = sc.next();
			
			if(sugarString.equals("y")) {
				wantSugar = true;
			}
			
			Product coffee = new Coffee("Coffee", 3.50, "Classic cup'o Joe", wantSugar, wantMilk);
			coffee.setQuantity(numCoffee);
			coffeeSubtotal = coffee.calculateProductSubtotal();
			subtotal += coffeeSubtotal;
		}
		
		System.out.println("How many Espressos would you like?");
		int numEspresso = sc.nextInt();
		
		//Only ask if they want espressos
		if (numEspresso > 0) {
			System.out.println("Would you like an extra shot of espresso? enter y for yes, n for no");
			extraShotString = sc.next();
			
			if(extraShotString.equals("y")) {
				wantExtraShot = true;
			}
			
			System.out.println("Would you like your espressos macchiato style? enter y for yes, n for no");
			macchiatoString = sc.next();
			
			if(macchiatoString.equals("y")) {
				wantMacchiato = true;
			}
			
			Product espresso = new Espresso("Espresso", 4.50, "Hearty espresso for big energy boost", wantExtraShot, wantMacchiato);
			espresso.setQuantity(numEspresso);
			espressoSubtotal = espresso.calculateProductSubtotal();
			subtotal += espressoSubtotal;
		}
		
		System.out.println("How many Cappuccinos would you like?");
		int numCappuccino = sc.nextInt();
		
		//Only ask if they want Cappuccinos
		if (numCappuccino > 0) {
			System.out.println("Would you like peppermint in your cappuccino? enter y for yes, n for no");
			peppermintString = sc.next();
			
			if(peppermintString.equals("y")) {
				wantPeppermint = true;
			}
			
			System.out.println("Would you like whipped cream in your cappucino? enter y for yes, n for no");
			whippedCreamString = sc.next();
			
			if(whippedCreamString.equals("y")) {
				wantWhippedCream = true;
			}
			
			Product cappuccino = new Cappuccino("Cappuccino", 5.00, "Artisan cappuccino crafted by our artists", wantPeppermint, wantWhippedCream);
			cappuccino.setQuantity(numCappuccino);
			cappuccinoSubtotal = cappuccino.calculateProductSubtotal();
			subtotal += cappuccinoSubtotal;
		}
		
		System.out.printf("Subtotal: $%.2f \n", subtotal);
		System.out.printf("Tax: $%.2f \n", (subtotal * SALES_TAX));
		System.out.printf("Sales Total: $%.2f \n", (subtotal + (subtotal*SALES_TAX)));
		
		
		
		sc.close();

	}

}
