package com.perscholas.cafe;

public class Coffee extends Product {
	boolean sugar;
	boolean milk;
	
	public Coffee() {
		super();
	}
	
	public Coffee(String name, double price, String desc, boolean s, boolean m) {
		super(name,price,desc);
		this.sugar = s;
		this.milk = m;
	}
	
	
	@Override
	public double calculateProductSubtotal() {
		double subtotal = this.getPrice() * this.getQuantity();
		System.out.println("Item name: " + this.getName());
		System.out.println("Item description: " + this.getDesc());
		System.out.println("Item quantity: " + this.getQuantity());
		System.out.printf("You spent $%.2f on coffee\n", subtotal);
		return subtotal;
	}
	
	public boolean getSugar() {
		return this.sugar;
	}
	
	public void setSugar(boolean bool) {
		this.sugar = bool;
	}
	
	public boolean getMilk() {
		return this.milk;
	}
	
	public void setMilk(boolean bool) {
		this.milk = bool;
	}

}
