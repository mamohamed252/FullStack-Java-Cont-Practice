package com.perscholas.cafe;

public class Cappuccino extends Product {
	boolean peppermint;
	boolean whippedCream;
	
	public Cappuccino() {
		super();
	}
	
	public Cappuccino(String name, double price, String desc, boolean peppermint, boolean whippedCream) {
		super(name,price,desc);
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;
	}
	
	
	@Override
	public double calculateProductSubtotal() {
		double subtotal = this.getPrice();
		if (peppermint) {
			subtotal += 2;
		}
		if (whippedCream) {
			subtotal += 1;
		}
		subtotal *= this.getQuantity();
		
		System.out.println("Item name: " + this.getName());
		System.out.println("Item description: " + this.getDesc());
		System.out.println("Item quantity: " + this.getQuantity());
		System.out.printf("You spent $%.2f on cappuccinos\n", subtotal);
		return subtotal;
	}
	
	public boolean getPeppermint() {
		return this.peppermint;
	}
	
	public void setPeppermint(boolean bool) {
		this.peppermint = bool;
	}
	
	public boolean getWhippedCream() {
		return this.whippedCream;
	}
	
	public void setWhippedCream(boolean bool) {
		this.whippedCream = bool;
	}

}
