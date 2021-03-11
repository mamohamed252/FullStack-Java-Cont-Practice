package com.perscholas.cafe;

public class Product {

	String name, desc;
	double price;
	int quantity; 
	
	// default constructor
	Product(){
		
	}
	//constructor with parameters
	Product(String name, double price, String desc){
		this.name = name;
		this.price = price;
		this.desc = desc;
		
	}
	public double calculateProductTotal() {
		double total;
		total = this.getQuantity() * this.getPrice();
		return total;
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
