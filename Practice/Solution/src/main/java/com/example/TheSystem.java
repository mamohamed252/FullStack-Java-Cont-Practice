package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {
   
	private HashMap<String, Item> itemCollection;
	
    TheSystem() {
        // Your code here
    }
    
    public HashMap<String, Item> getItemCollection(){
        // Your code here
    }
    
    public Boolean checkAvailability(Item item) {
        // Your code here
    	if(item.getQuantity() >= item.getAvailableQuantity()) {
    		System.out.println("System is unable to add " + item.getItemName() + " to the card. System only has " + item.getAvailableQuantity() + " " + item.getItemName() + "s.");
    		return false;
    	}else {
    		return true;
    	}
    }
    
    public Boolean add(Item item) {
        // Your code here
    	if (item == null) {
			return false;
		} if(checkAvailability(item)) {
			item.setQuantity(item.getQuantity() + 1);
			return true;
		} if(checkAvailability(item)) {
			
			return true;
		}else {
			return false;
		}
    }

    public Item remove(String itemName) {
        // Your code here
    }

    public abstract void display();
}
