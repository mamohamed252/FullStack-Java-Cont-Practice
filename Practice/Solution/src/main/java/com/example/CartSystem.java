package com.example;

import java.util.Map.Entry;

public class CartSystem extends TheSystem {
	CartSystem() {
	}

	@Override
	public void display() {
		this.getItemCollection();
		// declared variables before for loop so they can be called in print statements
		// after iterations.
		double preTax = 0.0;
		double tax = 0.0;
		double total = 0.0;
		// header for table.
		String sfHeader = String.format("Cart:\n%-20s %-20s %-10s %-10s %-10s%n", "Name", "Description", "Price",
				"Quantity", "Sub Total");
		System.out.print(sfHeader);
		for (Entry<String, Item> element : this.getItemCollection().entrySet()) {
			Item value = element.getValue();
			double subTotal;
			subTotal = value.getItemPrice() * value.getQuantity();
			preTax += subTotal;
			String sf0 = String.format("%-20s %-20s %-10.2f %-10d %-10.2f%n", value.getItemName(), value.getItemDesc(),
					value.getItemPrice(), value.getQuantity(), subTotal);
			System.out.print(sf0);
		}
		tax = (preTax * 0.05);
		total = preTax + tax;
		// printed after for loop for price of sub-total, tax and total
		String sf1 = String.format("%-20s %-20.2f%n", "Pre-tax Total", preTax);
		String sf2 = String.format("%-20s %-20.2f%n", "Tax", tax);
		String sf3 = String.format("%-20s %-20.2f%n", "Total", total);
		System.out.print(sf1);
		System.out.print(sf2);
		System.out.print(sf3);
	}
}
