package com.perscholas.cafe;

public abstract class Product {
	private String name;
	private double price;
	private String desc;
	private int quantity;
	
	public Product() {
	}
	
	public Product(String name, double price, String desc) {
		this.name = name;
		this.price = price;
		this.desc = desc;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public abstract double calculateProductSubtotal();
	
}
