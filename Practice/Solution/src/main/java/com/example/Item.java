package com.example;

public class Item{
    
	// properties
	// requirement 1
	private String itemName;
	private String itemDesc;
	private Double itemPrice;
	private Integer quantity;
	private Integer availableQuantity;
		
	// default constructor
    public Item() {
    	this.quantity = 1;
    }
    
    // specified constructor
    public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
    	this.quantity = 1;
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

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getAvailableQuantity() {
		return availableQuantity;
	}

	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemDesc=" + itemDesc + ", itemPrice=" + itemPrice + ", quantity="
				+ quantity + ", availableQuantity=" + availableQuantity + "]";
	}
	
	
    
    
}
