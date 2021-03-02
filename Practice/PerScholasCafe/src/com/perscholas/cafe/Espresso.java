package com.perscholas.cafe;

public class Espresso extends Product {
	boolean extraShot;
	boolean macchiato;
	
	public Espresso() {
		super();
	}
	
	public Espresso(String name, double price, String desc, boolean extraShot, boolean macchiato) {
		super(name,price,desc);
		this.extraShot = extraShot;
		this.macchiato = macchiato;
	}
	
	
	@Override
	public double calculateProductSubtotal() {
		double subtotal = this.getPrice();
		if (extraShot) {
			subtotal += 2;
		}
		if (macchiato) {
			subtotal += 1;
		}
		subtotal *= this.getQuantity();
		
		System.out.println("Item name: " + this.getName());
		System.out.println("Item description: " + this.getDesc());
		System.out.println("Item quantity: " + this.getQuantity());
		System.out.printf("You spent $%.2f on espressos\n", subtotal);
		return subtotal;
	}
	
	public boolean getExtraShot() {
		return this.extraShot;
	}
	
	public void setExtraShot(boolean bool) {
		this.extraShot = bool;
	}
	
	public boolean getMacchiato() {
		return this.macchiato;
	}
	
	public void setMacchiato(boolean bool) {
		this.macchiato = bool;
	}

}
