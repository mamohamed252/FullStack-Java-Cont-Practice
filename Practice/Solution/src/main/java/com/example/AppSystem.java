package com.example;

import java.util.Map.Entry;

public class AppSystem extends TheSystem {
	AppSystem() {
	}

	@Override
	public void display() {
		// header for table.
		String sf1 = String.format("AppSystem Inventory:\n%-20s %-20s %-10s %-10s%n", "Name", "Description", "Price",
				"Available Quantity");
		System.out.print(sf1);
		for (Entry<String, Item> element : this.getItemCollection().entrySet()) {
			Item value = element.getValue();
			String sf2 = String.format("%-20s %-20s %-10.2f %-10d%n", value.getItemName(), value.getItemDesc(),
					value.getItemPrice(), value.getAvailableQuantity());
			System.out.print(sf2);
		}

	}

	@Override // this overwrites the parents class add method
	public Boolean add(Item item) {
		// if item is null then return null. If item already in collection, display message. 
		//if item is not in collection the method adds the item to collection and returns false.

		if (item == null) {
			return false;
		} else if (this.getItemCollection().containsKey(item.getItemName())) {
			System.out.println(item.getItemName() + "is already in the App System");
			return false;
		} else {
			this.getItemCollection().put(item.getItemName(), item);
			return true;
		}

	}

	public Item reduceAvailableQuantity(String item_name) {
	// method takes String itemName as a parameter, checks if the item is in the collection, if
		// it is, then it decreases the available quantity of the item in the system by 1 and returns
		// the item object. if the item is not in the collection then it returns null.
		boolean doesContain = this.getItemCollection().containsKey(item_name);
		
		if(doesContain) {
			Item itemObject = this.getItemCollection().get(item_name);
			int availableQuantity = itemObject.getAvailableQuantity();
			itemObject.setAvailableQuantity(availableQuantity - 1);
			if(itemObject.getAvailableQuantity() == 0) {
				this.getItemCollection().remove(item_name);
				return null;	
			}
			return itemObject;
		} else {
			return null;
		}
	}
}
