package com.example;

public class Item{
    
	// properties
	// requirement 1
	private String itemName;
	private String itemDesc;
	private double itemPrice;
	private int quantity;
	private int availableQuantity;
		
	// default constructor
    public Item() {
        // Your code here
    	this.quantity = 1;
    }
    // specified constructor
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
        // Your code here
    	this.itemName = itemName;
    	this.itemDesc = itemDesc;
    	this.itemPrice = itemPrice;
    	this.availableQuantity = availableQuantity;	
    }
    
    // getters and setters for items
    public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(int availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
    
    
    
    
    
    
}
